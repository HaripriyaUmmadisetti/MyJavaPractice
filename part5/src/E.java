class  E
{
	public static void test(int i){
		System.out.println("from test :" +i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
	}
}
//compiletime error method void must have integer arugment.