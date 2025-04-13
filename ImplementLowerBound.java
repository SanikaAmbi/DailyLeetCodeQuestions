import java.util.Scanner;
class LowerBound
{
    int arr[];
    void setArray(int arr[])
    {
        this.arr=arr;
    }
    int checkLowBound(int x)
    {
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=x)
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
public class ImplementLowerBound {
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

        LowerBound lb=new LowerBound();
        lb.setArray(arr);
        int res=lb.checkLowBound(x);
        System.out.println("Lower Bound:"+res);
    }
}
