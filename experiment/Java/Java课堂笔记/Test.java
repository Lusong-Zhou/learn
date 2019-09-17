
public class Test {

	public static void main(String[] args) {
		Student stu=new Student("001","张三","男",20);
		//调用类的构造方法来创建一个该类的具体对象
		stu.study();
		stu.exam("数据库");
	}

}
