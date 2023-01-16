import java.util.*;

public class Functions {
    // Function to check whether a number is prime or not.

//    public static void checkPrime(int n) {
//        int temp = 0;
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                temp = temp + 1;
//            }
//        }
//        if (n<0){
//            System.out.println("Enter a valid number .");
//        }
//        else if ((n == 1) || (n == 0)) {
//            System.out.println(n + " is neither prime nor composite.");
//        } else if (temp == 0) {
//            System.out.println(n + " is a prime number .");
//        } else {
//            System.out.println(n + " is not a prime number . ");
//        }
//    }


    //Function to check whether a number is even or odd.

//    public static void checkEven(int n){
//        if (n==0){
//            System.out.println("Neither Even Nor Odd");
//        } else if (n%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//
//    }


    // function to print table of a given number

    public static void table(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+"X"+i+"="+n*i);

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = input.nextInt();
//        checkPrime(a);
        //checkEven(a);
        table(a);
    }
}
