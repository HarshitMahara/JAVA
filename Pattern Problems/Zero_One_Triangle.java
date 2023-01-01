package com.harry.java;

import java.util.*;
public class Zero_One_Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Height of the Zero-One Triangle :");
        int n=input.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
