//import required classes and packages  
import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
//create ORENumber class to check whether the given number is an ORE number or not  
class ORENumber {   
      
    // create calculateHarmonicMean() method to find the harmonic means of divisors  
    static double calculateHarmonicMean(int number)  
    {  
        Set<Integer> divisors = findDivisors(number);  
    
        double sum = 0.0;  
    
        for (Iterator<Integer> iterator = divisors.iterator(); iterator.hasNext(); ) {  
            Integer data = iterator.next();  
            sum = sum + number / data;  
        }  
        sum = sum / number;  
    
        // find the harmonic mean by dividing the size of divisors list with sum and return it  
    
        return divisors.size() / sum;  
    }  
      
    // create findDivisors() method to get all the divisors of the number  
    static Set<Integer> findDivisors(int number)  
    {  
        //create a lsit of integer that will contain divisors of number  
        Set<Integer> divisors = new HashSet<Integer>();  
          
        // use for loop to get divisors and store them into set   
        for (int i = 1; i <= Math.sqrt(number); i++) {  
            //check whether the reminder of the number with i equals to 0 or not   
            if (number % i == 0) {  
    
                // add 'i' into divisors list if divisor are equals  
                if (number / i == i)  
                    divisors.add(i);  
    
                else //add 'i' and 'number/i' both if divisors are not equal  
                {  
                    divisors.add(i);  
                    divisors.add(number / i);  
                }  
            }  
        }  
        return divisors;  
    }  
    
    // create checkORENumber() method to check whether the number is ORE or not  
    static boolean checkORENumber(int number)  
    {  
        // find the harmonic mean of the number  
        double meanValue = calculateHarmonicMean(number);  
    
        // check whether the harmonic mean is an integer or not  
        if (meanValue - Math.floor(meanValue) == 0)  
            return true;  
        else  
            return false;  
    }  
    
    // Driver Code  
    public static void main(String[] args)  
    {  
        int n1, n2;  
          
        //create scanner class object to get input from user  
        Scanner sc = new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter first number");  
          
        //store user entered value into variable n1  
        n1 = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter second number");  
          
        //store user entered value into variable n2  
        n2 = sc.nextInt();  
          
        if (checkORENumber(n1))   
            System.out.println(n1 + " is an ORE number");   
        else  
            System.out.println(n1 + " is not an ORE number");   
        if (checkORENumber(n2))   
            System.out.println(n2 + " is an ORE number");   
        else  
            System.out.println(n2 + " is not an ORE number");  
    
          
    }   
}  