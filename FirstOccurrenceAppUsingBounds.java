import java.util.Scanner;

class FirstOccurrence
{
    int arr[];
    
    void setArray(int arr[])
    {
        this.arr=arr;
    }
    int checkFirstOccurrence(int x)
    {
        int n=arr.length;
        int low=0;
        int high=arr.length-1;
        int first=n;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]>=x)
            {
                first=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return first;

    }
}
public class FirstOccurrenceAppUsingBounds {
    
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

        FirstOccurrenceApp fo=new FirstOccurrenceApp();
        fo.setArray(arr);
        int res=fo.checkFirstOccurrence(x);

        if(arr[res]!=x || res==arr.length)
        {
            System.out.println("element not found");
        }
        else
        {
        System.out.println("First Occurrence:"+res);
        }
    }
}

