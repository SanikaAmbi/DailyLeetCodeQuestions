import java.util.Scanner;

class UpperBound
{
    int arr[];
    void setArray(int arr[])
    {
        this.arr=arr;
    }
    int checkUpperBound(int x)
    {
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
           
        }
        return ans;
    }
}
public class ImplementUpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter elements in array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter x");
        int x=sc.nextInt();

        UpperBound  ub=new UpperBound();
        ub.setArray(arr);
        int res=ub.checkUpperBound(x);
        System.out.println("Upper Bound:"+res);
    }
}
