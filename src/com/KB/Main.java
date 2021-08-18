package com.KB;

public class Main {

    public static void main(String[] args) {

        int min = -10;
        int max = 10;
        //int[] a = {-7, 1, 5, 2, -4, 3, 0};
        //int[] a = {1, 0, -5, 5, 1 };

        int[] a = new int[50];
        for (int i = 0; i < a.length; i++) {
            a[i] = min + (int) (Math.random() * ((max - min) + 1));
            System.out.print(a[i] + " ");
        }
        System.out.println();

        Sumer summer = new Sumer();
        summer.setMas(a);

        int index = summer.sum();

        if (index > 0) {
            System.out.println(" Total quantity equilibrium index = " + index);
        } else System.out.println("Equilibrium index is missing!!! ");
    }
}