import java.util.*;
class Pronic_No
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int i,flag=0;
        for(i=0;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println(n+" is a Pronic Number");
        else
        System.out.println(n+" is not a Pronic Number");
    }
}