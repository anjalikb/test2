package oops;

public class non_reapiting {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,2,3,5,6};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
		
		{

			if(a[i]!=a[j])
			{
				System.out.println(a[j]);
			}
				
			}
		}
		

	}

}