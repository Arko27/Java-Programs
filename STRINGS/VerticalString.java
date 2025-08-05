import java.util.*;
class VerticalString
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,max=0;
        System.out.println("Enter N");
        n=sc.nextInt();
        String[] s=new String[n+1];
        
        System.out.println("Enter the Strings");
        for(i=0;i<=n;i++)
        {
            s[i]=sc.nextLine();
        }
        
        for(i=0;i<=n;i++)
        {
            if(max<s[i].length())
            max=s[i].length();
        }
        
        System.out.println("\nThe names in vertical order are: ");
        for(i=0;i<max;i++)
        {
            for(j=0;j<=n;j++)
            {
                if(i<s[j].length())
                    System.out.print(s[j].charAt(i)+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}