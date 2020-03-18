import java.lang.*;

import java.util.*;

class  Task1
{
    
	static int divide(int a,int b)
    	
	{
        
		int i=a/b;
        
		return i;
    
	}
	static int computeDivision(int a,int b)
    
	{
        
		int res=0;
         
	try 
         
	{
             
		res=divide(a,b);
         
	}
         
	catch(NumberFormatException ne)
         
	{
             
		System.out.println("number format exception has occured");
         
	}
         
	return res;
    
	}
	public static void main(String args[])
    
	{
        
		Scanner scan=new Scanner(System.in);
        
		int x=scan.nextInt();
        
		int y=scan.nextInt();
        
		try
        
		{
            
			int j=computeDivision(x,y);
        
		}
        
		catch(ArithmeticException na)
        
		{
            
		System.out.println(na.getMessage());
        
		}
    
	}

} 