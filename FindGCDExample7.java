public class FindGCDExample7  
{   
public static void main(String[] args)   
{   
int a = 54, b = 24;   
System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));   
}   
//recursive function to return gcd of a and b   
static int gcd(int a, int b)   
{   
// Everything divides 0   
if (a == 0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return gcd(a-b, b);   
return gcd(a, b-a);   
}   
}  