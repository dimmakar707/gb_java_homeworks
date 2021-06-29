package ru.geekbrains.lesson_6;

public class Cat extends Animal {

    private static int catCount = 0;

    public Cat(String name) {
        super();
        this.name = name;
        this.runMaxDistance = 200;
        this.swimMaxDistance = 0;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run() {
        System.out.printf("Кошка %s бежит\n", this.name);
    }

    @Override
    public void swim() {
        System.out.printf("Кошка %s не умеет плавать\n", this.name);
    }

    public boolean run(int distance) {
        if(distance <= runMaxDistance) {
            System.out.printf("Кошка %s пробежала %d метров\n", this.name, distance);
            return true;
        } else {
            System.out.printf("Кошка %s не может пробежать %d метров\n", this.name, distance);
            return false;
        }
    }

    public boolean swim(int distance) {
        if(distance <= swimMaxDistance) {
            System.out.printf("Кошка %s проплыла %d метров\n", this.name, distance);
            return true;
        } else {
            System.out.printf("Кошка %s не может проплыть %d метров\n", this.name, distance);
            return false;
        }
    }

}
