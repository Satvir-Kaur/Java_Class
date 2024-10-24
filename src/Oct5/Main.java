package Oct5;

import java.util.Scanner;

public class Main {
          static char ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Addition addition = new Addition();
        Substraction substraction = new Substraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Modulus modulus = new Modulus();
   do{
        System.out.println("Choose from following options:\n 1.Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division");
        int choice= sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter first number");
                float num1 = sc.nextFloat();
                System.out.println("Enter second number");
                float num2 = sc.nextFloat();
                float result= addition.sum(num1, num2);
                System.out.println("The result is: " + result);
                break;
            case 2:
                System.out.println("Enter first number");
                float num3 = sc.nextFloat();
                System.out.println("Enter second number");
                float num4 = sc.nextFloat();
                float result2= substraction.sub(num3,num4);
                System.out.println("The result is: " + result2);
                break;
          case 3:
              System.out.println("Enter first number");
              float num5 = sc.nextFloat();
              System.out.println("Enter second number");
              float num6 = sc.nextFloat();
              float result3= multiplication.multiply(num5,num6);
              System.out.println("The result is: " + result3);
              break;
          case 4:
              System.out.println("Enter first number");
              float num7= sc.nextFloat();
              System.out.println("Enter second number");
              float num8= sc.nextFloat();
              float result4= division.division(num7,num8);
              System.out.println("The result is: " + result4);
              break;
       default:
          System.out.println("Invalid option");}
          System.out.println("Do you want to continue\n Press y for yes, n for no");
          ch=sc.next().charAt(0);
      }while (ch=='y'||ch=='Y');
      System.out.println("Thank you!!! System is Exiting");

   }
}