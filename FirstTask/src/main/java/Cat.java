public class Cat {
    private int canRun;
    private int canJump;

    public Cat(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public void run(RunWay runWay) {
        if (canRun >= runWay.getLenght()) {
            System.out.println("Cat can run" + runWay.getLenght() + " m");
        } else {
            System.out.println("cat can only run" + canRun);
        }
    }

    public void jump(Wall wallJump) {
        if (canJump >= wallJump.getHeight()) {
            System.out.println("Cat can jump" + wallJump.getHeight() + " m");
        } else {
            System.out.println("cat can only jump" + canJump);
        }

    }
}
