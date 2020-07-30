package example.collections;

public class TelephonesTest {
    public static void main(String[] args) {
        Telephones telephones = new Telephones();
        telephones.add("Gg", "8908897");
        telephones.add("Gg", "8908789");
        telephones.add("Rr", "8908789");
        telephones.add("Rr", "8908766");
        telephones.add("Rr", "8908766");

        telephones.printTelephones("Gg");
        telephones.printTelephones("Rr");

    }
}
