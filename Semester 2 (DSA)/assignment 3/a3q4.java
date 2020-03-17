public class a3q4 
{
	public static void main(String args[])
	{
		Box<String> test1;
		test1 = new Box<String>(null);
		Box<String> var1=test1;
		Box<String> var2=test1;
		var1.setVar("Value 1");
		System.out.println(var1.getVar());
		var2.setVar("Value 2");
		System.out.println(var1.getVar());
		Box<Integer> test2;
		test2 = new Box<Integer>(null);
		Box<Integer> var3=test2;
		Box<Integer> var4=test2;
		var3.setVar(1);
		System.out.println(var3.getVar());
		var4.setVar(2);
		System.out.println(var3.getVar());
		Box<Object> test3;
		test3 = new Box<Object>(null);
		Box<Object> var5=test3;
		Box<Object> var6=test3;
		var5.setVar((Double)0.1);
		System.out.println(var5.getVar());
		var6.setVar("Value 2");
		System.out.println(var5.getVar());
	}
}
class Box<T>
{
	public T var;
	Box(T var)
	{
		this.var=var;
	}
	void setVar(T var)
	{
		this.var=var;
	}
	T getVar()
	{
		return var;
	}
}
