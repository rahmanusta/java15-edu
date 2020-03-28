package com.kodedu.texts;

import static com.kodedu.texts.TextUtil.printText;

public class App6 {

    public static void main(String[] args) {
        String html = """
                      <html>                  \s
                         <body>               \s
                           <p>Hello, world</p>\s
                         </body>              \s
                      </html>                 \s
                      """;
        printText(html);
    }
}
