package Oct_12;

public class MaxArray {

    public static void main(String args[]) {
        int[] arr = new int[7];
        arr[0] = 10;
        arr[1] = 330;
        arr[2] = 230;
        arr[3] = 4220;
        arr[4] = 5120;
        arr[5] = 5121;
        arr[6] = 34223;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximux of given array is "+max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimax of given array is "+min);
        }
    }

