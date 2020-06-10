package Airthmatic.subpackage2;
import java.util.*;
public class Substraction
{	
	
public void substraction()
	{
	int n1,n2,res;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n enter number1: ");
	n1=sc.nextInt();
	System.out.println("\n enter number2: ");
	n2=sc.nextInt();
	res=n1-n2;
	System.out.println("Substraction is:"+res);
	}
}