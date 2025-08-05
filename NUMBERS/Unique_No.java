import java.util.*;
class Unique_No
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        String n=sc.nextLine();
        int len=n.length();
        int i,j,d=0;
        char ch;
        for(i=0;i<len;i++)
        {
            ch=n.charAt(i);
            if(ch==0)
            System.out.println("Invalid input");
        }
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(n.charAt(i)==n.charAt(j))
                d++;
            }
        }
        if(d==0)
        System.out.println(n+" is a Unique Number");
        else
        System.out.println(n+" is not a Unique Number");
    }
}