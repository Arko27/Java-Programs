class Triangle3
{
    void main (int a,int b,int c)
    {
        if(a==b && b==c && c==a)
        System.out.println("equilateral");
        else if(a==b || b==c || c==a)
        System.out.println("isosceles");
        else
        System.out.println("scalene");
    }
}