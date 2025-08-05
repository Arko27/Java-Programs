class Pattern9
{
    void main()
    {
        int i,j,k,l;
        for(i=1;i<=5;i++)
        {
            for(k=0;k<=i-1;k++)
                System.out.print(" ");
            for(j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}