public class Cat {
    protected String name;
    private boolean satiety = false;
    int sizeStomach;

    public Cat(String name, int sizeStomach) {
        this.name = name;
        this.sizeStomach = sizeStomach;
    }

    public Cat(String name) {
        this.name = name;
        this.sizeStomach = 10;

    }

    public void eat(Plate plate) {
        if (satiety){
            System.out.println("I don't wanna eat");
            return;
        }
        System.out.println(name + " eat");
        if (plate.decreaseFood(sizeStomach)) {
            satiety = true;
            System.out.println("I'm satiety");
        }
    }
}