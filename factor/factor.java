import java.io.*;

public class factor
{
   public static void main(String args[])throws IOException
    {
      int a, b=1,c=0;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your value  ::");
      a =Integer.parseInt(br.readLine());
	     while(b<=a)
		 {
		 if(a%b==0)
		 {
		 c=c+b;
		 }
		 b++;
		 }
		 System.out.println("the sum of all factor is " +c);
	}
  }
  