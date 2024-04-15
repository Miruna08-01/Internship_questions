package org.example;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=1; j--) {
                if (j > n - i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}