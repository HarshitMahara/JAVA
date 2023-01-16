import java.util.*;

public class Exercise_1 {

    // Function to calculate the average of 3 numbers

//    public static void average(double a,double b,double c){
//        double average=(a+b+c)/3;
//        System.out.println(average);
//    }

    // Function to print the sum of odd numbers from 1 to n

//    public static void sumOfOddNumbers(int n){
//        int sum=0;
//        for (int i = 1; i <=n ; i++) {
//            if(i%2!=0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//    }


    //Function to print the greatest of 2 numbers

//    public static void greatestOfTwo(int x,int y){
//        if(x>y){
//            System.out.println(x+" is greater than "+y);
//        }else {
//            System.out.println(y+" is greater than "+x);
//        }
//
//    }

    //Function to calculate the circumference of a circle
//
//    public static void circumferenceOfCircle(int r){
//        double cir=(3.14)*(r*r);
//        System.out.println("Circumference of the Circle with radius "+r+" is : "+cir);
//    }

    //Function to check whether a person is eligible to vote

//    public static void checkForVote(int n){
//        if(n>18){
//            System.out.println("The person is eligible to Vote");
//        }else {
//            System.out.println("Not Eligible");
//        }
//    }

    //Infinite loop using do while condition

//    public static void main(String[] args) {
//        int r=1;
//        do{
//            System.out.println(1);
//        }while(r!=2);
//    }


    // Function to calculate the power of a number

//    public static void calPower(int x,int n){
//        int result =1;
//        while(n!=0){
//            result=result*x;
//            --n;
//        }
//        System.out.println(result);
//    }

//
//        public static void main(String[] args) {
//            Scanner input=new Scanner(System.in);
////
////////        int x= input.nextInt();
////////        int y= input.nextInt();
////////        int z= input.nextInt();
////////        average(x,y,z);
//            System.out.print("Enter the base of the expression :");
//            int a= input.nextInt();
//////        //System.out.print("Enter second number :");
//////        //int b= input.nextInt();
//////        //sumOfOddNumbers(a);
//////       // greatestOfTwo(a,b);
//////        //circumferenceOfCircle(a);
//////        //checkForVote(a);
//            System.out.print("Enter the power of the expression  :");
//            int b= input.nextInt();
//           // calPower(a,b);
//   }


//program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,m;
        int count1 = 0;
        int count2=0;
        int count3=0;
        do{
            System.out.print("Enter 1 to Start the Program or 0 to End the Program :");
            m= input.nextInt();
            if (m==1) {
                System.out.print("Enter the number :");
                n = input.nextInt();
                if (n == 0) {
                    count1 = count1 + 1;
                    System.out.println("Number of zeros are : " + count1);
                } else if (n < 0) {
                    count2 = count2 + 1;
                    System.out.println("Number of negatives are : " + count2);
                } else if (n>=1) {
                    count3=count3+1;
                    System.out.println("Number of positives are : " + count3);
                } else {
                    System.out.println("Enter a Valid Number .");
                }
            }else if(m==0){
                System.out.println("Program ended ");
            }else{
                System.out.println("Enter either 1 or 0 .");
            }
        }while(m!=0);
        System.out.println("Number of zeros are : " + count1);
        System.out.println("Number of negatives are : " + count2);
        System.out.println("Number of positives are : " + count3);
    }


}
