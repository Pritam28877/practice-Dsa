import java.util.Scanner;  
public class CheckPositiveOrNegativeExample5  
{  
public static void main(String[] args)   
{  
int num, result;  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number you want to check: ");  
//taking an integer value from the user  
num = sc.nextInt();  
//string array that contains results  
String[] result = {"Positive", "Negative"};  
//checks if the number is positive or negative  
System.out.println(result [(num >> 31) & 1]);  
}  
}  