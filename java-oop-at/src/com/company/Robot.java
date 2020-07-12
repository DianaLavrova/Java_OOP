package com.company;

public class Robot implements Contenders{
    private int jumpWall = 20;
    private int runWay = 20;

    public void run() {
        System.out.println("Robot can run");
    }
    public void run(RunWay runWays) {
        if (runWay >= runWays.lenght) {
            System.out.println("Robot did it");
        } else {
            System.out.println("Robot did not it");
        }
    }

    public void jump() {
        System.out.println("Robot can jump");
    }

    public void jump(Wall wall) {
        if (jumpWall >= wall.hight) {
            System.out.println("Robot made it");
        } else {
            System.out.println("Robot is not made it");
        }
    }
}
