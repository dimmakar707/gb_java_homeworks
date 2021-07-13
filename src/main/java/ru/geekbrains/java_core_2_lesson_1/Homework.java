package ru.geekbrains.java_core_2_lesson_1;

import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {
        Movable[] participants = {
                new Man("Ivan", 200, 1.5),
                new Cat("Murzik",75, 1.2),
                new Robot("Bender",1000, 0.25),
                new Man("John",300, 1),
                new Cat("Murka",30, 0.5),
                new Robot("Wally", 700, 0.4)
        };

        Obstacle[] obstacles = {
             new RunningTrack(200),
             new RunningTrack(500),
             new Wall(0.25),
             new Wall(0.3),
             new RunningTrack(500)
        };

        for(Movable participant: participants) {
            for(Obstacle obstacle: obstacles) {
                if(obstacle instanceof RunningTrack) {
                    if(!participant.tryRun(obstacle)) break;
                } else {
                    if(!participant.tryJump(obstacle)) break;
                }
            }
            System.out.println("==================");
        }

    }
}
