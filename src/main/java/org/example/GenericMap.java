package org.example;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class GenericMap<K, V> {


    private transient int size;
    private LinkedList<Node>[] buckets;
    private float loadFactor = 0.75f;

    public GenericMap() {
        init(16);
        size = 0;
    }
    public void init(int n) {
        buckets = new LinkedList[n];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean put(K key, V value) {
        final int hashCode = Math.abs(value.hashCode()) % buckets.length;
        final LinkedList<Node> linkedList = buckets[hashCode];
        for (Node node : linkedList) {
            if (node.key.equals(key)) {
                node.value = value;
                return true;
            }
        }
        linkedList.add(new Node(key, value));
        size++;
        if (((float)size / buckets.length) > loadFactor) {
            System.out.println("Rehashing!");
            LinkedList<Node>[] old = buckets;
            init(old.length * 2);
            this.size = 0;

            for (LinkedList<Node> nodes : old) {
                for (Node node : nodes) {
                    put(node.key, node.value);
                }
            }
        }
        return true;
    }



    public class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        GenericMap<Integer, String> ma = new GenericMap<>();
       while (true) {
           for (int i = 0; i < 99999999; i++) {
               ma.put(i,"furkan");

           }
       }
    }

}


