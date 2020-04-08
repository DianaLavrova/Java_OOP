public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall(150);
        RunWay runWay = new RunWay(5);


        Cat barsik = new Cat(6,5);
        barsik.run(runWay);
        barsik.jump(wall);

        Human jack = new Human(100,4 );
        jack.jump(wall);
        jack.run(runWay);

        Robot bob = new Robot(500,200);
        bob.jump(wall);
        bob.run(runWay);

        Cat[] barsiks = {new Cat(5,60), new Cat(9,600), new Cat(1,2)};
        Wall[] walls = {new Wall (4), new Wall (9)};
        for(Cat cat:barsiks){
            for(Wall wal:walls){
               cat.jump(wal);
            }
        }

    }


}
