class S 
{
	public static void main(String[] args) 
	{
		System.out.println("main ");
		int i=test();
		int j =i+ test();
		int K =i+ test()+j+test();
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("K="+K);
		System.out.println(test());

	}
	public static int test()
	{
	//System.out.println("from test");
	return 100;
	}
}
