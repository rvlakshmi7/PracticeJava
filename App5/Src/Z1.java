class Z 
{
	static double test(boolean b,int i,char j,int k)
	{
		System.out.println("frm test");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(b);
		return 200.44;

	}
	public static void main(String[] args) 
	{

		System.out.println("from main");
			double d1 =test(false, 20, 'b', 30);
			


		System.out.println("end of main" +d1);
		System.out.println(test(false, 20, 'b', 30));
	}
}
