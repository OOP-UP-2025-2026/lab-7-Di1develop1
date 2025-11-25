package ua.opnu;

import java.util.function.Function;

public class task7 {

    public static String stringify(int[] arr, Function<Integer, String> converter) {
        StringBuilder sb = new StringBuilder();
        for (int n : arr) sb.append(converter.apply(n)).append(" ");
        return sb.toString().trim();
    }

}
