package by.itstep.aniskovich.java.stage14.level.a.model;

public class Array {
    public static int countNonzeroIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static int countEvenIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countPositiveIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }

        return count;
    }

    public static int countZeroIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countOddIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static int countNegativeIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }

        return count;
    }
}
