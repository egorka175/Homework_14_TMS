package com.tms.Homework_14_TMS.Homework_14_ex1;

import java.util.*;
import java.util.stream.Collectors;

public class GroupTMS {
       private static List<String> namesStudentsGroupTMS = Arrays.asList("Egor","egor","Alex","Anton","Yulia","Marina","Vital");
          private static void countStudentWithMyName(String myName) {
          List<String> countStudentWithMyName = namesStudentsGroupTMS.stream()
                  .map(String::toUpperCase)
                  .filter(n -> n.startsWith(myName))
                  .collect(Collectors.toList());
          System.out.println("____________________________________________");
          System.out.print("Колиество людей с моим именем-(Егор): ");
          System.out.println(countStudentWithMyName.stream().count());
        }
       private static void studentsNamesStartWithA () {
         List<String> studentsNamesStartWithA = namesStudentsGroupTMS.stream()
                .map(String::toUpperCase)
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
                System.out.println("____________________________________________");
                System.out.print("Имена начинающиеся с символа <A>: ");
          studentsNamesStartWithA.stream().forEach(n -> System.out.print(n + " "));
       }
       private static void firstNameStudentIsGroup () {
            List<String> firstNameStudentIsGroup = namesStudentsGroupTMS.stream()
                    .sorted()
                    .limit(1)
                    .collect(Collectors.toList());
            System.out.println();
            System.out.println("____________________________________________");
            System.out.print("Первый элемент отсортированной коллекции: ");
            firstNameStudentIsGroup.stream().forEach(n -> System.out.println(n + " "));
            System.out.println();
            System.out.println("____________________________________________");
            if (firstNameStudentIsGroup.stream().count() == 0) {
                System.out.println("Коллекция - Empty@");
            }
       }
          public static void main(String[] args) {
            System.out.println("Как вас зовут?");
            Scanner str=new Scanner(System.in);
            String myName=str.nextLine();
            countStudentWithMyName(myName.toUpperCase());
            studentsNamesStartWithA();
            firstNameStudentIsGroup();
          }
}