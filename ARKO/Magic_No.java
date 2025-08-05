import java.util.*;
class Magic_No
{
    int n;
    public Magic_No()
    {
        n=0;
    }
    void getNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        n=sc.nextInt();
    }
    int sumDigits(int x)
    {
        if(x==0)
        return 0;
        else
        {
            int d=x%10;
            return(d+sumDigits(x/10));
        }
    }
    void isMagic()
    {
        int a=n;
        while(a>9)
        {
            a=sumDigits(a);
        }
        if(a==1)
        System.out.println(n+" is a Magic no.");
        else
        System.out.println(n+" is not a Magic no.");
    }
    void main()
    {
        Magic_No obj=new Magic_No();
        obj.getNum();
        obj.isMagic();
    }
}