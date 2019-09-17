//����ѧ����Ϣ�ļ��������ݲ�������
import java.io.*;
import java.util.*;
public class StudentDAO {
	
	//ͨ��ѧ��������ѧ����Ϣ
	public String findStuByNum(String num)
	{
		String result="";
		//�������������ַ���
		try
		{
			FileReader fr=new FileReader("d:\\student.txt");
			//����һ���ļ��ַ�������
			BufferedReader br=new BufferedReader(fr);
			//���ļ��ַ����������������������ַ�����������
			String temp=br.readLine();
			//�ȶ�ȡһ������
			boolean flag=true;
			while(flag)
			{
				if(temp.startsWith(num))
				{
					result=temp;
					break;
				}
				temp=br.readLine();//�ٴζ�ȡһ������
				if(temp==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		return result;
	}
	
	//ͨ����������ѯѧ����Ϣ
	public String findStuBySname(String sname)
	{
		String result="";
		//�������������ַ���
		try
		{
			FileReader fr=new FileReader("d:\\student.txt");
			//����һ���ļ��ַ�������
			BufferedReader br=new BufferedReader(fr);
			//���ļ��ַ����������������������ַ�����������
			String temp=br.readLine();
			//�ȶ�ȡһ������
			boolean flag=true;
			while(flag)
			{
				if(temp.substring(4).startsWith(sname))
				{
					result=temp;
					break;
				}
				temp=br.readLine();//�ٴζ�ȡһ������
				if(temp==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		return result;
	}
	
	//ѧ����Ϣ��ѯ���� 
	public String findStuByPara(String para,int index)
	{
		String result="";
		//�������������ַ���
		try
		{
			FileReader fr=new FileReader("d:\\student.txt");
			//����һ���ļ��ַ�������
			BufferedReader br=new BufferedReader(fr);
			//���ļ��ַ����������������������ַ�����������
			String temp=br.readLine();
			//�ȶ�ȡһ������
			boolean flag=true;
			while(flag)
			{
				String str=temp;
				if(index==2)
				{
					str=temp.substring(4);
				}
				if(str.startsWith(para))
				{
					result=temp;
					break;
				}
				temp=br.readLine();//�ٴζ�ȡһ������
				if(temp==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		return result;
	}
	
	//����һ��ѧ����¼�ķ���
	public boolean addStudent(String stuinfo)
	{
		boolean result=false;
		String[] strs=stuinfo.split(",");
		if(!numIsExists(strs[0]))
		{
		
		try
		{
			FileWriter fw=new FileWriter("d:\\student.txt",true);
			//����һ���ļ��ַ����������,�ڶ�������Ϊ���ʾ׷�ӵ��ļ�β��
			BufferedWriter bw=new BufferedWriter(fw);
			//���ļ��ַ����������������������ַ����������
			bw.newLine();
			//�����µ�һ��
			bw.write(stuinfo);
			//д���µ�ѧ����¼
			bw.close();
			fw.close();
			result=true;
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ�д����");
		}
		}
		return result;
	}
	
	//�ж�����ӵ�ѧ����¼�Ƿ��Ѿ�����
	private boolean numIsExists(String num)
	{
		boolean result=false;
		try
		{
			FileReader fr=new FileReader("d:\\student.txt");
			//����һ���ļ��ַ�������
			BufferedReader br=new BufferedReader(fr);
			//���ļ��ַ����������������������ַ�����������
			String temp=br.readLine();
			//�ȶ�ȡһ������
			boolean flag=true;
			while(flag)
			{
				if(temp.startsWith(num))
				{
					result=true;
					break;
				}
				temp=br.readLine();
				if(temp==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		return result;
	}
	//���Ӷ���ѧ����¼�ķ���
	public int addStudents(String[] stus)
	{
		int result=0;
		//����ɹ������ѧ����¼����
		if(stus!=null)//�жϴ��ݹ��������鲻�ǿյ�
		{
			if(stus.length>0)//�ж�����ĳ��Ȳ�Ϊ0
			{
				for(int i=0;i<stus.length;i++)
				{
					if(addStudent(stus[i]))
					{
						result++;
					}
				}
			}
		}
		return result;
	}
	
	//ɾ��һ��ѧ����¼�ķ���
	public boolean deleteStudent(String num)
	{
		boolean result=false;
		try
		{
			ArrayList<String> list=new ArrayList<String>();
			//����һ�����������������ѧ����¼
			FileReader fr=new FileReader("d:\\student.txt");
			//����һ���ļ��ַ�������
			BufferedReader br=new BufferedReader(fr);
			//���ļ��ַ����������������������ַ�����������
			String temp=br.readLine();
			//�ȶ�ȡһ������
			boolean flag=true;
			while(flag)
			{
				list.add(temp);//��ĳ������д�뵽������
				temp=br.readLine();//�ٴζ�ȡһ������
				if(temp==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
			/////�����ǽ��в��Ҳ�ɾ���Ĵ���
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).startsWith(num))
				{
					list.remove(i);
					result=true;
					break;
				}
			}
			////����д���ļ��Ĵ���
			FileWriter fw=new FileWriter("d:\\student.txt");
			//����һ���ļ��ַ����������
			BufferedWriter bw=new BufferedWriter(fw);
			//���ļ��ַ����������������������ַ����������
			for(int i=0;i<list.size();i++)
			{
				bw.write(list.get(i));
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		return result;
	}
	
	//ɾ������ѧ����¼�ķ���
	public int deleteStudents(String[] nums)
	{
		int result=0;
		if(nums!=null)
		{
			if(nums.length>0)
			{
				for(int i=0;i<nums.length;i++)
				{
					if(deleteStudent(nums[i]))
					{
						result++;
					}
				}
			}
		}
		return result;
	}
	
	//�޸�һ��ѧ����¼�ķ��� 
	public boolean updateStudent(String stuinfo)
	{
		boolean result=false;
		String[] strs=stuinfo.split(",");
		try
		{
			ArrayList<String> list=new ArrayList<String>();
			//����һ�����������������ѧ����¼
			FileReader fr=new FileReader("d:\\student.txt");
			//����һ���ļ��ַ�������
			BufferedReader br=new BufferedReader(fr);
			//���ļ��ַ����������������������ַ�����������
			String temp=br.readLine();
			//�ȶ�ȡһ������
			boolean flag=true;
			while(flag)
			{
				list.add(temp);//��ĳ������д�뵽������
				temp=br.readLine();//�ٴζ�ȡһ������
				if(temp==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
			/////�����ǽ��в��Ҳ�ɾ���Ĵ���
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).startsWith(strs[0]))
				{
					list.remove(i);
					result=true;
					break;
				}
			}
			list.add(stuinfo);
			////����д���ļ��Ĵ���
			FileWriter fw=new FileWriter("d:\\student.txt");
			//����һ���ļ��ַ����������
			BufferedWriter bw=new BufferedWriter(fw);
			//���ļ��ַ����������������������ַ����������
			for(int i=0;i<list.size();i++)
			{
				bw.write(list.get(i));
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		return result;
	}
	
	//�޸Ķ���ѧ����¼�ķ���
	public int updateStudents(String[] stuinfos)
	{
		int result=0;
		if(stuinfos!=null)
		{
			if(stuinfos.length>0)
			{
				for(int i=0;i<stuinfos.length;i++)
				{
					if(updateStudent(stuinfos[i]))
					{
						result++;
					}
				}
			}
		}
		return result;
	}
	
}
