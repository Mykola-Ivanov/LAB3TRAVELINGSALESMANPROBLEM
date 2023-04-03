package org.example;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    static String path = "src\\main\\resources\\L3_2.txt";
    public static void main( String[] args )
    {
        //List<TSPBranchAndBound> list = new ArrayList<>();
        try {
            //for (int j = 0; ; j++) {
            GraphLoader loader = new GraphLoader(path, true);
            TSPBranchAndBound bnb = new TSPBranchAndBound(loader.getAdjacencyMatrix());
            bnb.solve(1);
            System.out.print("Маршрут:\t");
            bnb.getBestPath().stream().forEach(i -> System.out.print(i + "\t"));
            System.out.println("\nціна маршруту:\t" + bnb.getMinimumCost());
                //list.add(bnb);
                //if (j + 1 == loader.getAdjacencyMatrix().length)
                //    break;
            //}
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
