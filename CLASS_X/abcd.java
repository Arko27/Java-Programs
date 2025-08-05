//WAP to enter n of strings and print the strins with even no of charecters 
import java.util.*;
class abcd
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int n;
        System.out.println("enter the no. of strings");
        n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("Enter the strings");
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextLine();
        }
        for(i=0;i<n;i++)
        { if(a[i].length() % 2==0)
            System.out.println(a[i]);
        }
    }
}
            
            
            
        
        