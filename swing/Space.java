import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;



/**
 * The game's main class is Space
 */
public class Space {
    // Width and height of the game field
    private int width;
    private int height;

    // Spaceship
    private Spaceship ship;
    // List of UFOs
    private List<Ufo> ufos = new ArrayList<Ufo>();
    // List of bombs
    private List<Bomb> bombs = new ArrayList<Bomb>();
    // List of rockets
    private List<Rocket> rockets = new ArrayList<Rocket>();

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * The program's main loop.
     * This is where all the important actions happen
     */
    public void run() {
        // Create a drawing canvas.
        Canvas canvas = new Canvas(width, height);

        // Create a KeyboardObserver object and start it.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        // The game continues as long as the ship is alive
        while (ship.isAlive()) {
            // Does the observer have any key events?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                // If "left arrow", then move the game piece to the left
                System.out.print(event.getKeyCode());
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    ship.moveLeft();
                    // If "right arrow", then move the game piece to the right
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    ship.moveRight();
                    // If "space", then launch a ball
                else if (event.getKeyCode() == KeyEvent.VK_SPACE)
                    ship.fire();
            }

            // Move all of the objects in the game
            moveAllItems();

            // Detect collisions
            checkBombs();
            checkRockets();
            // Remove dead objects from the list
            removeDead();

            // Create a UFO (once in every 10 calls)
            createUfo();

            // Draw all the objects on the canvas and display the canvas on the screen
            canvas.clear();
            draw(canvas);
            canvas.print();

            // Pause 300 milliseconds
            Space.sleep(300);
        }

        // Display "Game Over"
        System.out.println("Game Over!");
    }

    /**
     * Move all of the objects in the game
     */
    public void moveAllItems() {
        for (BaseObject object : getAllItems()) {
            object.move();
        }
    }

    /**
     * The method returns a single list that contains all objects in the game
     */
    public List<BaseObject> getAllItems() {
        ArrayList<BaseObject> list = new ArrayList<BaseObject>(ufos);
        list.add(ship);
        list.addAll(bombs);
        list.addAll(rockets);
        return list;
    }

    /**
     * Create a new UFO. Once in every 10 calls.
     */
    public void createUfo() {
        if (ufos.size() > 0) return;

        int random10 = (int) (Math.random() * 10);
        if (random10 == 0) {
            double x = Math.random() * width;
            double y = Math.random() * height / 2;
            ufos.add(new Ufo(x, y));
        }
    }

    /**
     * Check the bombs.
     * a) collision with a ship (the bomb and the ship die)
     * b) movement beyond the bottom of the game field (the bomb dies)
     */
    public void checkBombs() {
        for (Bomb bomb : bombs) {
            if (ship.intersects(bomb)) {
                ship.die();
                bomb.die();
            }

            if (bomb.getY() >= height)
                bomb.die();
        }
    }

    /**
     * Check the rockets.
     * a) collision with a UFO (the rocket and the UFO die)
     * b) movement beyond the top of the playing field (the rocket dies)
     */
    public void checkRockets() {
        for (Rocket rocket : rockets) {
            for (Ufo ufo : ufos) {
                if (ufo.intersects(rocket)) {
                    ufo.die();
                    rocket.die();
                }
            }

            if (rocket.getY() <= 0)
                rocket.die();
        }
    }

    /**
     * Remove dead objects (bombs, rockets, ufos) from the lists
     */
    public void removeDead() {
        for (BaseObject object : new ArrayList<BaseObject>(bombs)) {
            if (!object.isAlive())
                bombs.remove(object);
        }

        for (BaseObject object : new ArrayList<BaseObject>(rockets)) {
            if (!object.isAlive())
                rockets.remove(object);
        }

        for (BaseObject object : new ArrayList<BaseObject>(ufos)) {
            if (!object.isAlive())
                ufos.remove(object);
        }
    }

    /**
     * Draw all game objects:
     * a) fill the entire canvas with periods.
     * b) draw all the objects on the canvas.
     */
    public void draw(Canvas canvas) {
        // Draw the game
        for (int i = 0; i < width + 2; i++) {
            for (int j = 0; j < height + 2; j++) {
                canvas.setPoint(i, j, '.');
            }
        }

        for (int i = 0; i < width + 2; i++) {
            canvas.setPoint(i, 0, '-');
            canvas.setPoint(i, height + 1, '-');
        }

        for (int i = 0; i < height + 2; i++) {
            canvas.setPoint(0, i, '|');
            canvas.setPoint(width + 1, i, '|');
        }

        for (BaseObject object : getAllItems()) {
            object.draw(canvas);
        }
    }


    public Spaceship getShip() {
        return ship;
    }

    public void setShip(Spaceship ship) {
        this.ship = ship;
    }

    public List<Ufo> getUfos() {
        return ufos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<Bomb> getBombs() {
        return bombs;
    }

    public List<Rocket> getRockets() {
        return rockets;
    }

    public static Space game;

    public static void main(String[] args) throws Exception {
        game = new Space(20, 20);
        game.setShip(new Spaceship(10, 18));
        game.run();
    }

    /**
     * The method pauses for delay seconds.
     */
    public static void sleep(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
        }
    }
}


/**
 * The base class for all game objects.
 */
abstract class BaseObject {
    // Coordinates
    protected double x;
    protected double y;
    // Object radius
    protected double radius;
    // Indicates whether the object is alive
    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * This method draws the object on the canvas.
     */
    public void draw(Canvas canvas) {
        // Do nothing
    }

    /**
     * Move by one step.
     */
    public void move() {
        // Do nothing
    }

    /**
     * Check whether (x, y) is beyond the borders.
     */
    public void checkBorders(double minx, double maxx, double miny, double maxy) {
        if (x < minx) x = minx;
        if (x > maxx) x = maxx;
        if (y < miny) y = miny;
        if (y > maxy) y = maxy;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void die() {
        isAlive = false;
    }

    /**
     * Check whether the passed object (o) and the object (this) intersect.
     */
    public boolean intersects(BaseObject o) {
        double dx = x - o.x;
        double dy = y - o.y;
        double destination = Math.sqrt(dx * dx + dy * dy);
        double destination2 = Math.max(radius, o.radius);
        return destination <= destination2;
    }
}


/**
 * Bomb class
 */
class Bomb extends BaseObject {
    public Bomb(double x, double y) {
        super(x, y, 1);
    }

    /**
     * Draw the object on the canvas.
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'B');
    }

    /**
     * Move the object down by one step.
     */
    @Override
    public void move() {
        y++;
    }
}


class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }

    public void clear() {
        this.matrix = new char[height + 2][width + 2];
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    setPoint(x + j, y + i, c);
                }
            }
        }
    }

    public void setPoint(double x, double y, char c) {
        int xRounded = (int) Math.round(x);
        int yRounded = (int) Math.round(y);
        if (xRounded >= 0 && xRounded < matrix[0].length && yRounded >= 0 && yRounded < matrix.length) {
            matrix[yRounded][xRounded] = c;
        }
    }

    public void print() {
        System.out.println();

        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                System.out.print(" ");
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}


class KeyboardObserver extends Thread {
    private Queue<KeyEvent> keyEvents = new ArrayBlockingQueue<KeyEvent>(100);

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("KeyPress Tester");
        frame.setTitle("Transparent JFrame Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setUndecorated(true);
        frame.setSize(400, 400);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new GridBagLayout());

        frame.setOpacity(0.0f);
        frame.setVisible(true);

        frame.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Do nothing
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.exit(0);
            }
        });


        frame.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {
                // Do nothing
            }

            public void keyReleased(KeyEvent e) {
                // Do nothing
            }

            public void keyPressed(KeyEvent e) {
                keyEvents.add(e);
            }
        });
    }


    public boolean hasKeyEvents() {
        return !keyEvents.isEmpty();
    }

    public KeyEvent getEventFromTop() {
        return keyEvents.poll();
    }
}

/**
 * Rocket class
 */
 
 
class Rocket extends BaseObject {

    public Rocket(double x, double y) {
        super(x, y, 1);
    }

    /**
     * This method draws the object on the canvas.
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'R');
    }

    /**
     * Move the object up by one step.
     */
    @Override
    public void move() {
        y--;
    }
}

/**
 * Spaceship class
 */
class Spaceship extends BaseObject {
    // Picture to draw the ship
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1},
    };

    // movement vector (-1 — left, +1 — right)
    private double dx = 0;

    public Spaceship(double x, double y) {
        super(x, y, 3);
    }

    /**
     * Set the movement vector to move left
     */
    public void moveLeft() {
        dx = -1;
    }

    /**
     * Set the movement vector to move right
     */
    public void moveRight() {
        dx = 1;
    }

    /**
     * This method draws the object on the canvas.
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y - radius + 1, matrix, 'M');
    }

    /**
     * Move by one step.
     * Check for collision with the edges.
     */
    @Override
    public void move() {
        x = x + dx;

        checkBorders(radius, Space.game.getWidth() - radius + 1, 1, Space.game.getHeight() + 1);
    }

    /**
     * We're shooting.
     * Create two rockets: on the left and right of the ship.
     */
    public void fire() {
        Space.game.getRockets().add(new Rocket(x - 2, y));
        Space.game.getRockets().add(new Rocket(x + 2, y));
    }
}


/**
 * Ufo class
 */
class Ufo extends BaseObject {
    // Picture for drawing
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 1, 1, 1, 1},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
    };

    public Ufo(double x, double y) {
        super(x, y, 3);
    }

    /**
     * This method draws the object on the canvas.
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y - radius + 1, matrix, 'U');
    }

    /**
     * Move the object by one step in a random direction.
     */
    @Override
    public void move() {
        double dx = Math.random() * 2 - 1;
        double dy = Math.random() * 2 - 1;

        x += dx;
        y += dy;

        checkBorders(radius, Space.game.getWidth() - radius + 1, radius - 1, Space.game.getHeight() / 2 - 1);

        int random10 = (int) (Math.random() * 10);
        if (random10 == 0)
            fire();
    }

    /**
     * We're shooting.
     * Drop (create) one bomb directly below.
     */
    public void fire() {
        Space.game.getBombs().add(new Bomb(x, y + 3));
    }
}