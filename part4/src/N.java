class N
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
		System.out.println("end of main");
	}
}
/*1.we can write any number of elseif blocks for one if block.
2.we can't write if block with out else.
3.If if block is false and it will check for elseif(true) block and it will execute dat.
4.Else block is not mandatory for elseif.
5.Else block should not be used in between elseif blocks
6.We can place else block after all the elseif blocks. */