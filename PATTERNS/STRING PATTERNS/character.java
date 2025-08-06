/*WAP to niput a Word and print the letters
 *Input: "COMPUTER" 
 *Output: C
 *        O
 *        M
 *        P
          U
          T
          E
          R
 */

import java.util.*;
class character
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char ch;
        int i;
        System.out.println("Enter a Word: ");
        s = sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            ch = s.charAt(i);
            System.out.println(ch);
        }
    }
}
        