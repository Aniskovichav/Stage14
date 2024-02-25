package by.itstep.aniskovich.java.stage14.level.c.util;

public class ArrayCountIndexOverAvgUI {
    public static String format(int count, double avg) {
        return String.format("%d elements of the vector of integer values" +
                        " that are greater than the arithmetic mean of " +
                        "all values of the vector elements %.1f",
                count, avg);
    }
}
