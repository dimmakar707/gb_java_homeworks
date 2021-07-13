package ru.geekbrains.java_core_2_lesson_1;

public class Man implements Movable {

    private String name;
    private double maxRunDistance;
    private double maxJumpHeight;

    public Man(String name, double maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public double getMaxRunDistance() {
        return maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public boolean tryRun(Obstacle track) {
        if(this.getMaxRunDistance() >= track.getDistance()) {
            System.out.printf("Человек %s пробежал дорожку длиной %.2f метров\n", this.name, track.getDistance());
            return true;
        } else {
            System.out.printf("Человек %s не смог пробежать дорожку длиной %.2f метров\n", this.name, track.getDistance());
            return false;
        }
    };

    @Override
    public boolean tryJump(Obstacle wall) {
        if(this.getMaxJumpHeight() >= wall.getDistance()) {
            System.out.printf("Человек %s перепрыгнул стену высотой %.2f метров\n", this.name, wall.getDistance());
            return true;
        } else {
            System.out.printf("Человек %s не смог перепрыгнуть стену высотой %.2f метров\n", this.name, wall.getDistance());
            return false;
        }
    }

}
