public class Main {
    public static void main(String[] args) {
        Client client = new Client(new VictorianChairFactory());
        client.sit();

        client = new Client(new MultifunctionalChairFactory());
        client.sit();

        client = new Client(new MagicChairFactory());
        client.sit();
    }
}