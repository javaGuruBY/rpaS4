package Start;

public class Encoder {

    public void encode(short code) {
        char result = (char) code;
        System.out.println(result);
    }

    public void decode(char symbol) {
        short result = (short) symbol;
        System.out.println(result);
    }
}
