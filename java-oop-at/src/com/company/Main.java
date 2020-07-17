package com.company;

public class Main {

    public static void main(String[] args) {


        Wall wall = new Wall();
        RunWay runWay = new RunWay();

        Cat barsik = new Cat();
        barsik.jump();
        barsik.run();
        barsik.jump(wall);
        barsik.run(runWay);

        Human petr = new Human();
        petr.jump();
        petr.run();
        petr.jump(wall);
        petr.run(runWay);

        Robot X = new Robot();
        X.jump();
        X.run();
        X.jump(wall);
        X.run(runWay);

        Contenders[] content = {barsik, petr, X};
        Object[] wallrun = {runWay, wall};

        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < wallrun.length; j++) {
                if (wallrun[j] instanceof RunWay) {
                    content[i].run((RunWay)wallrun[j]);
                } else if (wallrun[j] instanceof Wall){
                    content[i].jump((Wall)wallrun[j]);
                }
            }
        }



    }


}
