// s = x + x^2/2! + x^3/3! + x^4/4! + ..... upto n terms.


f=1;
for(i=1;i<=n;i++)
{
    f = f*i;
    s = s + (Math.pow(x,i))/f;
}
System.out.println("The sum is: "+s);