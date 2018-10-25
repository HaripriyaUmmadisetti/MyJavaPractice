class O
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("from if");
		}
		
		else if(true)
		{
			System.out.println("from else if 1");
		}
		
		else if(true)
		{
			System.out.println("from else if 2");
		}
		else
		{
			System.out.println("from else");
		}
		System.out.println("end of main");
	}
}