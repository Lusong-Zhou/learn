//»À¿‡
public class Human {
	private String name;
	private String sex;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public Human(String name,String sex,int age)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	
	public void eat()
	{
		System.out.println(name+"‘⁄≥‘∑π");
	}
}
