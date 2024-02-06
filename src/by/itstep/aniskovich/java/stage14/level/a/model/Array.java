package by.itstep.aniskovich.java.stage14.level.a.model;

public class Array {
    public static int countNonzeroIndex(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static int countEvenIndex(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countPositiveIndex(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }

        return count;
    }

    public static int countZeroIndex(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countOddIndex(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static int countNegativeIndex(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }

        return count;
    }
}
