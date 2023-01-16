import java.util.*;

public class Prime {
    public static void main(String[] args) {
        // Check whether a given number is prime
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int temp=0;
        int n = input.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                temp=temp+1;}
        }
        if (n<0){
            System.out.println("Enter a valid number .");
        } else if  ((n == 1) ||(n== 0)) {
            System.out.println(n+" is neither prime nor composite.");
        } else if (temp==0){
            System.out.println(n+" is a prime number .");
        }else{
            System.out.println(n+" is not a prime number . ");
        }
        }
    }
