import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame{//�̳д�����

	private JLabel label1;
	private JLabel label2;//�����ǩ����
	private JTextField text1;
	private JTextField text2;//�����ı������
	private JButton bt1;
	private JButton bt2;//���尴ť����
	
	
	public LoginForm()
	{
		this.setSize(400, 300);//���ô���Ĵ�С
		this.setTitle("��¼����");//���ô������
		//�����ؼ�
		label1=new JLabel("�û���");
		label2=new JLabel("��    ��");
		text1=new JTextField();
		text2=new JTextField();
		bt1=new JButton("��¼");
		bt2=new JButton("�˳�");
		
		
		this.add(label1,BorderLayout.NORTH);
		this.add(text1,BorderLayout.SOUTH);
		this.add(label2,BorderLayout.EAST);
		this.add(text2,BorderLayout.WEST);
		this.add(bt1,BorderLayout.CENTER);
		this.add(bt2,BorderLayout.CENTER);
		
		
		this.setVisible(true);//���ô���ɼ�
	}
}
