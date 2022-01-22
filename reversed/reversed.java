import java.io.*;
public class reversed
{
  public static void main(String[] args)throws IOException
  {

    int n, reversed   = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("\nEnter the number : " );
    n = Integer.parseInt(br.readLine());
    while(n!= 0) {
    
      int digit = n % 10;
      reversed = reversed   * 10 + digit;
      n /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}