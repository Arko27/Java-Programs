import java.util.*;
class happy_word
{
    void happy(int n)
    {
        int s=0,rem;
        while(n>9)
        {
            while(n>0)
            {
                rem=n%10;
                s=s+rem*rem;
                n=n/10;
            }
            n=s;
            s=0;
        }
        if(n==1)
        System.out.println("Happy No");
        else
        System.out.println("Not Happy No");
    }
    
    void main()
    {
        int i,len,n;
        String sr,w="";
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        sr=sc.nextLine();
        len=sr.length();
        sr=sr.toUpperCase();
        
        for(i=0;i<len;i++)
        {
            ch = sr.charAt(i);
            w = w + String.valueOf(ch-64);
        }
        
        n = Integer.parseInt(w);
        happy(n);
    }
}