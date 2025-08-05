import java.util.*;
class DeciOct
{
    int n,oct;
    public DeciOct()
    {
        n=0;
        oct=0;
    }
    void getnum(int nm)
    {
        n=nm;
    }
    void deci_oct()
    {
        int x=n;
        if(n>8)
        {
            n=n/8;
            deci_oct();
        }
        oct=(oct*10)+(x%8);
    }
    void show()
    {
        System.out.println("The Decimal no. is "+n);
        deci_oct();
        System.out.println("Octal Equivalent is "+oct);
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int p=sc.nextInt();
        DeciOct obj=new DeciOct();
        obj.getnum(p);
        obj.show();
    }
}