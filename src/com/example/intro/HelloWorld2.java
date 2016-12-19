package com.example.intro;

public class HelloWorld2 {

    public static void main(String[] args) {
        outputAGreeting("Hello World!");
        outputAGreeting("Your first program");
        outputAGreeting("1 + 2 = " + add(1, 2));
    }

    public static void outputAGreeting(String greetingText) {
        // This doesn't return a value - 'void' means no value
        System.out.println(greetingText);
    }

    public static int add(int a, int b) {
        // This returns an int result
        return a+b;
    }

}
