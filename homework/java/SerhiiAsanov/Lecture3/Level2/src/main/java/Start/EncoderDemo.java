package Start;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        encoder.encode((short) 65);
        encoder.decode('A');
    }
}
