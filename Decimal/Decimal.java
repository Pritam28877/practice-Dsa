import java.io.*;
  
public class Decimal
{
  public static void main(String args[])throws IOException
    {
      
        int[] binaryNum = new int[1000];
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter Decimal  number ::");
        int n,i = 0;
		n=Integer.parseInt(br.readLine());
        while (n > 0) 
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
      
   
 }