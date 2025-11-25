package ua.opnu;

interface MyConsumer {
    void accept(Student s);
}

public class task4 {

    public static void forEach(Student[] arr, MyConsumer c) {
        for (Student s : arr) c.accept(s);
    }

}
