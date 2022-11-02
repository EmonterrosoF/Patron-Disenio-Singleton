package com.singleton;

public class App {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getSingleton();

        System.out.println(singleton);

        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton2);

        singleton.setName("Singleton");
        
        System.out.println(singleton2.getName());

    }
}
