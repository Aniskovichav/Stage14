package by.itstep.aniskovich.java.stage14.level.d.model;

import static java.lang.Math.abs;

public class Array {
    public static double mulBetweenMinAndMaxElement(double[] array) {
        int minIndex = findMinElement(array);
        int maxIndex = findMaxElement(array);

        if (minIndex == -1 || maxIndex == -1 || minIndex == maxIndex) {
            return -1;
        }

        if (minIndex > maxIndex) {
            int tempIndex = minIndex;
            minIndex = maxIndex;
            maxIndex = tempIndex;
        }

        double mul = 1.0;

        if (minIndex + 1 == maxIndex) {
            mul = 0.0;
        } else {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                mul *= array[i];
            }
        }

        return mul;
    }
    private static int findMaxElement(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        double max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    private static int findMinElement(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        double min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int sumBetweenFirstAndLastZeroElement(int[] array) {
        int firstZeroIndex = findFirstZeroElement(array);
        int lastZeroIndex = findLastZeroElement(array);

        if (firstZeroIndex == -1 || lastZeroIndex == -1) {
            return -1;
        }

        int sum = 0;

        if (firstZeroIndex == lastZeroIndex
                || firstZeroIndex + 1 == lastZeroIndex) {
            return sum;
        } else if (firstZeroIndex < lastZeroIndex) {
            for (int i = firstZeroIndex + 1; i < lastZeroIndex; i++) {
                sum += array[i];
            }
        }

        return sum;
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

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    public static double sumBeforeLastPositiveElement(double[] array) {
        int lastZeroIndex = findLastPositiveElement(array);

        if (lastZeroIndex == -1) {
            return -1.0;
        }

        double sum = 0.0;

        for (int i = 0; i < lastZeroIndex; i++) {
                sum += array[i];
            }

        return sum;
    }
    private static int findLastPositiveElement(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0.0) {
                return i;
            }
        }
        return -1;
    }
    public static int mulBetweenFirstAndLastZeroElement(int[] array) {
        int firstZeroElement = findFirstZeroElement(array);
        int lastZeroElement = findLastZeroElement(array);

        if (firstZeroElement == -1 || lastZeroElement == -1) {
            return -1;
        }

        int mul = 1;

        if (firstZeroElement == lastZeroElement
                || firstZeroElement + 1 == lastZeroElement) {
            mul = 0;
        } else if (firstZeroElement < lastZeroElement) {
            for (int i = firstZeroElement + 1; i < lastZeroElement; i++) {
                mul *= array[i];
            }
        }

        return mul;
    }

    public static double sumBetweenFirstAndSecondPositiveElement
            (double[] array) {
        int firstPositiveElement = findFirstPositiveElement(array);
        int secondPositiveElement = findSecondPositiveElement(array,
                firstPositiveElement);

        if (firstPositiveElement == -1 || secondPositiveElement == -1) {
            return -1.0;
        }

        double sum = 0.0;

        if (firstPositiveElement == secondPositiveElement
                || firstPositiveElement + 1 == secondPositiveElement) {
            return sum;

        } else if (firstPositiveElement < secondPositiveElement) {
            for (int i = firstPositiveElement + 1;
                 i < secondPositiveElement; i++) {
                sum += array[i];
            }
        }

        return sum;
    }
    private static int findFirstPositiveElement(double[] array) {
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
    private static int findSecondPositiveElement(double[] array,
                                                 int firstElement) {

        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = array.length - 1; i > firstElement; i--) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static double sumAfterFirstPositiveElement(double[] array) {
        int firstPositiveElement = findFirstPositiveElement(array);

        if (firstPositiveElement == -1) {
            return -1.0;
        }

        double sum = 0.0;

        if (firstPositiveElement == array.length - 1) {
            return sum;
        }
        for (int i = firstPositiveElement + 1; i < array.length; i++) {
                sum += array[i];
            }

        return sum;
    }

    public static double sumAfterAbsMaxElement(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int absMaxElement = findAbsMaxElement(array);

        double sum = 0.0;

        for (int i = absMaxElement + 1; i < array.length; i++) {
            sum += array[i];
            }

        return sum;
    }
    private static int findAbsMaxElement(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        double max = 0.0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (abs(array[i]) > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
