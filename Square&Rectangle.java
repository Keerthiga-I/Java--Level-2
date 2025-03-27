import java.io.*;
class sqre
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
        System.out.println("SQUARE & RECTANGLE");
	System.out.println("-----------------------");
        System.out.println("Enter the a value:");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);
        System.out.println("Enter the l value:");
        String s2=br.readLine();
	int l = Integer.parseInt(s2);
        System.out.println("Enter the b value:");
	String s3 = br.readLine();
        int b = Integer.parseInt(s3);
        System.out.println("Result");
        int z = a*a;
        System.out.println("Area of Square:" + z);
	int y = 4*a;
        System.out.println("Area of Perimeter:" + y);
        int w = l * b;
        System.out.println("Area of Rectangle:" + w);
	int v = 2*(l + b);
        System.out.println("Area of Rectangle:" + v);
		
		
	}
	catch(Exception e)
	{
	  System.out.println("error:"+e.getMessage());
	}
}
}
