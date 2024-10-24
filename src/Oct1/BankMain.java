package Oct1;
import java.util.Scanner;
public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in); char ch;
        System.out.println("Enter Your Choice\n 1.Input Your Details\n 2.Know Your Account Balance\n 3. Deposit Money\n 4. Withdraw Money\n 5. Exit");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter Your First Name");
            String firstName = sc.next();
            System.out.println("Enter Your Last Name");
            String lastName = sc.next();
            System.out.println("Welcome " + firstName + " " + lastName);
            //System.out.println("Do you want  continue? press y for yes\n press n for No");
            //ch = sc.next().charAt(0);
        //continue;
        }
        else if(choice ==2)
        {
           bank.getAccountBalance();


        }
        else if(choice == 3)
        {
            bank.deposit();

        }
        else if(choice == 4)
        {
            bank.withdraw();
        }

        else if(choice == 5)
        {
            System.exit(0);

        }
        else{
            System.out.println("Invalid Choice");

        }


    }
}
