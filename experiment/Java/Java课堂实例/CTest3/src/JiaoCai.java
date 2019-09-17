
public class JiaoCai extends Book{
	private String courseName;//适用的课程名

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}
	public JiaoCai(String name,String authorName,float price,String courseName)
	{
		super(name,authorName,price);
		this.courseName=courseName;
	}
	
	public boolean equals(JiaoCai jc)
	{
		boolean flag=super.equals(jc);
		if(flag)
		{
			if(courseName==jc.courseName)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return flag;
		}
	}
	
	public String toString()
	{
		return super.toString()+"，适用课程:"+courseName;
	}
	
}
