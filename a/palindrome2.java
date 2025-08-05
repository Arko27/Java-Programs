import java.util.*;
class palindrome2
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        String s,w="";
        int i;
        char ch;
        System.out.println("enter the string");
        s=sc.nextLine();
        int len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            w=ch+w;
        }
        if(w.equals(s))
        System.out.println("it is a palindrome word");
        else
        System.out.println("not a palindrome word");
    }
}