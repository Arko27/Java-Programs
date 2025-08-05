import java.util.*;
class Happy_No//68
{
    Scanner sc=new Scanner(System.in);
    int n;
    Happy_No()
    {
        n=0;
    }
    void getnum(int nm)
    {
        n=nm;
    }
    int sumsqdigits(int x)
    {
        if(x==0)
        return 0;
        else
        {
            int d=x%10;
            return(d*d+sumsqdigits(x/10));
        }
    }
    void ishappy()
    {
         int a=sumsqdigits(n);
         while(a>9)
         {
             a=sumsqdigits(a);
         }
         if(a==1)
         System.out.println(n+" is a happy no.");
         else
         System.out.println(n+" is not a happy no");
    }
    void main()
    {
        Happy_No obj=new Happy_No();
        System.out.println("Enter a no.");
        int b=sc.nextInt();
        obj.getnum(b);
        obj.ishappy();
    }
}