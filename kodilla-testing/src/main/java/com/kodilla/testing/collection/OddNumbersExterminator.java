package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumber = new ArrayList<>();
        for (Integer odd : numbers) {
            if (odd % 2 == 0) {
                oddNumber.add(odd);
            }
        }
        return oddNumber;
    }
}
