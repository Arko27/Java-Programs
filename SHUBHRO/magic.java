class magic
{
    static int magic(int n)
    {
        int a, s = 0;
        while(n>9)
        {            
            while(n>0)
            {
                a=n%10;
                s=s+(a*a);
                n=n/10;
            }
            n = s;
        }
        if(s == 1)
        return 1;
        else
        return 0;
    }
}