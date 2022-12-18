package arithmatic1;

public class Myarth {
	


	public static void main(String[] args) 
	{
		int a,b;
		Myarth c= new Myarth();
		int choice;
		choice=3;
		b=90;
		a=990;
		//choice=4;
		//a=560;
		//b=8;
		switch(choice)// inside switch always integer value is required
		{
		case 1:System.out.println("Addition of two numbers:");
		c.addition(a,b);
		break;
		case 2: System.out.println("Substraction of two numbers");
		c.substraction(a,b);
		break;
		case 3: System.out.println("Multiplication of two numbers:");
		c.multiplication(a,b);
		break;
		case 4: System.out.println("Division of two numbers:");
		c.division(a,b);
		break;
		default:
			System.out.println("There is no arithmetic operation");
			break;
			

	}
		


}
	public void addition(int a,int b)//addition 
	{
		int sum;
		sum=a+b;
		System.out.println("Ans= "+sum);
	}
	public void substraction(int a,int b)//substraction
	{
		int sub;
		sub=a-b;
		System.out.println("Ans= "+sub);
	}
	public void multiplication(int a,int b)//multiplication
	{
		int mult;
		mult=a*b;
		System.out.println("Ans= "+mult);
	}
	public void division(int a,int b)//division
	{
		int div;
		div=a/b;
		System.out.println("Division= "+div);
	}
	}

