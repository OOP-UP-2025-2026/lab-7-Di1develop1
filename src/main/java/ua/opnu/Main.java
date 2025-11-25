package ua.opnu;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1: isPrime(7) → " + task1.isPrime.test(7));

        Student[] students = {
                new Student("Ivan", "IP-12", new int[]{100, 90, 40}),
                new Student("Petro", "IP-12", new int[]{50, 45, 55}),
                new Student("Olena", "KN-21", new int[]{90, 100, 95})
        };

        System.out.println("\nTask 2: студенти з боргами:");
        task2.filterStudents(students, s -> {
            for (int m : s.getMarks()) if (m < 60) return true;
            return false;
        }).forEach(s -> System.out.println(s.getName()));

        System.out.println("\nTask 4: MyConsumer:");
        task4.forEach(students, s -> System.out.println(s.getName() + " + " + s.getGroup()));

        System.out.println("\nTask 6: 2^n:");
        System.out.println(task6.pow2.apply(5)); // 32

        System.out.println("\nTask 7:");
        Map<Integer, String> map = Map.of(
                0, "нуль", 1, "один", 2, "два", 3, "три",
                4, "чотири", 5, "п’ять", 6, "шість",
                7, "сім", 8, "вісім", 9, "дев’ять"
        );

        System.out.println(task7.stringify(new int[]{3, 1, 4}, map::get));
    }
}
