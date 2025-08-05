class recur
{
    int printfirst(int arr[],int size,int i,int val)
    {
        if (i==size)
        return 0;
        
        if (arr[i] == val)
        {
            System.out.println(i);
            return printfirst(arr,size,size-1,val);
        }
        
        return printfirst(arr,size,++i,val);
    }
}