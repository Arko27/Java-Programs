import java.util.*;
class StringVerti
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of names to be entered");
        int n=sc.nextInt();
        String s[]=new String[n];
        int i,j,l,k;
        System.out.println("Enter the Strings");
        for(i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        
        for(k=0;k<n;k++)
        {
            l=s[k].length();
            for(i=0;i<n;i++)
            {
                for(j=0;j<l;j++)
                System.out.println(s[i].charAt(j));
                System.out.print("\t");
            }
        }
    }
}