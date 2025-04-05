import java.util.Scanner;
import java.util.Arrays;
class Intersection
{
	int m[],n[];
	void setArray(int a[],int b[])
	{
		m=a;
		n=b;
	}
	int [] intersection()
	{
		int size=m.length<n.length?m.length:n.length;
		int c[]=new int[size];
		int count=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				if(m[i]==n[j])
				{
					if(!isPresent(c,m[i],count))
					{
						 c[count++]=m[i];
					}
				}
			}
		}
		return copyArray(c,count);
	}
	int[] copyArray(int arr[],int limit)
	{
		int ans[]=new int[limit];
		for(int i=0;i<limit;i++)
		{
			ans[i]=arr[i];
		}
		return ans;
	}
	boolean isPresent(int arr[],int n,int limit)
	{
		for(int i=0;i<limit && i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				return true;
			}
		}
		return false;
	}
}
class IntersectionApp
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int size1,size2;
		System.out.println("Enter size1:");
		size1=sc.nextInt();
		int a[]=new int[size1];
		System.out.println("Enter elements in a:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter size2:");
		size2=sc.nextInt();
		int b[]=new int[size2];

		System.out.println("Enter elements in b:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		Intersection i1 = new Intersection();
		i1.setArray(a,b);
		int res[]=i1.intersection();

		
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}	

	}
}