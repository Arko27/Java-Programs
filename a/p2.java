/*
 * J
 * AJ
 * VAJ
 * AVAJ
 */

import java.util.*;
class p2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,k;
        String s;
        char ch;
        System.out.println("Enter the string");
        s=sc.nextLine();
        int len=s.length();
        for(i=0;i<len;i++)
        {
            for(k=i;k>=0;k--)
            System.out.print(s.charAt(k));
            System.out.println();
        }
        
    }
}