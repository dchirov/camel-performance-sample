package org.example;

import org.apache.camel.spring.Main;

public class Base {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("META-INF/spring/camel-context.xml");
        main.run();
    }
}
