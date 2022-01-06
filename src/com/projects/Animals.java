package com.projects;

public class Animals {
    public static void main(String[] args) {
        // In this exercise, you'll demonstrate
        // how to use inheritance and interfaces.

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        System.out.println("========================");

        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        System.out.println("========================");
        NoiseCapable dogf = new Dog();
        dogf.makeNoise();

        NoiseCapable catf = new Cat("Garfield");
        catf.makeNoise();
        Cat c = (Cat) catf;
        c.purr();

    }
}
