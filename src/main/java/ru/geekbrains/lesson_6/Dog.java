package ru.geekbrains.lesson_6;

public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog(String name) {
        super();
        this.name = name;
        this.runMaxDistance = 500;
        this.swimMaxDistance = 10;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run() {
        System.out.printf("Собака %s бежит\n", this.name);
    }

    @Override
    public void swim() {
        System.out.printf("Собака %s плывёт\n", this.name);
    }

    public boolean run(int distance) {
        if(distance <= runMaxDistance) {
            System.out.printf("Собака %s пробежала %d метров\n", this.name, distance);
            return true;
        } else {
            System.out.printf("Собака %s не может пробежать %d метров\n", this.name, distance);
            return false;
        }
    }

    public boolean swim(int distance) {
        if(distance <= swimMaxDistance) {
            System.out.printf("Собака %s проплыла %d метров\n", this.name, distance);
            return true;
        } else {
            System.out.printf("Собака %s не может проплыть %d метров\n", this.name, distance);
            return false;
        }
    }

}
