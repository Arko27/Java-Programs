import java.util.*;
class WordPrint
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,s2[],w="",tmp;
        int i,l,c=0,k=0,j;
        char ch;
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            c++;
        }
        s2=new String[c];
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                s2[k]=w;
                k++;
                w="";
            }
        }
        for(i=0;i<c;i++)
        {
            for(j=0;j<c-i-1;j++)
            {
                if(s2[j].length()>s2[j+1].length())
                {
                    tmp=s2[j];
                    s2[j]=s2[j+1];
                    s2[j+1]=tmp;
                }
                else if(s2[j].length()==s2[j+1].length())
                {
                    tmp=s2[j];
                    s2[j]=s2[j+1];
                    s2[j+1]=tmp;
                }
            }
        }
        System.out.println("The sentence with the words lengthwise is--->");
        for(i=0;i<c;i++)
        System.out.print(s2[i]+" ");
    }
}               