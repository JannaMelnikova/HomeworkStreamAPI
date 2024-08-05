package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Инициализация массива из 100 случайных чисел
        int[] massiv1 = new Random().ints(100, 0, 1000).toArray();

        // Пример фильтрации и вывода
        MassivInt instance = new MassivInt();
        List<Integer> filteredList = instance.filterNumbersDivisibleByFive(massiv1);
        List<Integer> filteredList2 = instance.filterNumbersDivisibleBeforeHundred(massiv1);
        List<Double> doubleList = Arrays.asList(0.0, 2.0, 3.0, 4.0, 5.0);
        Double[] result = instance.convertInDouble(doubleList);

        System.out.println(filteredList);
        System.out.println(filteredList2);
        System.out.println(Arrays.toString(result));

    }
}
