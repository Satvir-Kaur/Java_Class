package Oct_12;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][4];
        int[][] arr2 = new int[3][3];
        int[][] sum = new int[3][4];
        Scanner sc = new Scanner(System.in);
        //System.out.println(arr1.length);
        System.out.println("Enter Elements of First Array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements of Second Array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of Both Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }
}