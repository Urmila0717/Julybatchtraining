package Package1;

public class test3 
{
	//((((10/2)-2)*2)-2)+2)
public int div(int a, int b)

{
	int c;
	c=a/b;
	System.out.println("result of div" +c);
	return c;
}
	public int sub (int d, int e)
	{
		int f;
		f=d-e;
		System.out.println("result of sum" + f);
		return f;
	}
	
	public int mul(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("result of mul" + z);
		return z;
		
			
		}
		public int sub1 (int q, int r)
		
		{
		int s;
		s=q-r;
		System.out.println("result of sub1" + s);
		return s;
		}
		 
		public void sum (int a1,int b2)
		{
			int c2;
			c2=a1+b2;
			System.out.println("Final result of" + c2);
		}
		public static void main(String[] args) 
		{
			test3 ob=new test3();
			int divresult=ob.div(10,2);
			int subresult=ob.sub(divresult, 2);
			int mulresult=ob.mul(subresult, 2);
			int sub1result=ob.sub(mulresult, 2);
			ob.sum(sub1result, 2);
		}
			
}
		
		
	
	
		
	

