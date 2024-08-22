package com.evergent.corejava.ahmed.application4;

import java.util.Scanner;



public class EmplyeeDetails extends Details_Field  implements Home
{
	
	enum log
	{
			LI,LG,DL,SD,EXE;
	}
	enum fl
	{
		SDI,BUS,ASE
	}
	 static String firstname=null;
	 static String lastname=null;
	 static String email=null;
	static String location=null;
	static String password=null;
	static String valpassword=null;
	static String valemail=null;
	 
	EmplyeeDetails()
	{
		
	}
	EmplyeeDetails(String firstname,String lastname,String email)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		
		
	}
	
	static int a=0;
	static int b=0;
	static int c=0;
	Scanner scr=new Scanner(System.in);
    
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String module=null;
		String module1=null;
		Scanner scr=new Scanner(System.in);
		EmplyeeDetails emp1=new EmplyeeDetails();
		System.out.println("\n\t\t \t\t Welcome To JOB Application MANAGEMENT SYSTEM");
		while(true)
		{
			System.out.println("======================");
			System.out.println(" JAMS Main Menu");
			System.out.println("======================");
			System.out.println("LI-Registration");
			System.out.println("LG-Login");
			System.out.println("DL-Details of comapny && Number of position available");
			System.out.println("SD-Submission of details Summary");
			
			System.out.println("======================");
		    System.out.println("Enter your Module code (LI,LG,DL,SD,EXE) : ");
		    module=scr.nextLine();
		    System.out.println("You entered module is  : " );
		    switch(log.valueOf(module))
		    {
		    case LI: System.out.println("You are in Register Module Field");
		             emp1.register();
		             break;
		    case LG: System.out.println("You are in Login Module Field");
		             emp1.login();
		             break;
		    case DL: System.out.println("This is field of availabe company module");
		             System.out.println("SDI-Software Developer Inter");
		           	 System.out.println("BUS-Bussiness Development ");
		             System.out.println("ASE-Associate Software Engineer");
		             System.out.println("Enter your Module code (SDI,BUS,ASE) : ");
		             module1=scr.nextLine();
		             switch(fl.valueOf(module1))
		             {
		             case SDI: System.out.println("This is the available Companys");
		                       emp1.detailofCompany3();
		                      
		                       System.out.println("Do You want to apply for for this company (Y/N)");
		                       String res=scr.nextLine();
		                       
		                       if(res.equals("Y"))
		                       {
		                    	  emp1.Employee_Details();
		                    	  a++;
		                       }
		                       else
		                       {
		                    	   break;
		                       }
		                       
		                       break;
		             case BUS:System.out.println("This is the available Companys");
                              emp1.detailofCompany2();
                              System.out.println("Do You want to apply for for this company (Y/N)");
		                       String res1=scr.nextLine();
		                       if(res1.equals("Y"))
		                       {
		                    	  emp1.Employee_Details();
		                    	  b++;
		                       }
		                       else
		                       {
		                    	   break;
		                       }

                             
                              break;
		             case ASE:System.out.println("This is the available Companys");
		                      emp1.detailofCompany3();
		                      c++;
		                      break;
		                      
		              
		             }
		             break;
		    case SD:System.out.println("Employee Summary");
		             emp1.Employee_Details();
		             break;
		    case EXE:System.out.println("Quit Module");
		             System.exit(0);
			         break;

		              
		         
		        
		   
		    
		           
		             
		             
		             
		
		    }
		}

}



	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Email");
	     valemail=scr.nextLine();
	     System.out.println("Enter the Password");
	     valpassword=scr.nextLine();
	      Login log1=new Login();
	      if(log1.LoginDetail(email,password,valemail,valpassword))
	      {
	    	  System.out.println("Do youwant to proceed further (Y/N");
	    	  String result=scr.nextLine();
	    	  if(result.equals("Y"))
	    	  {
	    	
	    	  System.out.println("This is the List Of available company");
	    	 
	    	  EmplyeeDetails emp1=new EmplyeeDetails();
	    	  emp1.detailofCompany1();
	    	  emp1.detailofCompany2();
	    	  emp1.detailofCompany3();
	    	  }
	    	  else
	    	  {
	    		  System.out.println("Thank you for login");
	    	  }
	    	  
	      }
		
		
		     
		
	}



	@Override
	public void register() {
		// TODO Auto-generated method stub
		 System.out.println("Enter the First Name");
	     firstname=scr.nextLine();
	     System.out.println("Enter the Last Name");
	     lastname=scr.nextLine();
	     System.out.println("Enter the Email");
	     email=scr.nextLine();
	     System.out.println("Enter the Password");
	     password=scr.nextLine();
	     System.out.println("Enter the Location");
	     location=scr.nextLine();
	     System.out.println("- - - - - - - - - - - - - - - - ");
		 System.out.println("REGISTRATION SUCCESSFULL");
		 System.out.println("- - - - - - - - - - - - - - - - ");
	     
		
	}



	
	  public void detailofCompany1() {
		// TODO Auto-generated method stub
		 System.out.println("- - - - - - - - - - - - - - - - ");
		 System.out.println("Capgemini");
		 System.out.println("- - - - - - - - - - - - - - - - ");
		
	     System.out.println("Role --->Associate Software Engineer");
	     System.out.println("Location - Hyderabad");
	     System.out.println("Number Of Open Position are 10");
	     System.out.println("Entry Level");
		
	}
  public void detailofCompany2() {
		// TODO Auto-generated method stub
		 System.out.println("- - - - - - - - - - - - - - - - ");
		 System.out.println("TCS  ");
		 System.out.println("- - - - - - - - - - - - - - - - ");
		
	     System.out.println("Role --->Bussiness Development");
	     System.out.println("Location - Hyderabad");
	     System.out.println("Number Of Open Position are 9");
		
	}
 public void detailofCompany3() {
		// TODO Auto-generated method stub
		 System.out.println("- - - - - - - - - - - - - - - - ");
		 System.out.println("Infoysis  ");
		 System.out.println("- - - - - - - - - - - - - - - - ");
	     System.out.println("Role --->Associate Software Developer Intern");
	     System.out.println("Location - Hyderabad");
	     System.out.println("Number Of Open Position are 12");
		
	}
	
	
	



	@Override
	public void Employee_Details()
	{
	     EmplyeeDetails eds=new EmplyeeDetails(firstname,lastname,email);
	    System.out.println("FirstName : "+firstname);
	    System.out.println("LastName : "+lastname);
	    System.out.println("Email : "+email);
	    
	     
	     if(a>0)
	     {
	    
	      eds.detailofCompany3();
	     }
	     else  if(b>0)
	      {
	    	  eds.detailofCompany2();
	      }
	     else if(c>0)
	      {
	    	  eds.detailofCompany1();
	      }
	     System.out.println("Data Submitted Successfully");
	      
	      
	     
	     
	     
	}
}
