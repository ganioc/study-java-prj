package app;

import app.rfclib.Hello;

public class App {
    public static void main(String[] args) throws Exception {
        Hello hello = new Hello();
        System.out.println(hello);
        hello.say();
    }
}