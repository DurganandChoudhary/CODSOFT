package AtmSimulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmOperations implements AtmOpInterface{
    ATM atm=new ATM();
    Map<Double,String> ministmt=new HashMap<>();
    
    //Method to View Balance
    @Override
    public void viewBalance() {
    	System.out.println("\nLoading Accout Balance.......");
        System.out.println("Your Current Balance is : "+atm.getBalance());
        	System.out.println();
    }

    //Method to Withdraw Amount
    @Override
    public void withdrawAmount(double withdrawAmount) {
    	Scanner sc=new Scanner(System.in);
        if(withdrawAmount%100==0) {
            if (withdrawAmount <= atm.getBalance()) {
            	System.out.println("Confirm? Y/N");
            	String confirm=sc.next();
            	if(confirm.equals("Y")) {
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            	}
            } else {
                System.out.println("Insufficient Balance !!");
            }
        }
        else {
            System.out.println("Please enter the amount in multipal of 100");
        }

    }

    //Method to ddeposit Amount
    @Override
    public void depositAmount(double depositAmount) {
    	System.out.println("Confirm? Y/N");
    	Scanner sc=new Scanner(System.in);
    	String confirm=sc.next();
	    if(confirm.equals("Y")) {
        ministmt.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
        
	    }
    }

    //Method to View Mini Statement
    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
