class Z12 
{
	static int i=test(); 
	static 
	{
		System.out.println("Z12.SIB"+i);
		i=99;
		main(null);
		System.out.println("Z12.SIB again"+i);
		i=10;
	}
	static int test()
	{
		System.out.println("test"+i);
		i=40;
		main(null);
		System.out.println("test again"+i);
		return 75;
		
	}
	public static void main(String[] args) 
	{
		
		System.out.println("main "+i);
		i=33;
		//System.out.println(test());
		//i=test();
		System.out.println("main end"+i);
	}
	
}
