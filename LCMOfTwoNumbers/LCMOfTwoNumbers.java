import java.io.*;

public class LCMOfTwoNumbers 
{
   public static void main(String args[])throws IOException
    {
      int a, b, max, step, lcm = 0;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter first number ::");
      a =Integer.parseInt(br.readLine());
      System.out.println("Enter second number ::");
      b =Integer.parseInt(br.readLine());

      if(a > b)
      {
         max = step = a;
      }
      else
      {
         max = step = b;
      }

      while(a!= 0) 
         {
         if(max % a == 0 && max % b == 0) {
            lcm = max;
            break;
         }
         max += step;
         }
      System.out.println("LCM of given numbers is :: "+lcm);
    }
 }