//import required classes and packages  
import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
//create FindAllORENumbers class to get all the ORE number in the given range  
class FindAllORENumbers {   
      
    //main() method start  
    public static void main(String args[])  
    {  
        int range;  
          
        //create scanner class object  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter the value of range");  
          
        //store user entered value into variable range  
        range = sc.nextInt();  
          
        System.out.println("The ORE Numbers between 0 and " + range + "are:");  
        for(int i = 1; i <= range; i++){  
            if(checkORENumber(i))  
                System.out.println(i);  
        }  
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
}  