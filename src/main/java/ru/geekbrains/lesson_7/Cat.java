package ru.geekbrains.lesson_7;

import java.util.Arrays;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {

        if(bowl.getFoodAmount() >= appetite) {
            bowl.decreaseFood(this.appetite);
            satiety = true;
            System.out.printf("Cat %s ate some food: %d\n", this.name, this.appetite);
        } else {
            satiety = false;
            System.out.printf("Not enough food in the bowl for %s\n", name);
        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public void getSatietyInfo() {
        String isSatiety = satiety ? "not hungry" : "hungry";
        System.out.printf("Cat %s is %s\n", name, isSatiety);
    }
}
