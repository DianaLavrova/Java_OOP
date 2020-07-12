public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {

        if (amount < food) {

            food -= amount;
            System.out.println("Cat eat " + amount + "," + food + " left");
            return true;
        } else {
            System.out.println(" Cat can't eat " + amount + " only " + food + " left ");
            return false;
        }
    }

    public void info() {
        System.out.println("Food: " + food);
    }

    public void addFood(int amount) {
        food += amount;
    }
}
