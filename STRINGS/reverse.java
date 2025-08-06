import java.util.*;
class reverse
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,s1="";
        char ch;
        int i,len;
        System.out.println("Enter the String");
        s=sc.nextLine();
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            s1=ch+s1;
        }
        System.out.println("The new String is "+s1);
    }
}