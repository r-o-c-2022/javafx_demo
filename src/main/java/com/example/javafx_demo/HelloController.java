package com.example.javafx_demo;

import java.util.ArrayList;

// 单行注释
public class HelloController {

    private static int da12;

    public int geta() {
        ArrayList<String> list = new ArrayList<String>();
        list.add();
        return a;
    }

    public static void seta(int a) {
        extracted(a);


    }

    private static void extracted(int a) {
        seta(1);
        a = 2 * a;
    }

    @fxml
    private label welcometext;
    int a;

    @fxml
    protected void onhellobuttonclick() {
        welcometext.settext("welcome to javafx application!");
        a = 4;
    }
}