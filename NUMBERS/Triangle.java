class Triangle
{
    void main(int a,int b,int c)
    {
        if(a==b && b==c && c==a)
        System.out.print("equilateral");
        else if(a!=b && b!=c && c!=a)
        System.out.print("scalene");
        else
        System.out.print("isosceles");
    }
}