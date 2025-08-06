/* WAP to input a String and print in the following Format
 * Input: "Aakash Kumar Gupta"
 * Output: "hsakaA ramuK atpuG"
 */
import java.util.*;
class rev_inPlace
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",n="";
        int i,j;
        char ch;
        System.out.println("Enter a String");
        s = sc.nextLine();
        s = s.trim();
        s = s +" ";
        int len = s.length();
        for (i=0;i<len;i++)
        {
            ch = s.charAt(i);
            if(ch==' ')
            {
                n = n +" "+ w;
                w="";
            }
            else
            {
                w = ch + w;                
            }
        }
        System.out.println("The new Stirng: "+n);
    }
}