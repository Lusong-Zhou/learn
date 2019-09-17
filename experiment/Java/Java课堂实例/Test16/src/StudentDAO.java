//ѧ����Ϣ�ļ��Ĳ�����
import java.io.*;
import java.util.*;
public class StudentDAO {
	
	//�������е�ѧ����Ϣ
	public ArrayList<String> findAllStudents()
	{
		ArrayList<String> result=new ArrayList<String>();
		try {
			FileReader fr=new FileReader("d:\\student.txt");
			//������һ���ļ��ַ�����������
			BufferedReader br=new BufferedReader(fr);
			//����һ��������Ϊ����������һ��������ַ�����������
			String str=br.readLine();//��ȡһ������
			while(str!=null)
			{
				result.add(str);
				str=br.readLine();
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�������");
		}
		return result;
	}
	
	//ͨ��ѧ��������ѧ���Ļ�����Ϣ
	public String findStudentBySno(String sno)
	{
		String result="���������ѧ��";
		try {
			FileReader fr=new FileReader("d:\\student.txt");
			//������һ���ļ��ַ�����������
			BufferedReader br=new BufferedReader(fr);
			//����һ��������Ϊ����������һ��������ַ�����������
			String str=br.readLine();//��ȡһ������
			boolean flag=true;
			while(flag)
			{
				if(str.startsWith(sno.trim()))
				{
					result=str;
					flag=false;
				}
				str=br.readLine();//������ȡ��һ��
				if(str==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�������");
		}
		return result;
	}
	
	
	//ͨ������������ѧ���Ļ�����Ϣ
	public String findStudentBySname(String sname)
	{
		String result="���������ѧ��";
		try {
			FileReader fr=new FileReader("d:\\student.txt");
			//������һ���ļ��ַ�����������
			BufferedReader br=new BufferedReader(fr);
			//����һ��������Ϊ����������һ��������ַ�����������
			String str=br.readLine();//��ȡһ������
			boolean flag=true;
			while(flag)
			{
				if(str.substring(4).startsWith(sname.trim()))
				{
					result=str;
					flag=false;
				}
				str=br.readLine();//������ȡ��һ��
				if(str==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�������");
		}
		return result;
	}
	
	//ͨ������������ѧ���Ļ�����Ϣ
	public String findStudentByPara(boolean bool,String para)
	{
		String result="���������ѧ��";
		try {
			FileReader fr=new FileReader("d:\\student.txt");
			//������һ���ļ��ַ�����������
			BufferedReader br=new BufferedReader(fr);
			//����һ��������Ϊ����������һ��������ַ�����������
			String str=br.readLine();//��ȡһ������
			boolean flag=true;
			while(flag)
			{
				String temp=str;
				if(!bool)
				{
					temp=str.substring(4);
				}
				if(temp.startsWith(para.trim()))
				{
					result=str;
					flag=false;
				}
				str=br.readLine();//������ȡ��һ��
				if(str==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�������");
		}
		return result;
	}
	
	//����һ��ѧ����¼
	public boolean addStudent(String stuinfo)
	{
		String[] strs=stuinfo.split(",");
		if(!numIsExist(strs[0]))
		{
		try {
			FileWriter fw=new FileWriter("d:\\student.txt",true);
			//����һ���ļ����ַ������,�ڶ���������ʾ�����ļ�β������׷��
			BufferedWriter bw=new BufferedWriter(fw);
			//�����洴���Ķ���Ϊ��������һ�������ַ������
			bw.newLine();
			//�����µ�һ��
			bw.write(stuinfo);
			bw.close();
			fw.close();	
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�д����");
		}
		return true;
		}
		else
		{
			return false;
		}
	}
	
	//�ж��Ƿ��Ѿ������ظ���ѧ��
	private boolean numIsExist(String num)
	{
		boolean result=false;
		try {
			FileReader fr=new FileReader("d:\\student.txt");
			//������һ���ļ��ַ�����������
			BufferedReader br=new BufferedReader(fr);
			//����һ��������Ϊ����������һ��������ַ�����������
			String str=br.readLine();//��ȡһ������
			while(str!=null)
			{
				if(str.startsWith(num))
				{
					result=true;
					break;
				}
				str=br.readLine();
			}
			
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�������");
		}
		return result;
	}
	
	//���Ӷ���ѧ����¼
	public int addStudents(String[] stus)
	{
		int result=0;
		//����һ��������������ӳɹ���ѧ����¼����
		if(stus!=null)
		{
			if(stus.length>0)
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
		//����ɾ���Ƿ�ɹ��ı���
		try
		{
			FileReader fr=new FileReader("d:\\student.txt");
			//������һ���ļ��ַ�����������
			BufferedReader br=new BufferedReader(fr);
			//����һ��������Ϊ����������һ��������ַ�����������
			String str=br.readLine();//��ȡһ������
			ArrayList<String> list=new ArrayList<String>();
			//��������ѧ����Ϣ
			boolean flag=true;
			while(flag)
			{
				list.add(str);
				str=br.readLine();//�ٴζ�ȡһ������
				if(str==null)
				{
					flag=false;
				}
			}
			br.close();
			fr.close();
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).startsWith(num))
				{
					list.remove(i);
					result=true;
					break;
				}
			}//����Ӧ��ѧ����¼�Ƴ�
			FileWriter fw=new FileWriter("d:\\student.txt");
			//����һ���ļ����ַ������,����Ҫ׷��
			BufferedWriter bw=new BufferedWriter(fw);
			//�����洴���Ķ���Ϊ��������һ�������ַ������
			for(int i=0;i<list.size();i++)
			{
				bw.write(list.get(i));
				//�ֱ�д��ѧ����¼
			    bw.newLine();
			}
			bw.flush();
			bw.close();
			fw.close();
		}
		catch(IOException ex)
		{
			
		}
		return result;
	}
	//ɾ������ѧ����¼�ķ���
	public int deleteStus(String[] nums)
	{
		int result=0;
		//��������ɹ�ɾ����ѧ����¼����
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
	
	//�޸�һ����¼�ķ���
	public boolean updateStudent(String stuinfo)
	{
		String[] strs=stuinfo.split(",");
		if(numIsExist(strs[0]))
		{
			try
			{
				FileReader fr=new FileReader("d:\\student.txt");
				//������һ���ļ��ַ�����������
				BufferedReader br=new BufferedReader(fr);
				//����һ��������Ϊ����������һ��������ַ�����������
				String str=br.readLine();//��ȡһ������
				ArrayList<String> list=new ArrayList<String>();
				//��������ѧ����Ϣ
				boolean flag=true;
				while(flag)
				{
					list.add(str);
					str=br.readLine();//�ٴζ�ȡһ������
					if(str==null)
					{
						flag=false;
					}
				}
				br.close();
				fr.close();
				
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).startsWith(strs[0]))
					{
						list.remove(i);
						//�ȴӶ�̬����������Ƴ�
						list.add(stuinfo);
						//Ȼ��������޸ĺ��ѧ����¼
						break;
					}
				}//����Ӧ��ѧ����¼�Ƴ�
				FileWriter fw=new FileWriter("d:\\student.txt");
				//����һ���ļ����ַ������,����Ҫ׷��
				BufferedWriter bw=new BufferedWriter(fw);
				//�����洴���Ķ���Ϊ��������һ�������ַ������
				for(int i=0;i<list.size();i++)
				{
					bw.write(list.get(i));
					//�ֱ�д��ѧ����¼
				    bw.newLine();
				}
				bw.flush();
				bw.close();
				fw.close();
			}
			catch(IOException ex)
			{
				
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	//�޸Ķ���ѧ����¼
	public int updateStus(String[] stus)
	{
		int result=0;
		if(stus!=null)
		{
			if(stus.length>0)
			{
				for(int i=0;i<stus.length;i++)
				{
					if(updateStudent(stus[i]))
					{
						result++;
					}
				}
			}
		}
		return result;
	}
}
