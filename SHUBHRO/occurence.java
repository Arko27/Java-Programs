import java.util.*;
class occurence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER SENTENCE");
        String s=sc.nextLine();
        s=s+" ";
        System.out.println("ENTER WORD");
        String w=sc.nextLine();
        String j="";
        char c;
        int i,k=0,len=s.length();
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            j=j+c;
            else
            {
                if(w.equals(j))
                k++;
                j="";
            }
        }
        System.out.println("OCCURENCE IS "+k);
    }
}