package by.itstep.aniskovich.java.stage14.level.c.model;

public class Array {
    public static int countIndexOverAvg(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;
        double avg = array[0];

        for (int i = 1; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexOverAvgGeom(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;
        double avg_geom = array[0];

        for (int i = 1; i < array.length; i++) {
            avg_geom *= array[i];
        }

        avg_geom = Math.pow(avg_geom, 1.0 / array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg_geom) {
                count++;
            }
        }

        return count;
    }

    public static int countIndexUnderAvg(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;
        double avg = array[0];

        for (int i = 1; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
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
        double avg_geom = array[0];

        for (int i = 1; i < array.length; i++) {
            avg_geom *= array[i];
        }

        avg_geom = Math.pow(avg_geom, 1.0 / array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg_geom) {
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
        double avg = array[0];

        for (int i = 1; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= avg - deviation
                    && array[i] <= avg + deviation) {
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
        double avg_geom = array[0];

        for (int i = 1; i < array.length; i++) {
            avg_geom *= array[i];
        }

        avg_geom = Math.pow(avg_geom, 1.0 / array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= avg_geom - deviation
                    && array[i] <= avg_geom + deviation) {
                count++;
            }
        }

        return count;
    }
}
