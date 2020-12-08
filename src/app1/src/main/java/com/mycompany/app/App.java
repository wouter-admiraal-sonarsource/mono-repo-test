package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
if (true) {
        System.out.println(new App().getMessage());
} else if (false) {
        System.out.println(new App().getMessage());
} else {
        System.out.println(new App().getMessage());
}
    }

    private final String getMessage() {
        return message;
    }

}
