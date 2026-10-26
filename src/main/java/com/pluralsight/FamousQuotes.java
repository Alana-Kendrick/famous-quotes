package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] quoteList = {"Carpet Diem", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        System.out.println("Enter a number: ");
        int input = scanner.nextInt() - 1;
        System.out.println(quoteList[input]);
    }
}
