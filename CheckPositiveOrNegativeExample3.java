import java.util.Scanner;  
import java.lang.Math.*;  
public class CheckPositiveOrNegativeExample3  
{  
public static void main(String[] args)   
{  
double num, result;  
//object of the Scanner class   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number you want to check: ");  
//reading an input from the user  
num = sc.nextDouble();  
//invoking signum() method of the Math class  
result=Math.signum(num);  
//print the result  
System.out.print(result);  
}  
}  