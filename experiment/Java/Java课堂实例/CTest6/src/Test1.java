import java.io.*;
public class Test1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("d:\\abc.txt");
			//����һ���ļ��ֽ�����������
			int temp=fis.read();
			//��ȡһ���ֽ�
			while(temp!=-1)//�ж��Ƿ��ļ���β��
			{
				System.out.print((char)temp+",");
				temp=fis.read();
				//�ٴζ�ȡһ���ֽ�
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		

	}

}
