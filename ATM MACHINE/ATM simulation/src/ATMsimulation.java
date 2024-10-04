import java.util.Scanner;

public class ATMsimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
double balance = 1000.0;
int choice;
{
	System.out.println("Welcome to ATM");
	
	System.out.println("1.check Balance");
	
	System.out.println("2.check deposit");
	
	System.out.println("3.withdraw");
	
	System.out.println("4. Exit");
	
	System.out.println("Enter your choice");
	
	choice = scanner.nextInt();
	
	if(choice== 1){
		System.out.println("Your balance is" +balance);
	} else if(choice==2){
		System.out.println("Enter deposit amount");
		double deposit = scanner.nextDouble();
	System.out.println("balance" +deposit);
	}else if (choice==3){
		System.out.println("Enter withdrawal amount");
		double withdrawal = scanner.nextDouble();
		if(withdrawal <= balance){
			System.out.println(balance -= withdrawal);
			System.out.println("You withdrew"+withdrawal +"new balance" + balance);
		}else {
			System.out.println("Insufficientt balance");	
		} while(choice != 4){
			System.out.println("Thanks you for usiing the ATM");
			break;
		}
	}
}
	}
}
