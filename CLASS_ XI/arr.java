//WAP to enter n no. of elements and display them
import java.util.*;
class arr
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the datas:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The datas are:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}