/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamstask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;

/**
 *
 * @author aurumbeats
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> intList = Arrays
                .asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positives = new ArrayList<>();
        for (int p : intList) {
            if (p > 0 && p % 2 == 0) positives.add(p);
        }
        positives.sort(Comparator.naturalOrder());
        for (int p : positives) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
    
}
