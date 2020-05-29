public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik ");
        cat.info();
        cat.jump(100);
        cat.run(100);
        cat.swim(100);

        Dog dog = new Dog("Sharik ");
        dog.info();
        dog.jump(0.6f);
        dog.run(70);
        dog.swim(2);

        Dog dog1 = new Dog("Lutik ");
        dog1.setRunLimit(10);
        dog1.info();
        dog1.jump(0.6f);
        dog1.run(70);
        dog1.swim(2);
    }
}
