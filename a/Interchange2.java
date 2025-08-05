class Interchange2
{
    void main (int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the change value of a is "+a);
        System.out.println("the change value of b is "+b);
    }
}