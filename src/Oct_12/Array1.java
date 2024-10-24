package Oct_12;

import java.util.Scanner;

public class Array1 {

    public static void main(String args[]) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array ");
        for (int i = 0; i < arr.length;i++)
        {

            arr[i] = sc.nextInt();
        }

        System.out.println("Array is");
        for (int i = 0; i < arr.length;i++)
        {

            System.out.print(arr[i] +" ");
        }
        int i,t;
        for(i=0;i< arr.length/2;i++ )
        {
            t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
           System.out.println("Reversed Array is");
        for (int k : arr)
        {

            System.out.print(k +" ");
        }


    }
}
