package by.itstep.aniskovich.java.stage14.level.c.util;

public class ArrayCountIndexOverAvgGeomUI {
    public static String format(int count, double avg) {
        return String.format("%d elements of the vector of integer values" +
                        " that are greater than the geometric mean of " +
                        "all values of the vector elements %.1f",
                count, avg);
    }
}
