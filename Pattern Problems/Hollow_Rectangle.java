package com.harry.java;

import java.util.*;
public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int r=input.nextInt();
        System.out.print("Enter the number of columns :");
        int c= input.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1||j==1||i==r||j==c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
