class R1
{
	static int i;
	static 
	{
		System.out.println(i);
	}
	static int j=10;
	public static void main(String[] args) 
	{
		System.out.println(R1.i=20);
		
		//test();
	System.out.println(j);
	}
}
