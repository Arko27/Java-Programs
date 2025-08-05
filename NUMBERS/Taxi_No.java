import java.util.*;
class Taxi_No//Ramanujm no-1729,4104,13832,39312,20683
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int i,j,p=0;
        for(i=1;i<n;i++)
        {
            for(j=1;j<i;j++)
            {
                if((Math.pow(i,3))+(Math.pow(j,3))==n)
                {
                    System.out.println("i= "+i+" and j= "+j);
                    p++;
                }
            }
        }
        if(p==2)
        System.out.println("Since it has two pairs of sum, it is a Taxi No.");
        else
        System.out.println("It is not  a Taxi No.");
    }
}