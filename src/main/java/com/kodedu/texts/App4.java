package com.kodedu.texts;

import static com.kodedu.texts.TextUtil.printText;

public class App4 {

    public static void main(String[] args) {
        String html = """
                          <html>
                             <body>
                               <p>Hello, world</p>
                             </body>
                          </html>
                          """;

        printText(html);
    }
}
