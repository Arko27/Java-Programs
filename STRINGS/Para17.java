import java.util.*;
class Para17
{
    int lenword(String sent)
    {
        int i,l,w=0;
        char ch;
        sent=sent.trim();
        l=sent.length();
        for(i=0;i<l;i++)
        {
            ch=sent.charAt(i);
            if(ch==' ')
            w++;
        }
        return (w+1);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Para17 ob=new Para17();
        System.out.println("Enter a Paragraph: ");
        String p=sc.nextLine();
        String s[]=p.split("[\\.?!] ");
        int i,j,k,l,tmp;
        String t;
        l=s.length;
        int wl[]=new int[l];
        
        for(i=0;i<l;i++)
        wl[i]=ob.lenword(s[i]);
        
        for(i=0;i<l;i++)
        {
            for(j=0;j<l-1-i;j++)
            {
                if(wl[j]>wl[j+1])
                {
                    tmp=wl[j];
                    wl[j]=wl[j+1];
                    wl[j+1]=tmp;
                    
                    t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                }
            }
        }
        System.out.println("\nThe Sentences in increasing order are as follows:\n");
        for(i=0;i<l;i++)
        System.out.println(s[i]);
    }
}