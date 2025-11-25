package ua.opnu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task2 {

    public static List<Student> filterStudents(Student[] arr, Predicate<Student> cond) {
        List<Student> result = new ArrayList<>();
        for (Student s : arr) {
            if (cond.test(s)) result.add(s);
        }
        return result;
    }

}
