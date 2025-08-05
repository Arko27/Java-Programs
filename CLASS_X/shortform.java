import java.util.*;
class shortform
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int len,i;
        String s,w="";
        char ch;
        System.out.println("Enter a string");
        s=sc.nextLine();
        s=s.trim();
        s=" "+s;
        len=s.length();
        for(i=0;i<len;i++)
        {
          ch=s.charAt(i);
          if(ch==' ')
          w=w+s.charAt(i+1)+".";
        }
        System.out.println("The shortform is="+w);
    }
}
  