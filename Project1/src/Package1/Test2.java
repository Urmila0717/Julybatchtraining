package Package1;

public class Test2 {
	
	 
	//(((10+2)+2)*2)/2)
	
	public int sum (int a, int b)
	
	{
		int c; 
		c=a+b;
		System.out.println("result of sum" + c);
		return c;
		
	}
public int sum1 (int d, int e)

{
	int f;
	f=d+e;
	System.out.println("result of sum1" + f);
	return f;
	
}

public int multi (int x, int y)

{
	int z;
	z=x*y;
	System.out.println("result of multi" + z);
	return z;
	
}

public void div (int p, int q)
{
	int r;
	r=p/q;
	System.out.println(" final result of " + r);
}

public static void main(String[] args)
{
	Test2 obj=new Test2 ();
	int sumresult=obj.sum(10,2);
	int sum1result=obj.sum(sumresult,2);
	int multiresult=obj.multi(sum1result, 2);
	obj.div(multiresult, 2);
	
	
}

	

	

		
	

}
