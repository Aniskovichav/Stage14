package by.itstep.aniskovich.java.stage14.level.b.controller;

import by.itstep.aniskovich.java.stage14.level.b.model.Array;
import by.itstep.aniskovich.java.stage14.level.b.util.ArrayCountIndexOverNumUI;
import by.itstep.aniskovich.java.stage14.level.util.ArrayInit;
import by.itstep.aniskovich.java.stage14.level.util.NumberInit;
import by.itstep.aniskovich.java.stage14.level.view.ConsolePrinter;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] array = new int[ArrayInit.randomSizeArray()];

        ArrayInit.randomInitElement(array);

        int number = NumberInit.randomNumber();

        ConsolePrinter.print(Arrays.toString(array) + "\t");

        ConsolePrinter.print(ArrayCountIndexOverNumUI.format
                (Array.countIndexOverNum(array, number), number));

    }
}
