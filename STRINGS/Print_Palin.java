import java.util.*;
class Print_Palin
{
    int palin(String s)
    {
        String w="";
        char ch;
        int i;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            w=ch+w;
        }
        if(w.equalsIgnoreCase(s) == true)
        return 1;
        else
        return 0;
    }
    
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,w="";
        int i,len,f,c=0;
        char ch;
        System.out.println("Enter a String:");
        s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        len=s.length();
        System.out.println("\nThe Palindromic Words are:");
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                f=palin(w);
                if(f==1)
                {
                    System.out.println(w);
                    c++;
                }
                w="";
            }
        }
        System.out.println("\nThere are "+c+" Palindromic Words");
    }
}