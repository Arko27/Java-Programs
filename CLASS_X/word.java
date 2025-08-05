/*WAP to input a string and print the words
 * Input: "I study in Class 10"
 * Output:
 * 
 * I
 * study
 * in
 * Class
 * 10*/
 
import java.util.*;
class word
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="";
        int i;
        char ch;
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s.trim();
        s=s + " ";
        int len=s.length();
        for (i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch != ' ')
            w=w+ch;
            else
            {
                System.out.println(w);
                w="";
            }
        }
    }
}