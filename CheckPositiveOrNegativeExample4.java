import java.util.Scanner;  
import java.lang.Integer.*;  
public class CheckPositiveOrNegativeExample4  
{  
public static void main(String[] args)   
{  
int num, result;  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number you want to check: ");  
//taking an integer value from the user  
num = sc.nextInt();  
//invoking signum() method of the Integer class  
result=Integer.signum(num);  
//prints the result  
System.out.print(result);  
}  
}  