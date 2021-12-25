package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Palindrome Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String reverse = "";
        String num = sc.nextLine();
        int length = num.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + num.charAt(i);
        if (num.equals(reverse))
            System.out.println(num +" is a palindrome.");
        else
            System.out.println(num +"  isn't a palindrome.");
    }
}
