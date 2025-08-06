import java.util.*;
class Tech_No
{  
    public static void main(String args[])  
    {
        Scanner sc = new Scanner(System.in);
        int n, num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;  
        System.out.print("Enter a Number:");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            digits++;
            num = num / 10;
        }
        num = n;        
        if (digits % 2 == 0)
        {            
            firstHalf = num % (int) Math.pow(10, digits / 2);
            secondHalf = num / (int) Math.pow(10, digits / 2);
            squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);
            if (n == squareOfSum)
                System.out.println(n+" is a Tech Number");
            else
                System.out.println(n+" is not a Tech Number");
        }
        else
            System.out.println(n+ " is not a Tech Number");
    }
}