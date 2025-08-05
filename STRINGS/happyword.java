import java.util.*;
class happyword
{
    void happy(int a)
    {
        int c,s=0;
        while(a>9)
        {
            while(a>0)
            {
                c=a%10;
                s=s+c*c;
                a=a/10;
            }
            a=s;
            s=0;
        }
        
        if(a==1)
        System.out.println("It is a happy number");
        else
        System.out.println("It is not a happy number");
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w="";
        char ch;
        int i;
        System.out.println("enter the string");
        s=sc.nextLine();
        s=s.toUpperCase();
        int len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            w=w+String.valueOf(ch-64);
        }
        int b=Integer.parseInt(w);
        happy(b);
    }
}
    