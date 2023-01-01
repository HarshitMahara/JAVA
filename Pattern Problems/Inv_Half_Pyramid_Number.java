package com.harry.java;

import java.util.*;
public class Inv_Half_Pyramid_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the height of the Pyramid :");
        int n=input.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j<=n-i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
