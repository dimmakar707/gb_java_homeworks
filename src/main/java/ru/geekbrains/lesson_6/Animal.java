package ru.geekbrains.lesson_6;

abstract public class Animal {

    private static int animalCount;
    protected int runMaxDistance;
    protected int swimMaxDistance;
    public String name;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run() {
        System.out.println("Животное бежит");
    }

    public void swim() {
        System.out.println("Животное плывёт");
    }

}
