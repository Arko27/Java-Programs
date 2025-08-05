import java.util.*;
class Encryption
{
    char small(char a)
    {
        int a1=a+13;
        if(a1>122)        
        return((char)(a1-26));
        else
        return((char)a1);
    }
    char capital(char b)
    {
        int b1=b+13;
        if(b1>90)
        return((char)(b1-26));
        else
        return((char)b1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Encryption obj = new Encryption();
        System.out.println("Enter a String to be encrypted");
        String s=sc.nextLine();
        int i;
        char ch,c,c1;
        if(s.length()>3)
        {
            System.out.println("The cipher text is:");
            for(i=0;i<s.length();i++)
            {
                ch=s.charAt(i);
                if(Character.isLowerCase(ch)==true)
                {
                    c = obj.small(ch);
                    System.out.print(c);
                }
                else if(Character.isUpperCase(ch)==true)
                {
                    c1 = obj.capital(ch);
                    System.out.print(c1);
                }
                else
                System.out.print(ch);
            }
        }
        else
        System.out.println("INVALID LENGTH");
    }
}