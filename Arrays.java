import java.util.*;

public class Arrays {
    //Take an array of names as input from the user and print them on the screen.

//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter the Size of the array : ");
//        int n= input.nextInt();
//        String name[] =new String[n];
//        for (int i=0;i<n;i++) {
//            name[i] = input.next();
//        }
//        for (int j = 0; j <name.length ; j++) {
//                System.out.println(name[j]);
//            }
//        }
//    }

//Find the maximum & minimum number in an array of integers.

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the size of the array : ");
//        int size=sc.nextInt();
//        int arr[]=new int[size];
//        // for input
//        for (int i = 0; i <size ; i++) {
//            arr[i]=sc.nextInt();
//        }
//
//        // Integer.MIN_VALUE gives us the smallest integer in java , similar task is performed by Integer.MAX_VALUE
//        int max=Integer.MIN_VALUE;
//        int min =Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("The maximum number in the array is : "+max);
//        System.out.println("The minimum number in the array is : "+min);
//    }}

//Take an array of numbers as input and check if it is an array sorted in ascending order.

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of the array : ");
      int size=sc.nextInt();
      int arr[]=new int[size];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

        boolean isAscending=true;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order ");
        }
    }
}
