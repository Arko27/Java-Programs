import java.util.*;
class b
{
    void main () 
    {
        Scanner Sc = new Scanner(System.in);
        int i;
        String st[] = new String[6];
        for(i = 0;i < 6;i++)
        {
            st[i]=Sc.next();
        }
        b ob = new b();
        ob.countScore(st);
    }
    void countScore(String s[])
    {
        int i;
        double marks = 0.0;
        for(i = 0;i<6;i++)
        {
            String st1 = s[i];
            if(st1.charAt(0)==st1.charAt(5) && (st1.substring(1,4).compareTo("Cov")==0))
            marks=marks+1;
            else if(st1.charAt(0)==st1.charAt(5) || (st1.substring(1,4).compareTo("Cov")==0))
            marks=marks+0.5;
        }
        System.out.println(marks);
    }
}