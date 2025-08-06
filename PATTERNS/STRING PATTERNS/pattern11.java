import java.util.*;
class pattern11
{
    void main()
    {
        int i,len;
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        len=s.length();
        for(i=0;i<len;i++)
        {
            System.out.println(s.substring(0,i+1));
        }
        System.out.println();
    }
}