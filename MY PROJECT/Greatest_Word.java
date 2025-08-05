import java.util.*;
class Greatest_Word
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        s=s+" ";
        int len=s.length();
        char ch;
        String w="",max="";
        int i;
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
            max=w.length()>max.length()?w:max;
            w="";
        }
    }
    System.out.println("The Greatest Word is  "+max);
  }
}
