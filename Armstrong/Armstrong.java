import java.io.*;

public class Armstrong
{  
  public static void main(String[] args)throws IOException  
  {  
    int c=0,a,temp;  
     int n; 
       
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter first number ::");
      n=Integer.parseInt(br.readLine());
         temp=n;
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  