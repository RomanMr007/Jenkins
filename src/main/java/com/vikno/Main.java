package com.vikno;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Vikno on 2/3/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("MAVEN!");

        ResourceBundle bundle = ResourceBundle.getBundle("env.dev");
        System.out.println(bundle.getString("environment"));

    }
}
