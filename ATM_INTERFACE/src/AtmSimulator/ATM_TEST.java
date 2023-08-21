package AtmSimulator;

import java.util.Scanner;
public class ATM_TEST {

    public static void main(String[] args) {
        AtmOpInterface op=new AtmOperations();
        int atmpin=1920;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to your bank account !!!");
        
            while(true){
                System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit\n");
                System.out.print("Enter Choice : ");
                int ch=in.nextInt();
                
                if(ch==1){
                	System.out.print("Enter ATM Pin: ");
                    int pin=in.nextInt();
                	if(atmpin == pin){
                		 System.out.println("Account Authorized!\n");
                		 op.viewBalance();
                	    }
                	else{
                        System.out.println("Incorrect ATM pin");
                        System.exit(0);
                    }
                }
                
                else if(ch == 2){
                	System.out.print("Enter ATM Pin: ");
                    int pin=in.nextInt();
                	if(atmpin == pin){
                	    System.out.println("Account Authorized!\n");
                		System.out.println("Enter amount to withdraw ");
                		 	double withdrawAmount=in.nextDouble();
                		 	op.withdrawAmount(withdrawAmount);
                	 }
                	else{
                        System.out.println("Incorrect Atm Number or pin");
                        System.exit(0);
                    }
                }
                
                else if(ch == 3){
                	System.out.print("Enter ATM Pin: ");
                    int pin=in.nextInt();
                	if(atmpin==pin){
                		System.out.println("Account Authorized! \n");
                        System.out.println("Enter Amount to Deposit :");
                        double depositAmount=in.nextDouble();
                        op.depositAmount(depositAmount);
                	}
                	else{
                         System.out.println("Incorrect Atm Number or pin");
                         System.exit(0);
                    }
                }
                
                else if(ch == 4){
                	System.out.print("Enter ATM Pin: ");
                    int pin=in.nextInt();
                	if(atmpin==pin){
                		 System.out.println("Account Authorized! \n");
                		 System .out.println("Mini Statement");
                		 System.out.println("************************");
                         op.viewMiniStatement();
                	 }
                }
                
                else if(ch == 5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                
                else
                {
                    System.out.println("Please enter valid choice");
                }
            }
        }
    }
