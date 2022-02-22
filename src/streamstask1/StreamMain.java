/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamstask1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author aurumbeats
 */
public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays
                .asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(x -> {
                    System.out.print(x + " ");
                });
        System.out.println();
    }
}
