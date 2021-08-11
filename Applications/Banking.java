/*
This is a console application simulates a banking processes 
from creating account, login in, depositing, withdrawing 
and balance checking
*/

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Banking {
	
	private static  Scanner sc = new Scanner(System.in);
	private static Account acc=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginmenu();
	}
	
	private static void loginmenu() {
		do {
			System.out.println("Select Approprite action from menu below");
			System.out.println("1. Login  ");
         System.out.println("2. New Account");
         System.out.println("0. Exit");
         
			int input = sc.nextInt();

			switch(input) {
			case 1:
				System.out.println("Enter your Account pin ");				
				int pin = sc.nextInt();
				acc = AccountRepository.AuthenticateAccount(pin);
				
				if(acc != null) {
					mainmenu();
				}else {
					System.out.println("Account Not Fount ");
				}
				break;
				
			case 2:
				AccountRepository.NewAccount();
				break;
         case 0:
            System.out.println("Bye!");
			   System.exit(0);
            break;
         default:
					System.out.println("Invalid Input ");
					break;
			}	
		}while(true);
	}
	
	private static void mainmenu() 
	{
		System.out.println("Welcome to ABC Bank");
		System.out.println();
		
		do 
		{
			System.out.println("Choose from menu Below");
			System.out.println();

			System.out.println("1. Deposit  ");
         System.out.println("2. Withdraw ");
			System.out.println("3. Balance  ");
         System.out.println("4. Logout   ");
       
			int choice = sc.nextInt();

			switch(choice) {
			
			case 1:
				AccountRepository.accDeposit(acc);
				break;
			case 2:
				AccountRepository.accwithDraw(acc);
				break;
			case 3:
				AccountRepository.accBalance(acc);
				break;
			case 4:
				loginmenu();
				break;
			default:
					System.out.println("Enter choice from the menu");
				break;
			}			
		}while(true);
	}
	
}

class Account {
	
	private int accNo;
	private long pin;
	private double balance;
	
	//constructors 
   public Account() {}
   
	public Account(int accNo, long pin, double balance) {
		super();
		this.accNo = accNo;
		this.pin = pin;
		this.balance = balance;
	}
   
   //getter
	public int getAccNo() {
		return accNo;
	}
   
	//setter
   public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
   
	//getter
   public long getPin() {
		return pin;
	}
	//setter
   public void setPin(long pin) {
		this.pin = pin;
	}
	
   public double getBalance() {
		return balance;
	}
	
   public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

class AccountRepository {
	
	private static Scanner sc = new Scanner(System.in);
   
	private static List<Account> acclist= new ArrayList<>();

	public static Account AuthenticateAccount(long pin) 
	{
		List<Account> accounts =acclist;
		
		if(!accounts.isEmpty()) {
   		for(Account c: accounts) {		
   			if(c.getPin() == pin) {
   				return c;
   			}else {
   				return null;
   			}
   		}
   		}else {
   			System.out.println("No Record Found !");
   		}
		return null;
	}
   
	public static void accDeposit(Account acc){
	
		printData(acc);
		System.out.println();
		
      System.out.println("Enter Amount to Deposit: ");
		double inputAmount = sc.nextDouble();		
		double balance = acc.getBalance() + inputAmount;
		acc.setBalance(balance);
		
		System.out.println("successfully Deposited amount: " + inputAmount);
		System.out.println();
		
		printData(acc);
	}

	private static void printData(Account acc) {

		System.out.println("===================================");
		System.out.println("====Current Account information====");
		System.out.println("===================================");
		System.out.println("========Account Number: "+ acc.getAccNo() +"=====");
		System.out.println("===================================");
		System.out.println("=========Balance: "+ acc.getBalance() +"============");
		System.out.println("===================================");
	}

	public static void accwithDraw(Account acc) 
	{
		printData(acc);
		System.out.println();
		System.out.println("Enter Amount to Withdraw: ");
		double inputAmount = sc.nextDouble();
		
		if(inputAmount < acc.getBalance()) {
		
		double balance = acc.getBalance() - inputAmount;
		
		acc.setBalance(balance);
		System.out.println("Cash Withdrawal Successful: " + inputAmount);

		}else {
			System.out.println("You are trying to withdraw \nmore than what you have in your account");         
		}
		
		System.out.println();
		printData(acc);
	}
	
	public static void accBalance(Account acc) {

		System.out.println("===================================");
		System.out.println("====Current Account information====");
		System.out.println("===================================");
		System.out.println("========Account Number: "+ acc.getAccNo() +"=====");
		System.out.println("===================================");
		System.out.println("=========Balance: "+ acc.getBalance() +"============");
		System.out.println("===================================");
	}
	
	
	
	public static void NewAccount() {
		double intialbalance = 0.0;
		Account ac = new Account();
	   ac.setAccNo(generateAccNo());
	   ac.setPin(generatePin());
	   ac.setBalance(intialbalance);
	   acclist.add(ac);
	   System.out.println("Account was successfully created");
	   System.out.println();
	   System.out.println("Your Account Details are AccNo: "+ ac.getAccNo() + " Account Pin: " +ac.getPin());
	}
	
	public static int generatePin() 
	{
		int pin =(int) (Math.random() * 1000 ) + 1000;
		return pin;
	}
	public static int generateAccNo(){
		
		do{
			
			int generatedValue =(int) (Math.random() * 1000000 ) + 1000;
			System.out.println("Do you want to create new Account  \n (Y) OR (N) ? press (E) to Exit");
			String input = sc.next();
			switch(input) {
			case "Y":
				return generatedValue;
			case "N":
				System.out.println("Account cannot be created");
				break;
			case "E":
				System.out.println("Main menu");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}while(true);
	}
}



