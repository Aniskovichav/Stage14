package by.itstep.aniskovich.java.stage14.level.a.model;

public class Array {
    public static int countNonzeroElement(int[] array) {
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

    public static int countEvenElement(int[] array) {
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

    public static int countPositiveElement(int[] array) {
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

    public static int countZeroElement(int[] array) {
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

    public static int countOddElement(int[] array) {
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

    public static int countNegativeElement(int[] array) {
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
