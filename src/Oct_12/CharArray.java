package Oct_12;

public class CharArray {

    public static void main(String[] args) {


        char[] ch = new char[10];
        String name="Savi";
        //for(int i: name)
        //{
        //  System.out.println(i);
        //}
        int length = name.length();
        System.out.println(length);

        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);
        int length1 = name.length();
        System.out.println(length1);
        char[] charArray = name.toCharArray();
        for(char i:charArray)
            System.out.println(i);
        boolean s = name.equals("Savi");
        System.out.println(s);
        String replace = name.replace('a', 'b');
        System.out.println(replace);



    }
}