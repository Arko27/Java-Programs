/*
 * J
 * JA
 * JAV
 * JAVA
 */

import java.util.*;
class pattern
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("enter the string");
        s=sc.nextLine();
        int i,len=s.length();
        for(i=0;i<len;i++)
        {
            System.out.println(s.substring(0,i+1));
        }
    }
}