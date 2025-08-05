import java.util.*;
class Longest_Palidrome
{
    int palin(String s)
    {
        int i,len;
        String w="";
        char ch;
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            w=ch+w;
        }
        if(s.equals(w)==true)
        return 1;
        else
        return 0;
    }
    
    void main()
    {
        String s,w="";
        int i,j=0,p,len;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        s=s+" ";
        len=s.length();
        String a[]=new String[len];
        
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                p=palin(w);
                if(p==1)
                {
                    a[j++]=w;
                }
                w="";
            }            
        }
        
        for(i=0;i<j;i++)
            System.out.println(a[i]);
    }
}