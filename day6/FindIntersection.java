package assignment.day6;

public class FindIntersection {

	public static void main(String[] args)
	{
		//2,4,7
		//Declare two arrays
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		//store the two for loop 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				// Two array are same
				if(a[i]==b[j])
					System.out.print(a[i]+a[j]);
			}
		}

	}

}

