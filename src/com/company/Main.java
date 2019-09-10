package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//Java program to swap first and last sharacters
public class Main {
    private static String swapCh (String inputString)
    {
        int lenght = inputString.length();
        if(lenght <=1){
            return inputString;
        }else {
            return inputString.charAt(lenght - 1) + inputString.substring(1, lenght - 1) + inputString.charAt(0);
        }
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 string");
        String userInput = scanner.next();
        System.out.println("Output" + swapCh(userInput));
    }
}