import java.util.*;
class ISBN
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 10 digit no.");
        String s=sc.nextLine();
        int len=s.length();
        if(len!=10)
        System.out.println("INVALID INPUT");
        else
        {
            int i,dig=0,sum=0,k=10;
            char ch;
            for(i=0;i<len;i++)
            {
                ch=s.charAt(i);
                if(ch=='X')
                dig=10;
                else
                dig=ch-48;
                sum=sum+dig*k;
                k--;
            }
            System.out.println("The sum of the digits= "+sum);
            if(sum%11==0)
            System.out.println("It is an ISBN No.");
            else
            System.out.println("It is not an ISBN No.");
        }
    }
}