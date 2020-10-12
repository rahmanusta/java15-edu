package com.kodedu.texts;

public class TextApp2 {

    public static void main(String[] args) {

        // Line  terminator is required
        // equal to-> var text = ""
        var text = """
                """;

//        var text2 = """"""; // illegal text block start
//        var text3 = """ """; // illegal text block start

        TextUtil.printText(text);
    }
}
