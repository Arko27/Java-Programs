import java.util.*;
class ExtractSent
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        s=s+" ";
        int len=s.length();
        char ch;
        int i,x=0;
        System.out.println("The Sentences Extracted from the paragraph is");
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch=='.'||ch=='?'||ch=='!')
            {
                System.out.println(s.substring (x,i));
                x=i+1;
            }
        }
    }
}