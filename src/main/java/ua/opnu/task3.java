package ua.opnu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task3 {

    public static List<Student> filterTwo(Student[] arr, Predicate<Student> p1, Predicate<Student> p2) {
        List<Student> result = new ArrayList<>();
        for (Student s : arr) {
            if (p1.test(s) && p2.test(s)) result.add(s);
        }
        return result;
    }

}
