package week1.HomeAssignments;

public class IsPrime {
public static void main(String[] args) {
	int n=13;
	int p=0;
	if(n==1)
	{
		p=1;
	}
	else
	{
	for (int i = 2; i <n; i++) 
	{
		if(n%i==0)
			p=1;
	}
	}
	if (p==0)
		System.out.println(n+" is a Prime Number");
	else
		System.out.println(n+" is not a Prime Number");
	
}
}

