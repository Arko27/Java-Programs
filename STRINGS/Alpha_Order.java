import java.util.*;
class Alpha_Order
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int i,j;
        int len=s.length();
        for(i=65;i<=90;i++)
        {
            for(j=0;j<len;j++)
            {
                if((s.charAt(j)==i)||(s.charAt(j)==(i+32)))
                System.out.print(s.charAt(j));
            }
        }
    }
}