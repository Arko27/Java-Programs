/* WAP to input a String and convert it into the Piglatin form
 * Piglatin Form: The first vowel occurring in the input word is placed at the start of the new word along with the remaining
 * alphabet of it.
   The alphabet is present before the first vowel is shifted, at the end of the new word it is followed by “ay".
   
   Input: "Pradip"
   Output: "adipPray"
*/

import java.util.*;
class PigLatin
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="";
        int i,j;
        char ch;
        System.out.println("Enter a String");
        s = sc.nextLine();
        s = s.trim();
        int len = s.length();
        for (i=0;i<len;i++)
        {
            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O'
            || ch == 'U')
            break;
        }
        w = s.substring(i) + s.substring(0,i) + "ay";
        System.out.println("The Piglatin word is: "+w);
    }
}
            