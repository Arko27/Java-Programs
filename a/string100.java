// wap to enter a sentence, convert it ro upper case.count and display those words that starts with 'A'.
import java.util.*;
class string100
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w="";
        char ch;
        int i,c=0;
        System.out.println("enter the sentence");
        s=sc.nextLine();
        s=s+" ";
        s=s.toUpperCase();
        int len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else 
            {
                if(w.charAt(0)=='A')
                {
                    c++;
                    System.out.println(w);
                }
                w="";
            }
        }
        System.out.println(c);
    }
}
                