class loops
{
    void main ()
    {
        int i,s=0,p=1;
        double avg=0.0;
        for(i=1;i<=6;i++)
        {
            s=s+i;
            p=p*i;
        }
        avg= s/6;
        System.out.println(s);
        System.out.println(avg);
        System.out.println(p);
    }
}  