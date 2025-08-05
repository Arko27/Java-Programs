class Interchange1
{
    void main(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("changed value of a="+a);
        System.out.println("changed value of b="+b);
    }
}