package com.evergent.corejava.ahmed.application1;

import java.util.Scanner;

import com.evergent.corejava.ahmed.application1.EventManagementSystem_RAM.submodule2;
import com.evergent.corejava.ahmed.application1.EventManagementSystem_RAM.submodule3;

public class SportManagementSystem2 {
     enum module1{
    	 O,P,R,E,M,CE
     }
     enum submodule1
     {
    	 F,S,M
     }
     enum submodule2
     {
    	 T,P,M
     }
     enum submodule3
     {
    	 I,S,M
     }
     enum menucode
     {
    	 A,B,C
     }
     enum tshirt
     {
    	 IND,PAK,ENG,AUS;
     }
     enum Eqp
     {
    	 KS,BJ
     }

     static int ticketcost;
 	static int amountcost;
 	static int guestcost;
 	static int amountdisc;
 	static int additionalitemcost;
 	static int equipmentcost;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String module=null;
		Scanner scr=new Scanner(System.in);
		System.out.println("\n\t\t \t\t Welcome To SPORT MANAGEMENT SYSTEM");
		while(true)
		{
			System.out.println("======================");
			System.out.println(" EMS Main Menu");
			System.out.println("======================");
			System.out.println("O-T-Shirt Booking Module");
			System.out.println("M-Match ticket booking Module");
		    System.out.println("CE-Cricket Equipment");
			System.out.println("P-Payment Module");
			System.out.println("R-Report Module");
			System.out.println("E-Quit Module");
			System.out.println("======================");
		    System.out.println("Enter your Module code (O,M,CE,P,R,E) : ");
		    module=scr.nextLine();
		    System.out.println("You entered module is  : " );
		    switch(module1.valueOf(module))
		    {
		    case M:	
		        System.out.println("Menu \t Description  \t Charge per ticket ");
		     	System.out.println("===============================================");
		     	System.out.println("A \t IND VS AUS \n	Uppal, Hyderabad, Telangana, India ,Date-24-08-2024     \t\t\t RM400.00");
		    	System.out.println("");
		    	System.out.println("B \t Pak VS ENG \n	Wankade, Wankhede Stadium, D Rd, Churchgate, Mumbai, Date-25-08-2024  \t\t RM600.00");
		    	
		    	System.out.println("C \t Ban VS SL \n	Columbo, Asgiriya Stadium,Sri-Lanka  Date-26-08-2024  \t\t RM500.00");
		    	System.out.println("===============================================");
		    	System.out.println("Enter your Menu code (A,B,C) : ");
		    	module=scr.nextLine();
		    	switch(menucode.valueOf(module))
		    	{
		    	case A:ticketcost=400;break;
		    	case B:ticketcost=600;break;
		    	case C:ticketcost=500;break;
		    	}
		    	System.out.println("Enter the number of ticket");
		    	
		    	guestcost =Integer.parseInt( scr.nextLine());
		    	System.out.println("you selected no of guests are "+guestcost);
		    	 amountcost=ticketcost*guestcost;
		    	
		    	System.out.println("Amount for Ticket before discount is Rs"+amountcost);
		    	if(guestcost >= 1 && guestcost <=25)
		    		amountdisc=(int) (amountcost-(amountcost*0.00));
		    	if(guestcost >= 26 && guestcost <=50)
		    		amountdisc=(int) (amountcost-(amountcost*0.03));
		    	else if(guestcost >= 51 && guestcost <=100)
		    		amountdisc=(int) ((amountcost-guestcost*0.05));
		    	else if(guestcost >= 101 && guestcost <=200)
		    		amountdisc=(int) ((amountcost-guestcost*0.08));	
		    	else if(guestcost >= 251)
		    		amountdisc=(int) ((amountcost-guestcost*0.10));	

		    	System.out.println("Amount for Ticket after Discount  is  Rs"+amountdisc);break;
		    case O:
		    	System.out.println("Item \t Description \t  Charge per Unit ");
		    	System.out.println("========================================================================");
		    	System.out.println("1 \t INDIA T-SHIRT \t   RM800.00 per unit ");
		    	System.out.println("");
		    	System.out.println("2 \t PAKISTAN T-SHIRT \t   RM600.00 per unit ");
		    	System.out.println("");
		    	System.out.println("3 \t AUSTRALIA \t    RM700.00 per unit ");
		    	System.out.println("");
		    	System.out.println("4 \t ENGLAND \t   RM700.00 per unit ");

		    	System.out.println("Enter your Menu code (IND,PAK,AUS,ENG) : ");
		    	module=scr.nextLine();
		    	switch(tshirt.valueOf(module))
		    	{

		    	case IND:
		    		additionalitemcost=800;
		    		break;
		    	case PAK:
		    		additionalitemcost=600;
		    		break;
		    	case AUS:
		    		additionalitemcost=700;
		    		break;
		    	case ENG:
		    		additionalitemcost=700;
		    		break;
		    	}
		    	System.out.println("Your T-Shirt Cost : Rs "+additionalitemcost);
		    	break;
		    case CE:
		    	System.out.println("Menu \t Description  \t Cricket Equipment ");
		     	System.out.println("===============================================");
		     	System.out.println("KS \t MRF BAT WITH KHOLI SIGN    \t\t\t RM 2400.00");
		    	System.out.println("");
		    	System.out.println("BJ \t BALL WITH JASPRITH BUMRAH SIGN Date-25-08-2024  \t\t RM1000.00");
		    	System.out.println("===============================================");
		    	System.out.println("Enter your Menu code (KS,BJ) : ");
		    	module=scr.nextLine();
		    	switch(Eqp.valueOf(module))
		    	{
		    	case KS:equipmentcost=2400;break;
		    	case BJ:equipmentcost=1000;break;
		    	}
		    	System.out.println("Your Equipment Cost"+equipmentcost);
		    	break;
		    	
		    case P:
		    	System.out.println(" Payment Module");
		    	System.out.println("======================");
		    	System.out.println("T-to display total amount to be paid");
		    	System.out.println("P-to make payment");
		    	System.out.println("M-Return to Main Menu");
		    	System.out.println("======================");
		    	System.out.println("Enter your Module code (T,P,M) : ");

		    	module=scr.nextLine();
		    	switch(submodule2.valueOf(module))
		    	{

		    	case T:
		    		System.out.println("Total Amount to be Paid : Rs"+(amountcost+additionalitemcost+equipmentcost));
		    		
		    	break;
		    	case P:System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost+equipmentcost));
		    	break;	
		    	}
		    	break;
		    case R:
		    	System.out.println(" Payment Module");
		    	System.out.println("======================");
		    	System.out.println("I-to dispaly invoice for order mode");
		    	System.out.println("S-to display the summary of orders and payments made");
		    	System.out.println("M-Return to Main Menu");
		    	System.out.println("======================");
		    	System.out.println("Enter your Module code (I,S,M) : ");

		    	module=scr.nextLine();
		    	switch(submodule3.valueOf(module))
		    	{

		    	case I:
				System.out.println("Invoice Display");
				System.out.println("==================");
				System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
				System.out.println("you selected no of guests are "+guestcost);
				System.out.println("you selected equipment cost "+equipmentcost);
				
				System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost+equipmentcost));
				

				break;
				case S:
					System.out.println("Summary Of Order");
				System.out.println("======================");
				System.out.println("you selected  item cost Rs"+amountcost);
				System.out.println("you selected no of guests are "+guestcost);
				System.out.println("Amount for ordered  after Discount for selected Ticket is  Rs"+amountdisc);
				System.out.println("Your Additional Cost : Rs "+additionalitemcost);
				System.out.println("you selected equipment cost "+equipmentcost);
				System.out.println("\n");
				System.out.println("Total Amount to be Paid : Rs"+(amountcost+additionalitemcost+equipmentcost));
				System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost+equipmentcost));

				break;	
				}
		    	break;
		    case E:
			    System.out.println("Quit Module");
			    System.exit(0);
		    	break;
		    }
		  
		    
		    	
		    
		}

	}

}
