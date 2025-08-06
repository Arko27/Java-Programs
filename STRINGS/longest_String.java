import java.util.*;
class longest_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s+" ";
        String w="",max="";
        int i,len=s.length(),p=0;
        char c;
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            w=w+c;
            else
            {
                if(p<w.length())
                {
                    p=w.length();
                    max=w;
                }
                w="";
            }
        }
        System.out.println("Longest word is "+max+"and length is "+p);
    }
}