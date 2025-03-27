import java.io.*;
class cylinder
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("CYLINDER PROGRAM");
        System.out.println("-----------------------");
        System.out.println("Enter a r value:");
        String s1 = br.readLine();
        int r = Integer.parseInt(s1);
	System.out.println("Enter a H value:");
        String s2 = br.readLine();
        int h = Integer.parseInt(s2);
        System.out.println("RESULT");
        double x = 3.14*r*r*h;
        System.out.println("Area of cylinder:" + x);
        double y = 2*3.14*r*h;
        System.out.println("Perimeter of cylinder:" + y);
	
	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
