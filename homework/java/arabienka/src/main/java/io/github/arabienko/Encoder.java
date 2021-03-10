package io.github.arabienko;

public class Encoder {


    public void decode(char h) {
        short decodeCharToShort = (short) h;
        System.out.println("'" + h + "' => " + decodeCharToShort);
    }

    public void encode(short i) {
        char encoderShortToChar = (char) i;
        System.out.println("'" + i + "' => " + encoderShortToChar);
    }
}
