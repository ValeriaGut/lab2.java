import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Formatter;

public class Teylor {
    Teylor(BigDecimal x_, BigInteger k_){
        x = x_;
        k = k_;
        a = BigDecimal.valueOf(Math.cos(x.doubleValue()));
        e = BigDecimal.valueOf(Math.pow(10,-(k.doubleValue())));
    }


    public void findRow(){
        while  (x.doubleValue()<0 || x.doubleValue()>2* Math.PI) {
                 if(x.doubleValue()< 0){
                     x = x.add(BigDecimal.valueOf(2*Math.PI));
                 }
                 else
                     x = x.subtract(BigDecimal.valueOf(2*Math.PI));
        }
        while ((Math.abs(elem.doubleValue())) > e.doubleValue()) {
                c = c.add(elem);
                elem = elem.multiply(BigDecimal.valueOf(-1));
                elem = elem.divide(n, k.intValue() + 1, RoundingMode.HALF_UP);
                elem = elem.divide((n.add(BigDecimal.valueOf(-1))), k.intValue() + 1, RoundingMode.HALF_UP);
                elem = elem.multiply(x);
                elem = elem.multiply(x);
                n = n.add(BigDecimal.valueOf(2));
        }

        System.out.println(a);
        System.out.println(c);
        System.out.println(Math.abs((a.subtract(c)).doubleValue()));
        System.out.format("T   cos x = %+010f %n", c);
        System.out.format("S   cos x = %+#.5f %n", a);
        System.out.format("%3$,d %1$(d %2$d", -1, 2, 300000);

    }
    BigDecimal x;
    BigInteger k;
    BigDecimal a;
    BigDecimal e;
    BigDecimal c = BigDecimal.valueOf(0);
    BigDecimal n = BigDecimal.valueOf(2);
    BigDecimal elem = BigDecimal.valueOf(1) ;
}