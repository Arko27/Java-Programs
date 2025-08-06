/* 1. WAP to print the sum of the series:
 * s = 1 + 3/2! + 5/3! + 7/4! + ...... + upto n terms
 */

int p=1;
double s=0.0;

for(i=1;i<=n;i++)
{
    o = 2*i-1;    1, 3, 5
    p=p*i;        1, 2, 3!
    s = s+o/p;    1, 1 + 3/2, 1 + 3/2! + 5/3!
}