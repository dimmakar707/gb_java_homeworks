package ru.geekbrains.lesson_7;

public class HomeWork {
    public static void main(String[] args) {
        Bowl bowl = new Bowl();
        bowl.putFood(80);

        Cat[] cats = {
            new Cat("Barsik", 15),
            new Cat("Murzik", 20),
            new Cat("Vaska", 30),
            new Cat("Matroskin", 40),
            new Cat("SmallFluffyLump", 5),
            new Cat("Murka", 25),
            new Cat("Furka", 7),
            new Cat("Jack", 12),
        };

        for (Cat cat : cats) {
            cat.eat(bowl);
            cat.getSatietyInfo();
            System.out.printf("Food in bowl: %s\n", bowl.getFoodAmount());
            System.out.println("==============================");
        }
    }
}


