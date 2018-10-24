class Y 
{
	static int x=10;
	static int y=test();
	static int test()
	{
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
	}
}
