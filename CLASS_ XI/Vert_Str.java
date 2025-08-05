import java.io.*;
import java.util.*;
public class Vert_Str
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String s=new String(); // FOR THAKING THE INPUT FROM THE USER
 String sa[]; // FOR STORING EACH WORD IN A 1D ARRAY
 int count=0,maxwl=0; // count STORES THE INDEX OF EACH WORD 
 //maxwl STORES THE MAXIMUM LENGTH OF THE WORDS
 
 void input()throws Exception
 {
     System.out.print("ENTER THE SENTENCE TO PRINT AS VERTICAL STRING :");
     s=br.readLine();
     sa=new String[s.length()];
 }
 
 void ArrayStore() // STORING WORDS IN THE ARRAY
 {
     Scanner sc=new Scanner(s);
     while(sc.hasNext())
     {
         sa[count++]=sc.next();
         if(sa[count-1].length()>maxwl)
           maxwl=sa[count-1].length();
     }
 }
 
 void PrintVertical() // PRINTING THE ARRAY VERTICALLY
 {
     System.out.println("THE VERTICAL STRING IS :\n");
     for(int i=0;i<maxwl;i++)
     {
         for(int j=0;j<count;j++)
         {
             if(i<sa[j].length())
                  System.out.print(sa[j].charAt(i)+" ");
             else
                  System.out.print("  ");
         }
         System.out.println();
     }
 }
 
 public static void main(String args[])throws Exception
 {
     Vert_Str obj=new Vert_Str(); // CREATING OBJECT
     obj.input();
     obj.ArrayStore();
     obj.PrintVertical();
 }
}