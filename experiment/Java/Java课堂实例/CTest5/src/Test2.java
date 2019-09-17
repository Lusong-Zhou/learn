
public class Test2 {

	public static void main(String[] args) {


		try
		{
			Student stu=new Student("201601010101","ÕÅÈı","ÄĞ",16,false);
			stu.study();
		}
		catch(StudentException ex)
		{
			System.out.println(ex.getMessage());
		}
		

	}

}
