package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {
        int countN,Total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問要從1加到多少");
        countN = scanner.nextInt();
        for(;countN>0;countN--){
            Total+=countN;
        }
        System.out.println("總共"+Total);
    }

}
