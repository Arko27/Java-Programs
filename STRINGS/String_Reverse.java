import java.util.*;
public class String_Reverse
{
    String reverse(String str)
    {
        if((str==null)||(str.length()<=1))
        return str;
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main()
    {
        String_Reverse obj=new String_Reverse();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        String revs=obj.reverse(s);
        System.out.println("The String is "+s);
        System.out.println("The reversed String is "+revs);
        if(s.equalsIgnoreCase(revs))
        System.out.println("The string is Palindrome");
        else
        System.out.println("The string is not Palindrome");
    }
}