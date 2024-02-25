package by.itstep.aniskovich.java.stage14.level.c.controller;

import by.itstep.aniskovich.java.stage14.level.c.model.Array;
import by.itstep.aniskovich.java.stage14.level.c.util.ArrayCountIndexOverAvgUI;
import by.itstep.aniskovich.java.stage14.level.util.ArrayInit;
import by.itstep.aniskovich.java.stage14.level.view.ConsolePrinter;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] array = new int[ArrayInit.randomSizeArray()];

        ArrayInit.randomInitElement(array);

        ConsolePrinter.print(Arrays.toString(array) + "\t");

        ConsolePrinter.print(ArrayCountIndexOverAvgUI.format
                (Array.countIndexOverAvg(array), Array.avgIndexArray(array)));

    }
}
