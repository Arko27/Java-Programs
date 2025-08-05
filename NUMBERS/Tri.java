class Tri
{
    void main (int a,int b,int c)
    {
        if(a==b && b==c && c==a)
        System.out.println("equilateral");
        else if(a!=b && b!=c && c!=a)
        System.out.println("scalene");
        else
        System.out.println("Isosceles");
    }
}