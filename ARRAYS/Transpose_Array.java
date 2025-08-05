import java.util.*;
class Transpose_Array
{      
    void main()    
    {        
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter the no. of rows and columns");        
        int r=sc.nextInt();       
        int c=sc.nextInt();        
        int a[][]=new int[r][c];       
        int i,j;        
        System.out.println("Enter the Array Elements in 2-D Array");       
        for(i=0;i<r;i++)        
        {            
            for(j=0;j<c;j++)            
            a[i][j]=sc.nextInt();        
        }        
        System.out.print("The 2-D Array is--->"+"\n");        
        for(i=0;i<r;i++)        
        {            
            for(j=0;j<c;j++)            
            System.out.print(a[i][j]);           
            System.out.println();       
        }        
        for(i=0;i<r;i++)        
        {            
            for(j=0;j<c;j++)           
            System.out.print(a[j][i]+"\t");            
            System.out.println();        
        }    
    }
}