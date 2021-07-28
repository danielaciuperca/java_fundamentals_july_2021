package com.daniela.arrays;
/*
    arrays

 */
public class Example4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println("Second for:");
        for(int n : a) {
            System.out.println(n);
        }
    }
}
