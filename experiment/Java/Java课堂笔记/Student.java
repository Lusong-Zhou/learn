//ѧ����
public class Student extends Human{
	//����
	public String stuNum;
	//����
	public void study()
	{
		System.out.println(getName()+"��ѧϰ");
	}
	public void exam(String courseName)
	{
		System.out.println(getName()+"�ڲμ�"+courseName+"�γ̵Ŀ���");
	}
	//���췽��
	public Student(String num,String stuName,String stuSex,int stuAge)
	{
		//��ʼ���̳��ڸ��������
		super(stuName,stuSex,stuAge);
		//��ʼ�����������е�����
		stuNum=num;
	}
}
