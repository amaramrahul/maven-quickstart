package com.example.snippets;

public class Combinatorics {
    public static long nCr(int n, int r) {
        if (n < 0 || r < 0) {
            throw new RuntimeException("n or r cannot be negative");
        }
        if (n < r) {
            return 0;
        }
        long numerator = 1;
        long denominator = 1;
        for (int i = 0; i < r; i++) {
            if (numerator > Long.MAX_VALUE / (n-i)) {
                throw new RuntimeException("Numerator overflow anticipated");
            }
            numerator *= (n-i);
            if (denominator > Long.MAX_VALUE / (i+1)) {
                throw new RuntimeException("Denominator overflow anticipated");
            }
            denominator *=  (i+1);
        }
        return numerator / denominator;
    }

    public static long nPr(int n, int r) {
        if (n < 0 || r < 0) {
            throw new RuntimeException("n or r cannot be negative");
        }
        if (n < r) {
            return 0;
        }
        long result = 1;
        for (int i = 0; i < r; i++) {
            if (result > Long.MAX_VALUE / (n-i)) {
                throw new RuntimeException("Result overflow anticipated");
            }
            result *= (n - i);
        }
        return result;
    }
}
