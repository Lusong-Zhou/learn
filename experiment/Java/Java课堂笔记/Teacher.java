
public class Teacher extends Human{
	public String teaNum;
	public void teach()
	{
		System.out.println(name+"тзио©н");
	}
	public Teacher(String teaSex,String teaName,int teaAge,String teaNum)
	{
		super(teaName,teaSex,teaAge);
		this.teaNum=teaNum;
	}
 
}
