import java.io.*;
public class Test2 {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("d:\\123.txt");
			int temp=fr.read();//��ȡһ���ַ�
			while(temp!=-1)
			{
				System.out.print((char)temp+",");
				temp=fr.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		

	}

}
