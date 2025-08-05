//WAP to enter the sales of each day of the week and the print its average
import java.util.*;
class sales_avg
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,i,s=0,avg;
        int a[] = new int[7];
        System.out.println("Enter the datas:");
        for(i=0;i<7;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<7;i++)
        {
            s=s+a[i];
        }
        avg = s/7;
        System.out.println("The average is"+avg);
    }
}