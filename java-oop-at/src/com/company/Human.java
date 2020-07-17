package com.company;

public class Human implements Contenders{
    private int runway = 15;
    private int jumpWall = 5;

    public void run() {
        System.out.println("Human can run");
    }
    public void run(RunWay runWays) {
        if (runway >= runWays.lenght) {
            System.out.println("Human did it");
        } else {
            System.out.println("Human did not it");
        }
    }

    public void jump() {
        System.out.println("Human can jump");

    }

    public void jump(Wall wall) {
        if (jumpWall >= wall.hight) {
            System.out.println("Human made it");
        } else {
            System.out.println("Human is not made it");
        }
    }
}