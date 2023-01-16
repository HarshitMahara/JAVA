import java.util.*;

public class Loops {
    public static void main(String[] args) {
//          PROGRAM TO PRINT FIRST N EVEN NUMBERS
//        Scanner input=new Scanner(System.in);
//        int n= input.nextInt();
//        for(int i=0;i<=n;i++){
//            if (i%2==0){
//                System.out.println(i);
//            }
//
//        }


        // PROGRAM TO ENTER AND CHECK THE MARKS OF THE STUDENT
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a number (0 or 1) : ");
            n= input.nextInt();
            if(n==1){
                System.out.print("Enter the marks of the student :");
                int x=input.nextInt();
                if (x>100){
                    System.out.println("Enter marks between 0 to 100 .");
                }else if(x >= 90){
                    System.out.println("This is Good");
                }else if(x>=60){
                    System.out.println("This is also Good");
                }else if(x>=0){
                    System.out.println("This is Good as well");
                } else{
                    System.out.println("Enter a valid number .");
                }
            }else if (n==0){
                System.out.println("Program Ended\nThank You");
            }
            else{
                System.out.println("Enter either 1 or 0 .");
            }
        }while(n!=0);
        }
    }
