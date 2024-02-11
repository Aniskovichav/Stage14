package by.itstep.aniskovich.java.stage14.level.a.controller;

import by.itstep.aniskovich.java.stage14.level.a.model.Array;
import by.itstep.aniskovich.java.stage14.level.a.util.ArrayEvenUI;
import by.itstep.aniskovich.java.stage14.level.util.ArrayInit;
import by.itstep.aniskovich.java.stage14.level.view.ConsolePrinter;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[ArrayInit.randomSizeArray()];

        ArrayInit.randomInitElement(array);

        ConsolePrinter.print(Arrays.toString(array) + "\t");

        ConsolePrinter.print(ArrayEvenUI.format
                (Array.countEvenElement(array)));
    }
}
