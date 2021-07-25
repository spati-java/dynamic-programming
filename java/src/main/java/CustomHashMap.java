import java.util.Arrays;

public class CustomHashMap<K, V> {

   private int SIZE = 10;

   private Entry<K,V> [] table;

    CustomHashMap(){
        this.table = new Entry[SIZE];

    }

    public void put(K key, V value) {

        int hash = key.hashCode() % this.SIZE;

        Entry<K,V> entry = this.table[hash];

        if(entry == null) {
            Entry<K,V> newEntry = new Entry<K,V>(key,value);
            this.table[hash] = newEntry;
            return;
        }

        if(entry.key.equals(key)) {
            entry = new Entry<>(key,value);
            this.table[hash] = entry;

            return;
        }

        // handle collision;

        while(entry.next != null){
            entry = entry.next;
        }
        entry.next = new Entry(key,value);

    }


    public V getValue(K key) {

        int hash = key.hashCode() % this.SIZE;

        Entry<K, V> entry = this.table[hash];

        if(entry == null)
            return null;

        if(entry.next == null)
            return entry.getValue();

        while(entry.next != null){

            if(entry.key.equals(key))
                return entry.getValue();
            entry = entry.next;
        }

        return entry.getValue();
    }

}


class Entry<K, V> {

    K key;

    V value;
    public Entry next;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}

class Driver {

    public static void main(String[] args) {

        CustomHashMap customHashMap = new CustomHashMap();
        customHashMap.put("AB", "Sourav");
        customHashMap.put("BA", "Bholu");

        System.out.println(customHashMap.getValue("BA"));


    }
}


