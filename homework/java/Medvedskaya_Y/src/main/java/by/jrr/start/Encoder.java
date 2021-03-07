package by.jrr.start;

public class Encoder {
    static void encode(short code)
    {
        if(code>513 || code < 0)
        {
            System.out.println("Illegal code number");
        }else System.out.println(code + " => " + (char)code);
    }
    static void  decode(char symbol)
    {
        System.out.println(symbol + " => " +(short)symbol);
    }
}
