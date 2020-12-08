package com.mycompany.app;

/**
 * Hello world!
 */
public class App2
{

    private final String message = "Hello World!";

    public App2() {}

    public static void main(String[] args) {
        System.out.println(new App2().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
