import java.io.*;
class Menu
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for Duck number and 2 for Happpy number");
        System.out.println("Enter your choice");
        int c=Integer.parseInt(br.readLine());
        switch(c)
        {
            case 1:
            System.out.println("Enter a number");
            String n=br.readLine();
            int len=n.length();
            int ct=0;
            int i;
            char ch;
            char ch1=n.charAt(0);
            for(i=0;i<len;i++)
            {
                ch=n.charAt(i);
                if(ch=='0')
                ct++;
            }
            if(ch1!='0' && ct>0)
            System.out.println("Duck number:"+n);
            else
            System.out.println("Not a duck number");
            break;
            case 2:
            int x,s=0,rem;
            System.out.println("Enter a number:");
            x=Integer.parseInt(br.readLine());
            while(x>9)
            {
                s=x;
                x=0;
                while(s>0)
                {
                    rem=s%10;
                    x=x+(int)(Math.pow(rem,2));
                    s=s/10;
                }
            }
            if(x==1)
            System.out.println("Is happy number");
            else
            System.out.println("Is not happy number");
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}