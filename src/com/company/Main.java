package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);

        int l1 = input.nextInt();
        int l2 = input.nextInt();

        System.out.println(l1*l2);

        int[] arr = {1,2,3,4};
        System.out.println(arr[0] + " " + arr[1]);
    }
}
