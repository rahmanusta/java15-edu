package com.kodedu.texts;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class TextUtil {

    private static AtomicInteger counter = new AtomicInteger(0);

    public static void printText(String string) {
        string = string.replaceAll(" ", "•");
        string = string.replaceAll("\n", "⏎\n");
        string = string.trim();
        System.out.println(string.isBlank() ? "Blank" : string);
    }

}
