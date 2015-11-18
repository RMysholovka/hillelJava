package HomeWork.myHashSet;

import java.util.LinkedList;
import java.util.Arrays;

/**
 * Created by ${Roman} on 08.11.2015.
 */
public class HashTable {

    private static int DEFAULT_TABLE_SIZE = 10;
    private LinkedList[] table = new LinkedList[DEFAULT_TABLE_SIZE];

    public void put(Object key, Object value) {
        int index = Math.abs(key.hashCode()) % DEFAULT_TABLE_SIZE;

        LinkedList linkedList = table[index];
        if (linkedList == null) {
            linkedList = new LinkedList();
        }

        Entry entryToAdd = new Entry(key, value);
        if (linkedList.contains(entryToAdd)) {
            linkedList.add(entryToAdd);
        }

        table[index] = linkedList;
    }

    public Object get(Object key) {
        int index = Math.abs(key.hashCode()) % DEFAULT_TABLE_SIZE;
        LinkedList list = table[index];
        if (list == null) return null;
        for (Object entryFromList : list) {
            Entry entry = (Entry) entryFromList;
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static class Entry {

        private Object key;
        private Object value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashTable hashTable = (HashTable) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(table, hashTable.table);

    }

    @Override
    public int hashCode() {
        return table != null ? Arrays.hashCode(table) : 0;
    }

    @Override
    public String toString() {


        return "HashTable{";
    }


    public static void main(String[] args) {

     /*   Student ivanov =
                new Student(2,"Ivanov", new  int[]{5,5,4});
        HashTable table = new HashTable();
        table.put(ivanov, 100);
        table.put(ivanov, 100);

           System.out.println(ivanov.hashCode());

        System.out.println(table);
        ivanov.getMarks()[0]=2;
        Object gotFromTable = (Integer)table.get(ivanov);
        System.out.println(gotFromTable);

        table.put(ivanov, 100);
        System.out.println(table);
    }*/
    }
}


