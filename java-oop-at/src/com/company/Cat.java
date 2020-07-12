package com.company;

public class Cat implements Contenders {
    private int jumpHight = 1;
    private int runWay = 5;

    public void jump() {
        System.out.println("Cat can jump");
    }

    public void jump(Wall wall) {
        if (jumpHight >= wall.hight) {
            System.out.println("Cat made it");
        } else {
            System.out.println("Cat is not made it");
        }
    }

    public void run() {
        System.out.println("Cat can run");
    }
    public void run(RunWay runWays) {
        if (runWay >= runWays.lenght) {
            System.out.println("Cat did it");
        } else {
            System.out.println("Cat did not it");
        }
    }
}

