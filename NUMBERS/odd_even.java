import java.util.*;
class odd_even
{ 
    void main()
    
{
    Scanner SC = new Scanner (System.in);
    int o=0,e=0,i;
    for(i=1;i<=20;i++)
    { 
        if(i%2==0)
        e = e+i;
        else 
        o = o+i;
    }
    System.out.println(" SUM OF EVEN NUMBERS " +e);
                      
    System.out.println("SUM OF ODD NUMBERS"+o);
}
}
