class G 
{
	static float test(boolean b, int i, char c,int k){
		System.out.println("from test");
		System.out.println(i);
		System.out.println(c);
		System.out.println(k);
		System.out.println(b);
		return 200.44f;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test(false, 20, 'b' , 30);
		System.out.println("end of main");
		System.out.println(test(true,30,'c',40));
	}
}
