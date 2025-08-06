import java.util.*;
class palindrome
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int len,i;
        String s,w="";
        char ch;
        System.out.println("Enter a string");
        s=sc.nextLine();
        len=s.length();
        for(i=len-1;i>=0;i--)
        {
            ch=s.charAt(i);
            w=w+ch;
        }
        if(s.equals(w)==true)
        System.out.println("it is a palindrome");
        else
        System.out.println("it is not an palindrome");
    }
}
