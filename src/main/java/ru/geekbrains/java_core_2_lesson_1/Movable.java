package ru.geekbrains.java_core_2_lesson_1;

public interface Movable {

    void run();
    boolean tryRun(Obstacle track);

    void jump();
    boolean tryJump(Obstacle wall);

}
