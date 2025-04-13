import java.util.Scanner;
class FOccurrence
{
    int arr[];
    void setArray(int arr[])
    {
        this.arr=arr;
    }
    int checkFOcurrence(int x)
    {
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        System.out.println(low);
        System.out.println(high);
        return first;
    }
}
public class FirstOccurrenceApp {
    
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

        FOccurrence f=new FOccurrence();
        f.setArray(arr);
        int res=f.checkFOcurrence(x);

        if(res==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
        System.out.println("First Occurrence of "+x+" is: "+res);
        }
    }

}
