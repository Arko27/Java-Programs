import java.util.*;
class Evil_No
{    
    long DecToBin(int number)
    {
        long binNumber = 0;  
        int rem = 0;  
        int j = 1;  
        while(number != 0) {  
            rem = number % 2;  
            binNumber += rem * j;  
            number = number / 2;  
            j = j * 10;  
        }  
          
        return binNumber;
    }
    
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Number:");
        Evil_No obj = new Evil_No();
        int num = sc.nextInt();
        long binNumber = obj.DecToBin(num);
        int count = 0, rem;
        System.out.println("The Binary Representation is: " + binNumber);
        while(binNumber > 0)
        {
            rem = (int)binNumber % 10;
            if(rem == 1)
                count++;
            binNumber = binNumber / 10;  
        }        
        if (count % 2 == 0)
            System.out.println(num + " is an Evil Number");
        else  
            System.out.println(num + " is not an Evil Number");
    }
}