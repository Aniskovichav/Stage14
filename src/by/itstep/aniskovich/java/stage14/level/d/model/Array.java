package by.itstep.aniskovich.java.stage14.level.d.model;

public class Array {
    public static double findMultipleNumBetweenMinAndMax(double[] array) {
        double multipleNum = 1.0;

        int minIndex = findMinIndex(array);
        int maxIndex = findMinIndex(array);

        if (minIndex <= maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                multipleNum *= array[i];
            }
        }

        return multipleNum;
    }

    private static int findMaxIndex(double[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = i;
            }
        }
        return max;
    }

    private static int findMinIndex(double[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = i;
            }
        }
        return min;
    }

    public static int findSumNumBetweenFirstAndLastZeroElement(int[] array) {
        int firstZeroNum = findFirstZeroElement(array);
        int lastZeroNum = findLastZeroElement(array);

        if (firstZeroNum == -1 || lastZeroNum == -1) {
            return -1;
        }

        int sumNum = 0;

        if (firstZeroNum == lastZeroNum || firstZeroNum + 1 == lastZeroNum) {
            return sumNum;
        } else if (firstZeroNum <= lastZeroNum) {
            for (int i = firstZeroNum + 1; i < lastZeroNum; i++) {
                sumNum += array[i];
            }
        }

        return sumNum;
    }

    private static int findFirstZeroElement(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastZeroElement(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int firstNum = findFirstZeroElement(array);

        for (int i = array.length - 1; i > firstNum; i--) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

}
