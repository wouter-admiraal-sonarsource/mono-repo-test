package com.mycompany.app;

/**
 * Hello world!
 */
public class App2
{

    private final String message = "Hello World!";

    public App2() {}

    public static void main(String[] args) {
if (true) {
        System.out.println(new App2().getMessage());
} else if (false) {
        System.out.println(new App2().getMessage());
} else {
        System.out.println(new App2().getMessage());
}
    }

    private final String getMessage() {
        return message;
    }

}
