import java.util.*;
 class small 
{

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		int i,j,k;
		int[] a=new int[10];
		System.out.println("ENTER THE ELEMENTS IN ARRAY");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
			}
		}
		System.out.println("Sorted Array");
		  for(i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]+" ");
		  }
		  System.out.println(a[0]+"Smallest elements in array");
	}

}
   