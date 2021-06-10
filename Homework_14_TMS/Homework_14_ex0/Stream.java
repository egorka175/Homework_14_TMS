package com.tms.Homework_14_TMS.Homework_14_ex0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {


   static List<Integer> randomNumberArray = Arrays.asList(1, 8, 12, 13, 14, 23, 16, 13, 20, 4, 127, 478, 3, 1, 2, 3, 4, 5, 13);

    public static void dNumbers() {
        List<Integer> dNumbers1 = randomNumberArray.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Коллекция без повторяющихся элементов: "+dNumbers1);
    }
    public static void evenNumbers() {
        List<Integer> evenNumbers = randomNumberArray.stream()
                .filter(n -> n >= 7)
                .filter(n -> n <= 17)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Четные элементы коллекции от 7 до 17 включитеьно: "+evenNumbers);
    }
    public static void x2Numbers() {
        List<Integer> x2Numbers = randomNumberArray.stream()
                .map((n) -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Элементы коллекции увеличенные в 2 раза: "+x2Numbers);
    }
    public static void sortNumbers() {
        List<Integer> sortedNumbers = randomNumberArray.stream()
                .distinct()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Первые четыре отсортированные элементы коллекции: "+sortedNumbers);
    }
    public static void amountNumbers() {
        List<Integer> amountOfElements = randomNumberArray.stream()
                .collect(Collectors.toList());
        System.out.println("Количество элементы в коллекции: "+amountOfElements.stream().count());
    }
    public static void averageNumbers() {
        List<Integer> averageNumbers = randomNumberArray.stream()
                .collect(Collectors.toList());
        System.out.println("Среднее арифметическое элементов коллекции: "+averageNumbers.stream().mapToInt(Integer::intValue).average());
    }
    public static void main(String[] args) {
        dNumbers();
        evenNumbers();
        x2Numbers();
        sortNumbers();
        amountNumbers();
        averageNumbers();
    }
}


