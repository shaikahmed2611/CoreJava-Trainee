package com.evergent.corejava.CaseStudyOfQueue;
/*
 *  private String name;

	private String source_location;
	private String destination_location;
	private int price;
 */
import java.util.*;
public class MainMethodImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		
		TicketInterfaceImplementation tI=new TicketInterfaceImplementation();
		while(true)
		{
			System.out.println("======================");
			System.out.println(" Ticket Booking System");
			System.out.println("======================");
			System.out.println("1-Booking Ticket");
			System.out.println("2-ProcessNextTicket");
			System.out.println("3-PeekNextTicket");
			System.out.println("4-ALL Available ticket to process");
			System.out.println("5-Application Exit");
			System.out.println("Please Select one Option");
			int n1=scr.nextInt();
			switch(n1)
			{
			case 1:
				Ticket t=new Ticket();
				    System.out.println("Enter the Name");
				    t.setName(scr.next());
				    System.out.println("Enter the Source Location");
				    t.setSource_location(scr.next());
				    System.out.println("Enter the destination");
				    t.setDestination_location(scr.next());
				    System.out.println("Enter the Number of Ticket 800 per head");
				    int res=scr.nextInt();
				    t.setPrice(res*800);
				    tI.addTicket(t);
				    break;
			case 2:
				    tI.processNextTicket();
				    break;
			case 3:tI.peekNextTicket();
			       break;
			case 4:tI.displayQueue();
			       break;
			case 5:System.exit(0);
			       break;
				    
				    
				  
				
				    
			}
			
		}
		

	}

}
