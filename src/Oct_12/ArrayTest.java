package Oct_12;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the Array ");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printArray(arr);
        reverseArray(arr);
        System.out.println("The reversed array is : ");
        printArray(arr);


    }

    private static int[] reverseArray(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;

            start++;
            end--;

        }
        return a;
    }


    public static void printArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}










      /*  for (int element : arr) {
            System.out.println(element);
        }


       */


// pass by value
    // pass by ref

