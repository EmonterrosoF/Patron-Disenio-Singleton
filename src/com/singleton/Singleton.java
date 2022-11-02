package com.singleton;

public class Singleton {
    private static Singleton singleton;
    private String name;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            System.out.println("nueva instancia Singleton");
            return singleton = new Singleton();
        }
        System.out.println("misma instancia Singleton");
        return singleton;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
