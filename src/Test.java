import org.example.Main;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTP {

    @Test
    public void test_min() {
        List<BigInteger> numbers = Arrays.asList(
                new BigInteger("1"),
                new BigInteger("4"),
                new BigInteger("2"),
                new BigInteger("3")
        );
        assertEquals(new BigInteger("1"), Main._min(numbers));
    }

    @Test
    public void test_max() {
        List<BigInteger> numbers = Arrays.asList(
                new BigInteger("1"),
                new BigInteger("4"),
                new BigInteger("2"),
                new BigInteger("3")
        );
        assertEquals(new BigInteger("4"), Main._max(numbers));
    }

    @Test
    public void test_sum() {
        List<BigInteger> cisla = Arrays.asList(
                new BigInteger("1"),
                new BigInteger("4"),
                new BigInteger("2"),
                new BigInteger("3")
        );
        assertEquals(new BigInteger("10"), Main._sum(cisla));
    }

    @Test
    public void test_mult() {
        List<BigInteger> cisla = Arrays.asList(
                new BigInteger("1"),
                new BigInteger("4"),
                new BigInteger("2"),
                new BigInteger("3")
        );
        assertEquals(new BigInteger("24"), Main._mult(cisla));
    }

    @Test
    public void testPerformance() {
        int[] mesta = {1000, 10000, 100000, 500000};
        for (int mesto : mesta) {
            List<BigInteger> cisla = new ArrayList<>();
            for (int i = 1; i <= mesto; i++) {
                cisla.add(BigInteger.valueOf(i));
            }

            long start, konets;

            start = System.currentTimeMillis();
            Main._min(cisla);
            konets = System.currentTimeMillis();
            System.out.println("_min with " + mesto + " numbers took: " + (konets - start) + "ms");

            start = System.currentTimeMillis();
            Main._max(cisla);
            konets = System.currentTimeMillis();
            System.out.println("_max with " + mesto + " numbers took: " + (konets - start) + "ms");

            start = System.currentTimeMillis();
            Main._sum(cisla);
            konets = System.currentTimeMillis();
            System.out.println("_sum with " + mesto + " numbers took: " + (konets - start) + "ms");

            start = System.currentTimeMillis();
            Main._mult(cisla);
            konets = System.currentTimeMillis();
            System.out.println("_mult with " + mesto + " numbers took: " + (konets - start) + "ms");
        }
    }
}
