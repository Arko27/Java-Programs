import java.util.*;
class Freq_Char
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int s1,i,j;
        int len=s.length();
        for(i=65;i<=90;i++)
        {
            s1=0;
            for(j=0;j<len;j++)
            {
                if((s.charAt(j)==i)||(s.charAt(j)==(i+32)))
                s1++;
            }
            if(s1>0)
            System.out.println("No. of "+(char)i+" in the string is "+s1);
        }
    }
}