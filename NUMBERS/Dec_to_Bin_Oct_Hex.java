import java.util.*;
class Dec_to_Bin_Oct_Hex
{    
    public static String dec_bin(int n)
    {
        int rem;
        String bin = "";
        while(n > 0)
        {
            rem = n % 2;
            bin = Integer.toString(rem) + bin;
            n = n / 2;
        }      
        return bin;
    }
    
    public static String dec_oct(int n)
    {
        int rem;
        String oct = "";
        while(n > 0)
        {
            rem = n % 8;
            oct = Integer.toString(rem) + oct;
            n=n / 8;
        }        
        return oct;
    }
    
    public static String dec_hexa(int n)
    {
        int rem;
        String hexa = "";
        String hexa_codes[] = {"A","B","C","D","E","F"};
        while(n > 0)
        {
            rem = n % 16;
            if(rem > 9)
                hexa = hexa_codes[rem-10] + hexa;
            else
                hexa = Integer.toString(rem) + hexa;
            n = n / 16;
        }      
        return hexa;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        int dec = sc.nextInt();
        System.out.println("The Binary Number is: " + dec_bin(dec));
        System.out.println("The Octal Number is: " + dec_oct(dec));
        System.out.println("The Hexadecimal Number is: " + dec_hexa(dec));
    }
}