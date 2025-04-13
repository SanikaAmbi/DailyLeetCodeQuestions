import java.util.Scanner;

public class ReverseArrayBrute {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size:");
        size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int rev[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            rev[i]=arr[arr.length-i-1];
        }

        for(int i=0;i<rev.length;i++)
        {
            System.out.print(rev[i]+" ");
        }
    }
}
