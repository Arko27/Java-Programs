class Number3
{
    void main (int a,int b)
    {
        if((a%2==0) && (b%2!=0))
        System.out.println(a+b);
        else if((a%2!=0) && (b%2==0))
        System.out.println(a-b);
        else if((a%2==0) && (b%2==0))
        System.out.println(a*b);
        else if((a%2!=0) && (b%2!=0))
        System.out.println(a/b);
    }
}