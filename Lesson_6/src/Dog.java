public class Dog extends Animals{

    public Dog (String name) {
        this.name = name;
        this.jumpLimit = 0.5f;
        this.runLimit = 500;
        this.swimLimit = 10;
    }
    public void setRunLimit(int runLimit){
        this.runLimit = runLimit;
    }
}
