class Calculator{
	public int add(int n1, int n2)
	{
		int r=n1+n2;
		return r;
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		int num1=4;
		int num2=5;
		Calculator calc= new Calculator();
		// calc here is reference variable

		int result=calc.add(num1, num2);
		System.out.println(result);
		
	}
}
