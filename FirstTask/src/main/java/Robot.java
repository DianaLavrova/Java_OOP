public class Robot {
    private int robotCanRun;
    private int robotCanJump;

    public Robot(int robotCanRun, int robotCanJump) {
        this.robotCanRun = robotCanRun;
        this.robotCanJump = robotCanJump;
    }

    public void run(RunWay runWay) {
        if (robotCanRun >= runWay.getLenght()) {
            System.out.println("Robot can run" + runWay.getLenght() + " m");
        } else {
            System.out.println("Robot can only run" + robotCanRun);
        }
    }

    public void jump(Wall wallJump) {
        if (robotCanRun >= wallJump.getHeight()) {
            System.out.println("Robot can jump" + wallJump.getHeight() + " m");
        } else {
            System.out.println("Robot can only jump" + robotCanJump);
        }
    }
}
