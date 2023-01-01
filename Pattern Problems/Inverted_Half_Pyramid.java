package com.harry.java;

import java.util.*;
public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the height of the Pyramid :");
        int n= input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
