package oops;
import java.util.*;
public class missing
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int n=sc.nextInt();
int[] a=new int [n];
int i,sum=0;

System.out.println("Printing the array of size n");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
	System.out.print(a[i]+" ");
}
	int ex_el=(n+1);
	int total_sum=(ex_el*(ex_el+1))/2;
	for(i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("\n The missing term is ="+(total_sum-sum));
		
	}
}