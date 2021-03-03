package by.jrr.encoder;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        short[] code = {65, 88, 48};
        char[] symbol = {'A', 'x', '2'};
        encoder.encode(code);
        System.out.println();
        encoder.decode(symbol);
        System.out.println();
        encoder.encode((short) 75);
        System.out.println();
        encoder.decode('s');
    }
}
