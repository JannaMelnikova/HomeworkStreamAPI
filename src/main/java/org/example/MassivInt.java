package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class MassivInt {
    int id;
    Massiv[] massivs;

    public MassivInt() {
        this.id = 0; // Или другое значение по умолчанию
        this.massivs = new Massiv[10]; // Инициализация массива с размером
    }

    public void addMassivId(Massiv massiv) {
        for (int i = 0; i < massivs.length; i++) {
            if (massivs[i] == null) {
                massivs[i] = massiv;
                break;
            }
        }
    }

    public List<Integer> filterNumbersDivisibleByFive(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(e -> e % 5 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public List<Integer> filterNumbersDivisibleBeforeHundred(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(e -> e < 100)
                .boxed()
                .collect(Collectors.toList());
    }

    public Double[] convertInDouble(List<Double> numbers) {
        return numbers.stream()
                .map(n -> n + 10.1)
                .toArray(Double[]::new);
    }

}
