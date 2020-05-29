public class Cat extends Animals {

    public Cat(String name) {
        this.name = name;
        this.runLimit = 200;
        this.jumpLimit = 2;
    }

    @Override
    public void swim(int swim) {
        System.out.println("Cat can't swim");
    }
}