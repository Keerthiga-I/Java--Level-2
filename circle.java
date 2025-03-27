import java.io.*;
class circle
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("CIRCLE PROGRAM");
        System.out.println("-----------------------");
        System.out.println("Enter a r value:");
        String s1 = br.readLine();
        int r = Integer.parseInt(s1);
        System.out.println("Result");
        double x = 3.14*r*r;
        System.out.println("Area of circle:" + x);
        double y = 2*3.14*r;
        System.out.println("Perimeter of circle:" + y);
	
	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
