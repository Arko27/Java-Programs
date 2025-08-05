/*
 * A
 * B C
 * D E F
 * G H I J
 * K L M N O
 /*
  * 
  */
 import java.util.*;
 class patern100
 {
     void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,a=65,i,j;
         
         System.out.println("enter the n no of rows");
         n=sc.nextInt();
         for(i=1;i<=n;i++)
         {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)a+" ");
                a++;
            } 
            System.out.println();
        }
    }
}