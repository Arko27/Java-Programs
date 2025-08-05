/*
 * JAVA
 * JAV
 * JA
 * J
 */

import java.util.*;
class p3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        String s;
        System.out.println("Enter the string");
        s=sc.nextLine();
        int len=s.length();
        for(i=len-1;i>=0;i--)
        System.out.println(s.substring(0,i+1));
    }
}