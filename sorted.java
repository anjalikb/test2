package oops;

public class sorted {

	public static void main(String[] args)
	{
	 int a [] = {1,2,3,4,5,6};
	 int b[]= {5,6,7,8,9};
	 int c[]= {5,6,10,11,12};
	 int i=0;
	 int j=0; 
	 int k=0;
	 System.out.println("Same elements in array");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				for(k=0;k<c.length;k++)
				{
					if( a[i]==b[j] && b[j]==c[k] )
					{
						System.out.println(a[i]+" ");
					}
				}
			}
			
	 }

	}

}