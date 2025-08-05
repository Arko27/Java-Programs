class PrintArr
{
    int printfirst(int arr[],int size,int i)
    {
        if (i==size)
        return 0;
        
        else
            System.out.print(arr[i]+" ");
        
        return printfirst(arr,size,++i);
    }
}