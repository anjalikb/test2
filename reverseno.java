package oops;
import java.util.*;
public class reverseno 
{
public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the size of array");
	 int n=sc.nextInt();
	  int[] a=new int[n];
	  System.out.println("enter the elements in array");
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  System.out.println("REVERSE ARRAY IS");
	  for(int i=n-1;i>=0;i--)
	  {
		  System.out.println(a[i]);
	  }
		

	}

}