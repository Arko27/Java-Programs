// WAP to accept 2 nos in main and find the sum using int sum() function.

import java.util.*;
class Add
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        Add s1 = new Add();
        int a,b,s;
        System.out.println("Enter two nos");
        a=sc.nextInt();
        b=sc.nextInt();
        s = s1.Sum(a,b);
        System.out.println("The sum of 2nos is "+s);
    }
    
    int Sum(int x,int y)
    {
        return (x+y);
    }
}