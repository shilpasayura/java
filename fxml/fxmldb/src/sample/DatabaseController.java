package sample;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseController {
    private static final Logger LOGGER = Logger.getLogger(DatabaseController.class.getName());

    private static Connection connection = null;
    private static final String driver = "org.sqlite.JDBC";
    private static final String URL = "jdbc:sqlite:notes.db";

    private static final String NOTES_TABLE_NAME = "NOTES";
    public static Connection getConnection() throws SQLException {
         //creates the db if no db found
        if (connection == null) {
            LOGGER.info("Database connection is null, creating connection...");
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(URL);
            } catch (ClassNotFoundException e) {
                throw new SQLException("Failed to connect to database");
            }

            if (!databaseHasTables()) {
                LOGGER.info("Database is empty, creating tables...");
                createTables();
            }
        }
        return connection;
    }

    private static boolean databaseHasTables() {
        var tableNotesExist = false;
        try {
            var rs  = getConnection().getMetaData().getTables(null, null, NOTES_TABLE_NAME, null);
            while (rs.next()) {
                var tName = rs.getString("TABLE_NAME");
                if (tName != null && tName.equals(NOTES_TABLE_NAME)) {
                    LOGGER.info("Table NOTES exist");
                    tableNotesExist = true;
                    break;
                }
            }
        } catch (Exception e) {
            LOGGER.warning("Failed to check if tables exist");
            e.printStackTrace();
        }
        return (tableNotesExist);
    }

    private static void createTables() throws SQLException {

        var notesTable = "CREATE TABLE IF NOT EXISTS NOTES (" + " ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " TITLE TEXT NOT NULL, CONTENT BLOB, " + " PRIORITY INTEGER DEFAULT 0) ";

        var notesTableStatement = getConnection().createStatement();
        notesTableStatement.execute(notesTable);
        LOGGER.info("Created notes table.");
    }

    public static boolean write(String sql) {
        PreparedStatement psmt = null;
        boolean success=false;
        try {
            psmt = getConnection().prepareStatement(sql);
            psmt.executeUpdate();
            success=true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                psmt.close();
                getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return success;
    }
}