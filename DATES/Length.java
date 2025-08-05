/*WAP to input a String and print its Length
Input: "COMPUTER"
Output: 8*/

import java.util.*;
class Length
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a String: ");
        s = sc.nextLine();
        System.out.println("The length of the String is "+s.length());
    }
}