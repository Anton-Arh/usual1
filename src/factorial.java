import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        BigInteger a = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Факториал числа " + n + " равен " + a);
    }

}
