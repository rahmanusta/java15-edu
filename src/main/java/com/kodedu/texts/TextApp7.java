package com.kodedu.texts;

import static com.kodedu.texts.TextUtil.printText;

public class TextApp7 {

    public static void main(String[] args) {
        String html = """
                      <html>                  
                         <body>               
                           <p>%s, %s</p>
                         </body>              
                      </html>                 
                      """;
        html = html.formatted("Hello", "world!");

        printText(html);
    }
}
