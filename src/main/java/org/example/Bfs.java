package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    private final int totalNodes;
    private final LinkedList<String>[] just; // adjacency list
    private final Queue<String> node;

    public Bfs(int totalNodes) {
        just = new LinkedList[totalNodes];
        this.totalNodes = totalNodes;
        for (int i = 0 ; i < totalNodes; i++) {
            just[i] = new LinkedList<>();
        }
        node = new LinkedList<>();
    }

    public void addCity(int city, String adjacencyCity) {
        this.just[city].add(adjacencyCity);
    }

    public void bfs(String city) {
        int temp = 0;
        boolean[] visited = new boolean[this.totalNodes];
        visited[temp] = true;
        temp++;
        node.add(city);
        while (!this.node.isEmpty()) {
            final String poll = node.poll();
            System.out.println("çıkarılan deger:" + poll);

        }
    }

    public static void main(String[] args) {
        final Bfs bfs = new Bfs(4);
        bfs.addCity(0, "ISTANBUL");
        bfs.addCity(0, "IZMIR");
        bfs.addCity(1, "ARTVIN");
        bfs.addCity(1, "MUS");
        bfs.addCity(1, "KARS");
        bfs.addCity(3, "ADANA");
    }
}
