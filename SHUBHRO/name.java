import java.util.*;
class name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        s=" "+s;
        String w="";
        int i,len=s.length();
        char c;
        int lastIdx =s.lastIndexOf(" ");
        for(i=0;i<lastIdx;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            w=w+s.charAt(i+1)+'.';
        }
        w=w+" "+s.substring(lastIdx+1);
        System.out.println(w);
    }
}