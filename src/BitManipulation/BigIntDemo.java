package BitManipulation;

import java.math.BigInteger;

public class BigIntDemo {
    public static void main(String[] args) {
        BigInteger b =new BigInteger("125345575678643223556");
        BigInteger b2 = new BigInteger("5");
//        System.out.println(b.add(b2));
//        System.out.println(b.add(BigInteger.valueOf(7)));

        BigInteger number = BigInteger.valueOf(2);
        System.out.println(b.multiply(number.pow(10)));
        System.out.println(b.multiply(number.pow(100)));

        //Calculate large factorials



    }
}
