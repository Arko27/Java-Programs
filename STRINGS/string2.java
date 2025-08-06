import java.util.*;
class string2
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        int i,c=0;
        char ch;
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int len=s.length();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            c++;
        }
        System.out.println(c);
    }
}