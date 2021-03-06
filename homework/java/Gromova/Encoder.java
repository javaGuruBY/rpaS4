package Lessons;

public class Encoder {
    public void encode(short code) {
        char input = (char) code;
        System.out.println(input);
    }

    void decode(char symbol) {
        short input = (short) symbol;
        System.out.println(input);
    }
}

class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        encoder.encode((short) 14);
        encoder.decode('A');

    }
}
