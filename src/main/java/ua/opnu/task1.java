package ua.opnu;

import java.util.function.Predicate;

public class task1 {

    public static Predicate<Integer> isPrime = n -> {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    };

}
