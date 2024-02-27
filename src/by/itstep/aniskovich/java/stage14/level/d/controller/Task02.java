package by.itstep.aniskovich.java.stage14.level.d.controller;

import by.itstep.aniskovich.java.stage14.level.d.model.Array;
import by.itstep.aniskovich.java.stage14.level.d.util.ArraySumBtwFirstAndLastZeroElementUI;
import by.itstep.aniskovich.java.stage14.level.util.ArrayInit;
import by.itstep.aniskovich.java.stage14.level.view.ConsolePrinter;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[ArrayInit.randomSizeArray()];

        ArrayInit.randomInitElement(array);

        ConsolePrinter.print(Arrays.toString(array) + "\t" + "\n");

        ConsolePrinter.print(ArraySumBtwFirstAndLastZeroElementUI.format
                (Array.sumBetweenFirstAndLastZeroElement(array)));

    }
}
