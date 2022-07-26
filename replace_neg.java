package oops;
import java.util.*;
public class replace_neg
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int b[]=new int[10];
	int i,j=0;
	System.out.println("enter the elemets in array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	 System.out.println("Rplace all neative elemets end of the array");
	 for(i=0;i<a.length;i++)
	 {
		 if(a[i]>=0)
		 {
			 b[j]=a[i];
			 j++;
		 }
		 
	 }
	 for(i=0;i<a.length;i++)
	 {
		 if(a[i]<0)
		 {
			 b[j]=a[i];
			 j++;
		 }
	 }
	 for(i=0;i<b.length;i++)
	 System.out.println(b[i]+" ");
	

	}

}
