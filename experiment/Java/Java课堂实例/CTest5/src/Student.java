//ѧ����
public class Student {
	private String num;
	private String name;
	private String sex;
	private int age;
	private boolean jiankang;
	
	public Student(String num,String name,String sex,int age,boolean jiankang)throws StudentException
	{
		String info=checkNum(num);
		if(!info.equals(""))//ѧ��У��δͨ��
		{
			throw new StudentException(info);
		}
		else
		{
			if(!((sex.equals("��"))||(sex.equals("Ů"))))
			{
				throw new StudentException("�Ա�ֻ�����л�Ů");
			}
			else
			{
				if(age<16)
				{
					throw new StudentException("���䲻��С��16��");
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
	
	//��ѧ�Ž���У��ķ���
	private String checkNum(String num)
	{
		String result="";
		if(num.length()!=12)//ѧ�ų��Ȳ���12λ
		{
			result="ѧ�ų��Ȳ���12λ";
		}
		else
		{
			for(int i=0;i<num.length();i++)
			{
				char ch=num.charAt(i);
				if((ch<'0')||(ch>'9'))
				{
					result="ѧ�Ų�ȫ�������ַ�";
					break;
				}
			}
		}
		return result;
	}

	public void setNum(String num)throws StudentException {
		String info=checkNum(num);
		if(!info.equals(""))//ѧ��У��δͨ��
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
			System.out.println(this.name+"��ѧϰ");
		}
		else
		{
			throw new StudentException("�����޷�ѧϰ");
		}
	}
}
