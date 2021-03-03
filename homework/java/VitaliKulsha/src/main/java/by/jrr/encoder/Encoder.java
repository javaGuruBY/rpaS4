package by.jrr.encoder;

public class Encoder {
    void encode(short... code) {
        System.out.print("Encode: ");
        for (short num : code) {
            System.out.print((char) num);
        }
    }

    void decode(char... symbol) {
        System.out.print("Decode: ");
        for (char num : symbol) {
            System.out.print((short) num);
        }
    }
}
