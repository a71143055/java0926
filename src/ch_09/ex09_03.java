package ch_09;

import java.util.Random;

public class ex09_03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n =10;

        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(n));
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextBoolean());
    }
}
