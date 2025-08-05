// WAP to enter a Sentence and store all the palindrome words in an array using function Palin(). Print the largest Palindrome word among them.

import java.util.*;
class PalinArr
{
    int Palin(String n)
    {
        int len,i;
        len=n.length();
        String w="";
        char ch;
        for(i=0;i<len;i++)
        {
            ch=n.charAt(i);
            w=ch+w;
        }
        if(w.equals(n))
        return 1;
        else
        return 0;
    }
    void main()
    {
        Scanner sc=new Scanner (System.in);
        char ch;
        String k="";
        int i,j=0;
        System.out.println("Enter the Sentence");
        String n=sc.nextLine();
        n=n+" ";
        int len=n.length();
        String arr[]=new String[len];
        for(i=0;i<len;i++)
        {
            ch=n.charAt(i);
            if(ch!=' ')
            k=k+ch;
            else
            {
                if(Palin(k)==1)
                     arr[j++]=k;
                k="";
            }
        }
        String max;
        max=arr[0];
        for(i=0;i<j;i++)
        {
            if(arr[i].length()>max.length())
            max=arr[i];
        }
        System.out.println("The Longest Palindromic Word is" + max);
    }
}            