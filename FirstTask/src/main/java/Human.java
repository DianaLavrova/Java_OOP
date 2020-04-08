public class Human {

    private int canRun;
    private int canJump;

    public Human(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public void run(RunWay runWay) {
        if (canRun >= runWay.getLenght()) {
            System.out.println("Human can run" + runWay.getLenght() + " m");
        } else {
            System.out.println("Human can only run" + canRun);
        }
    }

    public void jump(Wall wallJump) {
        if (canJump >= wallJump.getHeight()) {
            System.out.println("Human can jump" + wallJump.getHeight() + " m");
        } else {
            System.out.println("Human can only jump" + canJump);
        }
    }
}