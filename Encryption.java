import java.util.*;
class Encryption
{
    char small(char a,int n1)
    {
        int a1=a+n1;
        if(a1>122)        
        return((char)(a1-26));
        else
        return((char)a1);
    }
    char capital(char b,int n2)
    {
        int b1=b+n2;
        if(b1>90)
        return((char)(b1-26));
        else
        return((char)b1);
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to be encrypted");
        String s=sc.nextLine();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int i;
        char ch,c,c1;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isLowerCase(ch)==true)
            {
                c=small(ch,n);
                System.out.print(c);
            }
            else if(Character.isUpperCase(ch)==true)
            {
                c1=capital(ch,n);
                System.out.print(c1);
            }
            else
            System.out.print(ch);
        }
    }
}