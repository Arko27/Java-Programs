import java.util.*;
class All_Palindrome
{
    boolean Palin(String w)
    {
        int i,len;
        len = w.length();
        char ch;
        String rev = "";
        for(i = 0;i < len;i++)
        {
            ch = w.charAt(i);
            rev = ch + rev;
        }
        return (rev.equals(w));
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        All_Palindrome obj = new All_Palindrome();
        int len,i;
        String w="";
        char ch;
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        s.trim();
        s = s + " ";
        len=s.length();
        for(i = 0;i < len;i++)
        {
            ch = s.charAt(i);
            if(ch != ' ')
                w = w + ch;
            else
            {
                if(obj.Palin(w))
                    System.out.println(w);
                w = "";                
            }
            
        }
    }
}
