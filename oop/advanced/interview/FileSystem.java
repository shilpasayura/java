
import java.time.Instant;

import java.util.ArrayList;
import java.util.List;
 
abstract class Item {

    protected long created;
    protected long updated;
    protected long accessed;
    protected String name;
    protected Directory parent;

    public Item(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
        this.created = Instant.now().toEpochMilli();
        this.updated = created;
        this.accessed = created;
    }

    public boolean delete() {
        if (parent == null) {
            return false;
        }
        
        return parent.deleteItem(this);
    }

    public String getFullPath() {
        if (parent == null) {
            return name;
        } else {
            return parent.getFullPath() + "/" + name;
        }
    }
    
    public String rename(String newName) {
        this.name = newName;
        
        return newName;
    }

    public abstract long size();
}

class File extends Item {
 
    private String content;
    private int size;
    
    public File(String name, Directory parent) {

        super(name, parent);
    }

    @Override
    public long size() {
        return size;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    public void setContent(String content) {}

    public String getContent() {
        return content;
    }
}


class Directory extends Item {

    protected List<Item> items;
    
    public Directory(String name, Directory parent) {

        super(name, parent);

        items = new ArrayList<>();        
    }

    @Override
    public long size() { return 0; }
        
    public int countFiles() { return 0; }

    protected boolean deleteItem(Item item) { return false; }
    protected void addEntry(Item item) {}
    protected List<Item> getItems() { return null; }
}

public class FileSystem {

    public static void main(String[] args) {
        
        /*
        D:/
         |
         ----Docs
         |      |
         |      ----summer.txt
         |      ----winter.txt
         ----Today   
                |
                ----spring.txt 
        */
        
        Directory root = new Directory("D", null);
        Directory docs = new Directory("Docs", root);
        Directory today = new Directory("Today", root);
        
        File doc1 = new File("summer.txt", docs);
        File doc2 = new File("winter.txt", docs);
        File doc3 = new File("spring.txt", today);
        
        doc1.setContent("This is a summer doc");
        doc2.setContent("This is a winter doc done last year");
        doc3.setContent("This is a spring doc done today");
        
        System.out.println("D root full path: " + root.getFullPath());
        System.out.println("Docs directory full path: " + docs.getFullPath());
        System.out.println("doc3.txt file full path: " + doc3.getFullPath());
    }

}
