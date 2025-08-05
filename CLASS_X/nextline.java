import java.util.*;
class nextline
{
    public static void main(String args[])
    {
        int len,i;
        String s,s1="";
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            s1=s1+'*';
            else
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}