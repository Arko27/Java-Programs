/*
 * J
 * JA
 * JAV
 * JAVA
 */

import java.util.*;
class p1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i;
        System.out.println("enter the string");
        s=sc.nextLine();
        int len=s.length();        
        for(i=0;i<len;i++)
        {
            System.out.println(s.substring(0,i+1));
        }
    }
}