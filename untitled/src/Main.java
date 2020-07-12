public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[10];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + i, (int) (Math.random() * 30));
        }

        Plate plate = new Plate(100);
        catsEatFromPlate(cats, plate);
        plate.addFood(50);
        catsEatFromPlate(cats, plate);
    }

    private static void catsEatFromPlate(Cat[] cats, Plate plate){
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
        }
    }
}