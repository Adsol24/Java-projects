import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph(Scanner scanner) {
        adjacencyList = new HashMap<>();
        int numVertices = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numVertices; i++) {
            List<Integer> neighbors = new ArrayList<>();
            String[] tokens = scanner.nextLine().split(" ");
            for (int j = 0; j < tokens.length; j++) {
                neighbors.add(Integer.parseInt(tokens[j]));
            }
            adjacencyList.put(i, neighbors);
        }
    }

    public void display() {
        System.out.println("Graph:");
        for (int vertex : adjacencyList.keySet()) {
            System.out.print("Vertex " + vertex + " == > ");
            List<Integer> neighbors = adjacencyList.get(vertex);
            for (int i = 0; i < neighbors.size(); i++) {
                System.out.print(neighbors.get(i));
                if (i < neighbors.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = null;
        try {
            scan = new Scanner(new FileReader("graph.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("File not Found - exiting");
            System.exit(1);
        }

        System.out.println("file = graph.txt");
        System.out.println("scan = " + scan);
        Graph graph = new Graph(scan);
        graph.display();
    }
}
