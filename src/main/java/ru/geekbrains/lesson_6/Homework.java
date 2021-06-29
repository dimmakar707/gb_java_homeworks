package ru.geekbrains.lesson_6;

public class Homework {
    public static void main(String[] args) {

        Cat catBarsik = new Cat("Barsik");

        catBarsik.run(150);
        catBarsik.run(300);
        catBarsik.swim();

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(250);
        dogBobik.run(600);
        dogBobik.swim(5);
        dogBobik.swim(20);

        System.out.printf("Общее количество животных -  %d\n", Animal.getAnimalCount());
        System.out.printf("Количество кошек -  %d\n", Cat.getCatCount());
        System.out.printf("Количество собак - %d\n", Dog.getDogCount());

        /*
        Ниже задание со звёздочками
        */

        Animal[] animals = {
          new Dog("Sharik"),
          new Cat("Murzik"),
          new Dog("Zhuchka"),
          new Cat("Murka"),
          new Dog("Barbos")
        };

        Obstacle[] obstacles = {
            new Road(100),
            new Road(250),
            new River(3),
            new River(7),
            new River(15)
        };

        for(Animal animal : animals) {

            for(Obstacle obstacle : obstacles) {

                if(obstacle instanceof Road) {

                    if(animal instanceof Cat) {
                        if(!((Cat)animal).run(obstacle.getWidth())) break;
                    }
                    if(animal instanceof Dog) {
                        if(!((Dog)animal).run(obstacle.getWidth())) break;
                    }

                }

                if(obstacle instanceof River) {

                    if(animal instanceof Cat) {
                        if(!((Cat)animal).swim(obstacle.getWidth())) break;
                    }
                    if(animal instanceof Dog) {
                        if(!((Dog)animal).swim(obstacle.getWidth())) break;
                    }

                }

            }

            System.out.println("========================");

        }

    }
}
