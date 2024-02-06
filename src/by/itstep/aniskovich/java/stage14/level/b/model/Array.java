package by.itstep.aniskovich.java.stage14.level.b.model;

import static java.lang.Math.*;

public class Array {
    public static int countIndexOverNum(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexUnderNum(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexEqualNum(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexUnequalNum(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexDivisibleNum(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexUndivisibleNum(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % number != 0) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexAbsOverNum(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (abs(array[i]) > number) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexAbsEqualNum(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (abs(array[i]) == number) {
                count++;
            }
        }

        return count;
    }


}
