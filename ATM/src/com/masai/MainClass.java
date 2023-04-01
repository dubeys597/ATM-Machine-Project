package com.masai;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		AtmOperationInterf op= new AtmOperationInterfImpl();
		int atmnumber=12345;
		int atmpin=123;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine.");
		System.out.print("Enter Atm Number : ");
		int atmNumber=in.nextInt();
		System.out.print("Enter Pin: ");
		int pin = in.nextInt();
		if((atmnumber==atmNumber) && (atmpin==pin)) {
			while(true) {
				System.out.println("1. View Available Balance \n 2. Withdraw Amount \n 3. Deposit Amount \n 4. View Ministatement \n 5. Exit");
				System.out.println("Enter Choice : ");
				int ch=in.nextInt();
				if(ch==1) {
					op.viewBalance();
				}else if(ch==2) {
					System.out.println("Enter Amount to Withdraw.");
					double withdrawAmount=in.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}else if(ch==3) {
					System.out.println("Enter Amount to Deposit :");
					double depositAmount=in.nextDouble();
					op.depositAmount(depositAmount);
					
				}else if(ch==4) {
					op.viewMiniStatement();
					
				}else if(ch==5) {
					System.out.println("Collect your ATM card \n Thank you for using");
					System.exit(0);
				}else {
					System.out.println("Please Enter Valid Number");
				}
			}
		}else {
			System.out.println("Incorrect Atm Number or Pin");
			System.exit(0);
		}
	}
}
