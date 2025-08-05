import java.util.*;
class Fascinating_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter a no.");
        int n=sc.nextInt();
        int i,j,d = 0;
        boolean flag = true;
        String s="";
        char ch;

        String a = Integer.toString(n) + " " + Integer.toString(n*2) + " " + Integer.toString(n*3);
        System.out.println(n + " * 2 = " + n*2);
        System.out.println(n + " * 3 = " + n*3);
        System.out.println("The concatenated number is " + a);
        int len = a.length();
      
        for(i = 0;i < len;i++)
        {
            ch = a.charAt(i); 
            if(ch != '0')
                s = s + ch;
        }
        
        for(i = 1;i <= 9;i++)
        {
            d = 0;
            for(j = 0;j < s.length();j++)
            {
                if(i == (s.charAt(j) - '0'))
                    d++;
            }
            
            if(d != 1)
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
            System.out.println(n+" is Fascinating Number");
        else
            System.out.println(n+" is not Fascinating Number");
    }
}