//学生类
public class Student {
	private String num;
	private String name;
	private String sex;
	private int age;
	private boolean jiankang;
	
	public Student(String num,String name,String sex,int age,boolean jiankang)throws StudentException
	{
		String info=checkNum(num);
		if(!info.equals(""))//学号校验未通过
		{
			throw new StudentException(info);
		}
		else
		{
			if(!((sex.equals("男"))||(sex.equals("女"))))
			{
				throw new StudentException("性别只能是男或女");
			}
			else
			{
				if(age<16)
				{
					throw new StudentException("年龄不能小于16岁");
				}
				else
				{
					this.setNum(num);
					this.name=name;
					this.sex=sex;
					this.age=age;
					this.jiankang=jiankang;
				}
			}
		}
	}
	
	//对学号进行校验的方法
	private String checkNum(String num)
	{
		String result="";
		if(num.length()!=12)//学号长度不是12位
		{
			result="学号长度不是12位";
		}
		else
		{
			for(int i=0;i<num.length();i++)
			{
				char ch=num.charAt(i);
				if((ch<'0')||(ch>'9'))
				{
					result="学号不全是数字字符";
					break;
				}
			}
		}
		return result;
	}

	public void setNum(String num)throws StudentException {
		String info=checkNum(num);
		if(!info.equals(""))//学号校验未通过
		{
			throw new StudentException(info);
		}
		else
		{
			this.num=num;
		}
	}
	
	

	public String getNum() {
		return num;
	}
	
	public void study()throws StudentException
	{
		if(jiankang)
		{
			System.out.println(this.name+"在学习");
		}
		else
		{
			throw new StudentException("生病无法学习");
		}
	}
}
