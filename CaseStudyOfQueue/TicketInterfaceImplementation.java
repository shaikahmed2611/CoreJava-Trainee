package com.evergent.corejava.CaseStudyOfQueue;

import java.util.*;
public class TicketInterfaceImplementation implements TicketInterface
{
	ArrayDeque<Ticket> dq=null;
	TicketInterfaceImplementation()
	{
		dq=new ArrayDeque<Ticket>();
	}
	@Override
	public void addTicket(Ticket t1) {
		// TODO Auto-generated method stub
		dq.add(t1);
		System.out.println("Ticket added Successfully");
		
		
	}
	@Override
	public void processNextTicket() {
		// TODO Auto-generated method stub
		if(dq!=null && dq.size()>0)
		{
			Ticket r1= dq.poll();
			System.out.println(r1.getName()+"Ticket Is Going to be Process");
		}
		else
		{
			System.out.println("Ticket is not available to process");
		}
		
	}
	@Override
	public void peekNextTicket() {
		// TODO Auto-generated method stub
		/*
		 *  private String name;

			private String source_location;
			private String destination_location;
			private int price;
		 */

		if(dq!=null && dq.size()>0)
		{
			Ticket r1=dq.peek();
			System.out.println("Detail of Next Ticket  Name : "+r1.getName()+"\n Source Location "+r1.getSource_location()+"\n Destination Location "+r1.getDestination_location()+"\nPrice Of ticket "+r1.getPrice());
		}
		else
		{
			System.out.println("Ticket is not available to process");
		}
		
	}
	@Override
	public void displayQueue() {
		// TODO Auto-generated method stub
		if(dq.size()>0)
		{
	     for(Ticket t1:dq)
	     {
	    	 System.out.println(" name : "+t1.getName()+"\n Source :"+t1.getSource_location()+"\n Destination "+t1.getDestination_location()+"\n Price of Ticket "+t1.getPrice());
	     }
		}
		else
		{
			System.out.println("Ticket is not available to process");
		}
		
		
	}
	

}
