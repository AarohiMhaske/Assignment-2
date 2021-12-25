package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Neon Number
        int sum = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        num = sc.nextInt();
        int sq = num * num;

        while(sq != 0)
        {
            int digit = sq%10;
            sum = sum + digit;
            sq = sq / 10;
        }
        if (num == sum)
            System.out.println(num + " is a Neon Number.");
        else
            System.out.println(num + " is not a Neon Number.");
    }
}
