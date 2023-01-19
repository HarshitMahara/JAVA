import java.util.*;

public class Switch {
    public static void main(String[] args) {
        
       /* CALCULATOR PROGRAM USING SWITCH
       
       Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int result=input.nextInt();
        switch (result) {
            case 0:
               result= a+b;
                System.out.println(result);
                break;
            case 1:
                result= a-b;
                System.out.println(result);
                break;
            case 2:
                result=a*b;
                System.out.println(result);
                break;
            case 3:
                result=a/b;
                System.out.println(result);
                break;
            case 4:
                result=a%b;
                System.out.println(result);
                break;
            default:
                System.out.println("Enter a valid input");
        }*/

        //PROGRAM TO PRINT MONTHS USING SWITCH
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        switch(n){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter a valid month");
        }

    }
}
