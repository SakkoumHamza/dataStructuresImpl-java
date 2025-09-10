package com.hamza;

import java.util.IllformedLocaleException;
import java.util.LinkedList;
import java.util.Map;

public class HashTable {
    private int key;
    private String value;
    private LinkedList<Entry>[] entries = new LinkedList[5];

    private class Entry {
        int key;
        String value;
        public Entry(int key, String value) {
            this.value = value;
            this.key = key;
        }
    }

    public int hashFunction(int key) {
        return key % entries.length;
    }

    public void put(int key, String value) {
        int index = hashFunction(key);
//      Check if the linked list of the index isn't initialised
        if (entries[index] == null)
            entries[index] = new LinkedList<>();
        var bucket = entries[index];
//       Check if are duplicates
        for (Entry e : bucket) {
            if (e.key == key)
                e.value = value;
        }
        bucket.addLast(new Entry(key, value));
    }

    public Entry get (int key){
        int index = hashFunction(key);
        var bucket = entries[index];
        if (bucket != null)
            for (Entry e : bucket) {
                if (e.key == key)
                    return e;
            }
        return null;
    }
    public void remove (int key){
        int index = hashFunction(key);
        var bucket = entries[index];
        if (bucket != null)
            for (Entry e : bucket) {
                if (e.key == key){
                    bucket.remove(key);
                    break;
                }
            }
        else throw new IllformedLocaleException();
    }
}
