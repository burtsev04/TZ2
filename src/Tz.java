package org.example;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/HP OMEN 15/Desktop/cisla.txt");
        try {
            List<BigInteger> cisla = cislaizfaila(file);
            BigInteger min = _min(cisla);
            BigInteger max = _max(cisla);
            BigInteger sum = _sum(cisla);
            BigInteger mult = _mult(cisla);
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {

            e.printStackTrace();
        } catch (NumberFormatException e) {

            e.printStackTrace();
        }
    }

    public static List<BigInteger> cislaizfaila(File file) throws IOException {
        List<BigInteger> cisla = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            String token = scan.next();
            try {
                cisla.add(new BigInteger(token));
            } catch (NumberFormatException e) {
                System.err.println(token);
            }
        }
        
        return cisla;
    }

    public static BigInteger _min(List<BigInteger> cisla) {
        BigInteger min = cisla.get(0);
        for (BigInteger cislo : cisla) {
            if (cislo.compareTo(min) < 0) {
                min = cislo;
            }
        }
        return min;
    }

    public static BigInteger _max(List<BigInteger> cisla) {
        BigInteger max = cisla.get(0);
        for (BigInteger cislo : cisla) {
            if (cislo.compareTo(max) > 0) {
                max = cislo;
            }
        }
        return max;
    }

    public static BigInteger _sum(List<BigInteger> cisla) {
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger cislo : cisla) {
            sum = sum.add(cislo);
        }
        return sum;
    }

    public static BigInteger _mult(List<BigInteger> cisla) {
        BigInteger mult = BigInteger.ONE;
        for (BigInteger cislo : cisla) {
            mult = mult.multiply(cislo);
        }
        return mult;
    }
}
