import java.util.*;
class join_abbreviate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=" "+s;
        String w="";
        char c;
        int i,len=s.length();
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            w=w+s.charAt(i+1);
        }
        System.out.println("NEW STRING IS ="+w);
    }
}
    