class Human
{
	void hmn()
	{
		System.out.println("human class m1");
	}
}
class Student extends Human
{
	void hmn()
	{
		System.out.println("student class");
	}
}
class Main2
{
	public static void main(String args[])
	{
		Human h=new Human();
		h.hmn();
		Student s=new Student();
		s.hmn();
	}
}

