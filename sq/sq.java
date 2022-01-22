import java.io.*;
  
public class sq
{
  public static void main(String args[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter number ::");
		 int n;
		 n=Integer.parseInt(br.readLine());
		 int c=1,p,a=0;
		 while(c<=n)
		 {
		   p=c*c;
		   a=a+p;
		   c++;
		   p=1;
		   
		 }
		 System.out.print("the sum of the seq is "+a);
	
	}
}