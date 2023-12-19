package accessspecifiers;

import java.util.Scanner;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class AOT
		{
		   long area;
		      AOT(long b,long h)
		    {
		     area=(b*h)/2;  
		 
		    }
		}
		 
		 
		class Xyz 
		{
		   public static void main(String args[]) 
		    {   
		       
		      Scanner s= new Scanner(System.in);
		        
		      System.out.println("Enter the width of the Triangle:");
		   
		      long b= s.nextLong();
		 
		      System.out.println("Enter the height of the Triangle:");
		 
		          long h= s.nextLong();
		 
		          AOT A1=new AOT(b,h);
		      
		      System.out.println("Area of Triangle is: " + A1.area);      
		   }
		}
	}

}
