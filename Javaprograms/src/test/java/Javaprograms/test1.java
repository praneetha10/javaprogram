package Javaprograms;

 class test2
{
	public void m1(String x,int y,float f)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(f);
	}
	public void m1(int x,float y,String z)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	 public String m2(String x,int a)
	 {
		 System.out.println(x);
		 return x
	 }
}
 public class test1 extends test2
{
	public void m1(int x,float y,String z)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[] args)
	{
		test2 t2=new test2();
		t2.m1(20, (float)10.2, "praneetha");
		t2.m2("praneetha",10);
	}

}



	

