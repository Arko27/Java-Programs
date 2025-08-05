import java.util.*;
class even_odd
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,s=0,m=0;
        while(true)
        {
            System.out.println("Enter the number");
            a=sc.nextInt();
            if(a==0)
            break;
            else if(a%2==0 && a>0)
            s=s+a;
            else if(a%2!=0 && a<0)
            m=m+a;
        }
        System.out.println("even sum="+s);
        System.out.println("odd sum="+m);
    }
}


            