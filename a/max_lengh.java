// wap to enter n no of strings in an array and print the string with largest length.
import java.io.*;
class p8
{
    void main()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,i;
        System.out.println("enter n");
        n=br.readLine();
        String a[]=new String[n];
        System.out.println("enter the strings");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        String max=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i].length() > max.length())
            max=a[i];
        }
        System.out.println("The String with maximum length is "+max);
    }
}