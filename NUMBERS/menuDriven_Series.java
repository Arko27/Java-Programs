import java.util.*;
class menuDriven_Series
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        
        int i, ch,s = 0;
        double sum = 0.0;
        System.out.println("Enter 1 to print the series: ");
        System.out.println("1 + 4 + 9 + ............... + 400");
        System.out.println("Enter 2 to print the series: ");
        System.out.println("1 + 1/2 + 1/3 + ............... + 1/20");
        System.out.println("Enter Your Choice:");
        ch = sc.nextInt();
        
        switch(ch)
        {
            case 1:
            for (i=1;i<=20;i++)
            {
                s = s + (i*i);
            }
            System.out.println("The Sum of the Series is: "+s);
            break;
            
            case 2:
            for (i=1;i<=20;i++)
            {
                sum = sum + Math.pow(i,-1);
            }
            System.out.println("The Sum of the Series is: "+sum);
            break;
            
            default:
            System.out.println("Wrong Choice");
        }
    }
}