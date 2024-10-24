package Oct_12;

public class ReverseString {
    public static void main(String[] args) {
        String name= "Pragra";
        char[] array= name.toCharArray();
        int start = 0;
        int end = array.length-1;
        while(start<end){
            char temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;

        }System.out.println(array);
    }
}
