package week1.HomeAssignments;

public class FibonacciSeries {
public static void main(String[] args) {
	int a=0,b=1;
	int n=8;
	int c;
	System.out.println("Fibonacci Series");
	System.out.println(a+"\n"+b);
	for (int i=0;i<(n-2);i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	
}
}
