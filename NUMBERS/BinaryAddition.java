import java.util.*;
class BinaryAddition
{
    String DecToBin(int a)
    {
        int c;
        String s="";
        while(a>0)
        {
            c=a%2;
            s=c+s;
            a=a/2;
        }
        return s;
    }
    int BinToDec(int b)
    {
        int i,b1=b,x=0,c1,s1=0;
        while(b>0)
        {
            c1=b%10;
            x++;
            b=b/10;
        }
        for(i=0;i<x;i++)
        {
            c1=b1%10;
            s1=s1+(int)(Math.pow(2,i)*c1);
            b1=b1/10;
        }
        return s1;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos.");
        int y=sc.nextInt();
        int z=sc.nextInt();
        int su=BinToDec(y)+BinToDec(z);
        String dis=DecToBin(su);
        System.out.println("The sum of the binary nos. is "+dis);
    }
}