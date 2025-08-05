import java.util.*;
class upright
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int len,i;
        String s,w="",r="";
        char ch;
        System.out.println("Enter a string");
        s=sc.nextLine();
        s=s.trim();
        s=" "+s;
        len=s.length();
        for(i=len-1;i>=0;i--)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                r = w+" "+r;
                w = "";
            }
        }
        System.out.println("the upright is ="+r);
    }
}