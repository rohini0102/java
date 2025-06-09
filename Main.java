class Human
{
	String name;
	String gender;
	Human(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
	}
	void hmn()
	{
		System.out.println("name:"+name+" gender:"+gender);
	}
}
class Student
{
	int rno;
	char sec;
	String dept;
	Student(int rno,char sec,String dept)
	{
		this.rno=rno;
		this.sec=sec;
		this.dept=dept;
	}
	void std()
	{
		System.out.println("rno:"+rno+" sec:"+sec+" dept:"+dept);
	}
}
class Developer
{
	int age;
	int mobile;
	Developer(int age,int mobile)
	{
		this.age=age;
		this.mobile=mobile;
	}
	void dev()
	{
		System.out.println("age:"+age+" mobile:"+mobile);
	}

}
class Main
{
	public static void main(String args[])
	{	
		Human h=new Human("prasu","FEMALE");
		Student s=new Student(1,'D',"CSE");
		Developer d=new Developer(20,45678);
		h.hmn();
		s.std();
		d.dev();
	}
}