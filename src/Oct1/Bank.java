package Oct1;
import java.util.Scanner;
public class Bank {
     Scanner sc=new Scanner(System.in);
     double accountNumber;
     String firstName;
     String lastName;
     double balance;

     public void getAccountBalance()
     {
          System.out.println("Balance is: " + balance);
     }
      public void withdraw()
      {
          System.out.println("Enter ammount to withdraw: ");
          double withdrawAmount=sc.nextDouble();
          if(withdrawAmount<balance){
              balance=balance-withdrawAmount;}
           else {
               System.out.println("Insufficient balance");}
          }
       public void deposit()
          {
              System.out.println("Enter ammount to deposit: ");
              double depositAmount=sc.nextDouble();
              balance=balance+depositAmount;
          }




}
