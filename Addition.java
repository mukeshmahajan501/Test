package Airthmatic.subpackage1;
import java.util.*;
public class Addition
{	
	
public void addition()
	{
	int n1,n2,res;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n enter number1: ");
	n1=sc.nextInt();
	System.out.println("\n enter number2: ");
	n2=sc.nextInt();
	res=n1+n2;
	System.out.println("Addition is:"+res);
	}
}