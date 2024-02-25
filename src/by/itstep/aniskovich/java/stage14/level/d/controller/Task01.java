package by.itstep.aniskovich.java.stage14.level.d.controller;

import by.itstep.aniskovich.java.stage14.level.d.model.Array;
import by.itstep.aniskovich.java.stage14.level.d.util.ArrayMulBtwMinAndMaxElementUI;
import by.itstep.aniskovich.java.stage14.level.util.ArrayInit;
import by.itstep.aniskovich.java.stage14.level.view.ConsolePrinter;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        double[] array = new double[ArrayInit.randomSizeArray()];

        ArrayInit.randomInitElement(array);

        ConsolePrinter.print(Arrays.toString(array) + "\t" + "\n");

        ConsolePrinter.print(ArrayMulBtwMinAndMaxElementUI.format
                (Array.mulBetweenMinAndMaxElement(array)));

    }
}
