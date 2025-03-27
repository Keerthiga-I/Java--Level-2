import java.io.*;
class num
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("SUM OF NUMBERS");
        System.out.println("-----------------------");
        System.out.println("Enter a n of value:");
        String s1 = br.readLine();
        int n = Integer.parseInt(s1);
        System.out.println("Result");
        int x = (n*(n+1)/2);
        System.out.println("Sum of value:" + x);
        int y = (n*(n+1)*(2*n+1)/6);
        System.out.println("Sum of Square:" + y);
	int c = (n*(n+1)/2)*(n*(n+1)/2);
	System.out.println("Sum of Cube:" + c);

	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
