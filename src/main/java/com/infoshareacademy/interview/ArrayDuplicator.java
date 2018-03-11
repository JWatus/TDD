package com.infoshareacademy.interview;

import java.util.*;

public class ArrayDuplicator {

    public void removeDuplicates(int[] sortedArray) {
        int current = sortedArray[0];
        boolean isDuplicated = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sortedArray.length; i++) {
            if (current == sortedArray[i] && !isDuplicated) {
                isDuplicated = true;
            } else if (current != sortedArray[i]) {
                result.append(current);
                result.append(" ");
                current = sortedArray[i];
                isDuplicated = false;
            }
        }
        System.out.print(result.toString());
    }

// z setem

    public static void removeDuplicatesMine(int[] sortedArray) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < sortedArray.length; i++) {
            set.add(sortedArray[i]);
        }

        for (Integer item : set) {
            System.out.println(item);
        }
    }
}

