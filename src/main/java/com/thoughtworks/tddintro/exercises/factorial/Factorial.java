package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        // This method computes the factorial of the given integer i.
        if (i < 0) {
            throw new IllegalArgumentException("Cannot compute factorial of a negative number");
        }

        int factorial = 1;

        for (int n = 1; n < i + 1; n++) {
            factorial *= n;
        }
        return factorial;
    }
}
