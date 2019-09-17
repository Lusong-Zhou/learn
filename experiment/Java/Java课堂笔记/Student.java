//学生类
public class Student extends Human{
	//属性
	public String stuNum;
	//方法
	public void study()
	{
		System.out.println(getName()+"在学习");
	}
	public void exam(String courseName)
	{
		System.out.println(getName()+"在参加"+courseName+"课程的考试");
	}
	//构造方法
	public Student(String num,String stuName,String stuSex,int stuAge)
	{
		//初始化继承于父类的属性
		super(stuName,stuSex,stuAge);
		//初始化自身所特有的属性
		stuNum=num;
	}
}
