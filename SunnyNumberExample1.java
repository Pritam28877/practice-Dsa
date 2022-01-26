import java.util.*;   
public class SunnyNumberExample1  
{   
//driver code   
public static void main(String args[])   
{   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number to check: ");  
//reading a number from the user  
int N=sc.nextInt();  
//calling user-defined function   
isSunnyNumber(N);   
}       
//function checks whether the given is a perfect square or not   
static boolean findPerfectSquare(double num)   
{   
//finds the square root of the ggiven number  
double square_root = Math.sqrt(num);   
//if square root is an integer   
return((square_root - Math.floor(square_root)) == 0);   
}   
//function that checks whether the given number is Sunny or not  
static void isSunnyNumber(int N)   
{   
//checks N+1 is perfect square or not  
if (findPerfectSquare(N + 1))   
{   
System.out.println("The given number is a sunny number.");   
}   
//executes if N+1 is not a perfect square  
else  
{   
System.out.println("The given number is not a sunny number.");   
}   
}   
}  
Output 1:

Enter a number to check: 80
The given number is a sunny number.
Output 2:

Enter a number to check: 670
The given number is not a sunny number.
Let's create another Java program and find all the sunny numbers between a given range.

SunnyNumberExample2.java

import java.util.Scanner;  
public class SunnyNumberExample2  
{  
//user-defined function that determines all the sunny numbers  
public static boolean isSunnyNumber(int number)   
{  
//determines the square root of number+1 using Math.sqrt() method  
if(Math.sqrt(number+1)%1 == 0)  
return true;  
else   
return false;  
}  
//driver code  
public static void main(String args[])   
{  
//lr is lower range and ur is upper range  
int lr = 0, ur = 0;  
Scanner scan = new Scanner(System.in);  
System.out.print("Enter lower range: ");  
//reads an integer (lr) from the user  
lr = scan.nextInt();  
System.out.print("Enter upper range: ");  
//reads an integer (ur) from the user  
ur = scan.nextInt();  
System.out.println("The Sunny number from "+ lr + " to "+ ur+" are: ");  
for(int i=lr; i<=ur; i++)   
{  
//calling user-defined number  
if(isSunny(i))  
System.out.print(i +" ");  
}  
}  
}  