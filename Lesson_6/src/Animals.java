
public class Animals {
    protected String name;
    protected float jumpLimit;
    protected int swimLimit;
    protected int runLimit;

    public void info() {
        System.out.println(name);
    }


    public void jump(float jump) {
        if (jump <= jumpLimit) {
            System.out.println((name + " jump " + jump + " m "));
        } else {
            System.out.println(name + " can't jump more than " + jumpLimit + " m");
        }
    }

    public void run(int run) {

        if (run <= runLimit) {
            System.out.println((name + " run " + run + " m "));
        } else {
            System.out.println(name + " can't run more than " + runLimit + " m");

        }
    }

    public void swim(int swim) {
        if (swim <= swimLimit) {
            System.out.println((name + " run " + swimLimit + " m "));
        } else {
            System.out.println(name + " can't run more than " + swimLimit + " m");
        }
    }
}