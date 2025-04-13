import java.util.Scanner;

class LOccurrence
{
    int arr[];
    void setArray(int arr[])
    {
        this.arr=arr;
    }
    int checkLastOccurrence(int x)
    {
        int low=0;
        int high=arr.length-1;
        int last=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]>x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return last;
    }
}
public class LastOccurrenceApp {
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

        System.out.println("Enter x:");
        int x=sc.nextInt();

        LOccurrence lo=new LOccurrence();
        lo.setArray(arr);
        int res=lo.checkLastOccurrence(x);

        if(res==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Last Occurrence:"+res);
        }
    }
}
