package by.itstep.aniskovich.java.stage14.level.util;

import java.util.Random;

public class NumberInit {
    private static final Random RND;
    private static final int RANGE_START = -10;
    private static final int RANGE_END = 10;

    static {
        RND = new Random();
    }

    public static int randomNumber() {
        return RND.nextInt(RANGE_START, RANGE_END);
    }
}
