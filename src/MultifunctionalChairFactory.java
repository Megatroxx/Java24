public class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
