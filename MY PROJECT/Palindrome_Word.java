import java.util.*;
class Palindrome_Word
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        char ch;
        s=s+" ";
        int len=s.length();
        int i;
        String w="",r="";
        System.out.println("The Palindromic words are: ");
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
            w=w+ch;
            r=ch+r;
        }
        else
        {
            if(w.equalsIgnoreCase(r)==true)
            System.out.println(w);
            w="";
            r="";
        }
    }
  }
}
