import java.util.*;
class string
{
    public static void main(String args[])
    {
        int len,c=0,i;
        String s;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        len=s.length();
        for(i=0;i<len;i++)
        {
             ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c++;
        }
        System.out.println(c);
    }
}