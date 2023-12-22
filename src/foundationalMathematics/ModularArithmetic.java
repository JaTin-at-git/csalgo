package foundationalMathematics;

public class ModularArithmetic {

    public static long binaryExponentiation(long a, long b, long mod) {
        long ans = 1;

        //find power
        a = a % mod;

        while (b != 0) {
            if ((b & 1) == 1) ans = (ans * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }

        return ans;

    }

}
