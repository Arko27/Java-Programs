import java.util.*;
class delvowels
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A SENTETNCE");
        String s=sc.nextLine();
        
        String b="";
        int i,len=s.length();
        char c;
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c!='a'&& c!='e'&& c!='i'&& c!='o'&& c!='u')
            b=b+c;
        }
        System.out.println("NEW STRING IS "+b);
    }
}