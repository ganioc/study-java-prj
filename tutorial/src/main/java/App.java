package main.java;

import main.java.rfclib.Hello;

/**
 * class of App
 * 
 * @author Yang
 */
public class App {

    /**
     * main() entry
     * 
     * @param args commandline arguments
     */
    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello);
        hello.say();
    }
}