import java.util.*;

class BinerySearch
{
public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("no.of element :");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter element in array:");
	for(int i=0;i<n;i++)
		{
		  arr[i]=sc.nextInt();
		}
	System.out.println("\n enter element to search:");
	int ele=sc.nextInt();
	int low=0;
	int high=arr.length-1;
	int mid=(low+high)/2;
	
		while(low<high)
		 {
			if(arr[mid]==ele)
				{
					System.out.println("element found at poistion"+mid);
					break;
				}
			else if(arr[mid]<ele)
				{
					low=mid+1;
				}
			else{
				high=mid-1;
			     }
			mid=(low+high)/2;
		 }
		if(low>high){
		System.out.println("\n element not found");
		}
	}
}