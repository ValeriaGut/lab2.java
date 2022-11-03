import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Formatter;
import java.text.*;
public class Pr{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input x:\n");
        BigDecimal x = BigDecimal.valueOf(scan.nextFloat());
        System.out.println("Input k:\n");
        BigInteger k = BigInteger.valueOf(scan.nextInt());
        System.out.format("K 16: %x %nK 8: %o %n", k, k);
        Teylor t = new Teylor(x, k);
        t.findRow();

    }
}





