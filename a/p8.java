// wap to enter n no of strings in an array and print the string with largest length.
import java.util.*;
class p8
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int n,i;
        System.out.println("enter n");
        n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("Enter the strings");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextLine();
        }
        String max=a[0];
        for(i=0;i<5;i++)
        {
            if(a[i].length() > max.length())
            max=a[i];
        }
        System.out.println("The String with maximum length is "+max);
    }
}