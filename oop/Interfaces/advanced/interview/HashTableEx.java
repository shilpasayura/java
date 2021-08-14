class HashTable<K, V> {
 
    private static final int SIZE = 10;

    private static class HashEntry<K, V> {

        K key;
        V value;

        HashEntry<K, V> next;

        HashEntry(K k, V v) {
            this.key = k;
            this.value = v;
            this.next = null;
        }

        @Override
        public String toString() {
            return "HashEntry{" + "key=" + key + ", value=" + value + ", next=" + next + '}';
        }

    }

    private final HashEntry[] entries = new HashEntry[SIZE];

    public void put(K key, V value) {

        int hash = getHash(key);
        
        final HashEntry hashEntry = new HashEntry(key, value);

        if (entries[hash] == null) {
            entries[hash] = hashEntry;
        } else { // collision => chaining
            HashEntry currentEntry = entries[hash];
            while (currentEntry.next != null) {
                currentEntry = currentEntry.next;
            }

            currentEntry.next = hashEntry;
        }
    }

    public V get(K key) {

        int hash = getHash(key);
        
        if (entries[hash] != null) {
            HashEntry currentEntry = entries[hash];

            // Check the entry linked list for matching the given 'key'
            while (currentEntry != null) {                

                if (currentEntry.key.equals(key)) {
                    return (V) currentEntry.value;
                }
                
                currentEntry = currentEntry.next;
            }
        }

        return null;
    }

    private int getHash(K key) {        
        return Math.abs(key.hashCode() % SIZE);
    }    
}

public class HashTableEx {

    public static void main(String[] args) {

        HashTable hashTable = new HashTable();

        // Put some key-value
        hashTable.put("ana", "ana".toUpperCase());
        hashTable.put("carina", "carina".toUpperCase());
        hashTable.put("bob", "bob".toUpperCase());
        hashTable.put("leo", "leo".toUpperCase());
        hashTable.put("maria", "maria".toUpperCase());
        hashTable.put(5, "FIVE");
        hashTable.put(10, "TEN");

        // The following keys should exists
        System.out.println("Get(ana): " + hashTable.get("ana"));        
        System.out.println("Get(carina): " + hashTable.get("carina"));
        System.out.println("Get(bob): " + hashTable.get("bob"));
        System.out.println("Get(leo): " + hashTable.get("leo"));
        System.out.println("Get(maria): " + hashTable.get("maria"));
        System.out.println("Get(5): " + hashTable.get(5));
        System.out.println("Get(10): " + hashTable.get(10));
        
        // The following two keys should not exists
        System.out.println("Get(anna): " + hashTable.get("anna"));
        System.out.println("Get(15): " + hashTable.get(15));               
    }
}
