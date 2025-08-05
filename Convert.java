import java.util.*;
class Convert
{
    String s;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.nextLine();
    }
    int caseconv(int i)
    {
        if(i>=65 && i<=90)
        return (i+32);
        else if(i>=97 && i<=120)
        return (i-32);
        else
        return i;
    }
    void strconv()
    {
        int i,j;
        char ch,ch1;
        String w="",w1="";
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            w=w+(char)(caseconv(ch));
        }
        for(i=0;i<w.length();i++)
        {
            ch1=w.charAt(i);
            if(ch1=='Z')
            ch1='A';
            else if(ch1=='z')
            ch1='a';
            w1=w1+(char)(ch1+1);
        }
        System.out.println(w1);
    }
    void main()
    {
        Convert obj=new Convert();
        obj.input();
        obj.strconv();
    }
}