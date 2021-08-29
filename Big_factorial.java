package problem_solv;

import java.math.BigInteger;
import java.util.Scanner;
public class Problem_solv {

    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(factorial(new BigInteger(scan.next())));
    }

}
