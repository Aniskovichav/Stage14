package by.itstep.aniskovich.java.stage14.level.c.model;

public class Array {
    public static int countIndexOverAvg(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        double avg = avgIndexArray(array);

        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] > avg) {
                count++;
            }
        }

        return count;
    }

    public static double avgIndexArray(int[] array) {
        double avg = array[0];

        for (int i = 1; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;

        return avg;
    }

    public static int countIndexOverAvgGeom(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        double avgGeom = avgGeomIndexArray(array);

        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] > avgGeom) {
                count++;
            }
        }

        return count;
    }

    public static double avgGeomIndexArray(int[] array) {
        double avgGeom = array[0];

        for (int i = 1; i < array.length; i++) {
            avgGeom *= array[i];
        }

        avgGeom = Math.pow(avgGeom, 1.0 / array.length);

        return avgGeom;
    }

    public static int countIndexUnderAvg(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        double avg = avgIndexArray(array);

        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] < avg) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexUnderAvgGeom(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        double avgGeom = avgGeomIndexArray(array);

        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] < avgGeom) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexEqualAvgDeviation(int[] array,
                                                  double deviation) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        double avg = avgIndexArray(array);

        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] >= avg - deviation
                    && (double) array[i] <= avg + deviation) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexEqualAvgGeomDeviation(int[] array,
                                                      double deviation) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        double avgGeom = avgGeomIndexArray(array);

        for (int i = 0; i < array.length; i++) {
            if ((double) array[i] >= avgGeom - deviation
                    && (double) array[i] <= avgGeom + deviation) {
                count++;
            }
        }

        return count;
    }
}
