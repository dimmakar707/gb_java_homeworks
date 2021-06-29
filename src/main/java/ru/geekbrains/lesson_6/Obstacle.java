package ru.geekbrains.lesson_6;

abstract public class Obstacle {
    protected int width;

    public Obstacle(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

}
