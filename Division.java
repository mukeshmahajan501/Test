package Airthmatic.subpackage4;
import java.util.*;
public class Division
{	
	
public void division()
	{
	int n1,n2,res;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n enter number1: ");
	n1=sc.nextInt();
	System.out.println("\n enter number2: ");
	n2=sc.nextInt();
	res=n1/n2;
	System.out.println("Division is:"+res);
	}
}