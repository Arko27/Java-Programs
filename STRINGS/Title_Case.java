import java.util.*;
class Title_Case
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int i,len;
        char ch,ch1;
        s=" "+s;
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.print(ch);
                ch1=s.charAt(i+1);
                System.out.print((char)(ch1-32));
                i++;
            }
            else
            System.out.print(ch);
        }
    }
}                