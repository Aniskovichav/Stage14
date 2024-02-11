package by.itstep.aniskovich.java.stage14.level.util;

import java.util.Random;

public class ArrayInit {
    private static final Random RND;
    private static final int SIZE = 10;
    private static final int RANGE_START = -10;
    private static final int RANGE_END = 10;

    static {
        RND = new Random();
    }

    public static int randomSizeArray() {
        return RND.nextInt(1, SIZE);
    }

    public static void randomInitElement(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = RND.nextInt(RANGE_START, RANGE_END);
        }
    }

    public static void randomInitElement(double[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = RND.nextInt(RANGE_START, RANGE_END)
                    + RND.nextDouble();
        }
    }
}
