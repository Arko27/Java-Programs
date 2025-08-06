//a program to replace all vowels with (*)
import java.util.*;
class vowels_replace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER SENTENCE");
        String s=sc.nextLine();
        s=s+" ";
        String w="";
        int i,len=s.length();
        char c;
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
            w=w+"*";
            else
            w=w+c;
        }
        System.out.println("NEW STRING IS => "+w);
    }
}