import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;


public class MenuTest extends JFrame implements ActionListener{

	JMenuBar bar;//�˵���
	JMenu menu;//�˵�
	JMenuItem[] items;//�˵�������
	JButton[] bts;//��ť����
	
	
	public MenuTest()
	{
		this.setSize(300,300);
		this.setLayout(null);
		this.initMenu();
		this.initButton();
		this.setVisible(true);
	}
	
	private void initMenu()
	{
		bar=new JMenuBar();
		//�����˵�������
		menu=new JMenu("������ɫ");
		//�����˵�
		String[] strs={"��ɫ","��ɫ","��ɫ"};
		items=new JMenuItem[strs.length];
		for(int i=0;i<items.length;i++)
		{
			items[i]=new JMenuItem(strs[i]);
			//�����˵���������ı���Ϣ
			items[i].addActionListener(this);
			menu.add(items[i]);//���˵�����ӵ��˵���
		}
		bar.add(menu);//���˵���ӵ��˵�����
		this.setJMenuBar(bar);//���ô���Ĳ˵���
	}
	
	private void initButton()
	{
		String[] strs={"��ɫ","��ɫ","��ɫ"};
		bts=new JButton[strs.length];
		for(int i=0;i<bts.length;i++)
		{
			bts[i]=new JButton(strs[i]);
			bts[i].setSize(80,30);
			bts[i].setLocation(30,35*i+30);
			bts[i].addActionListener(this);
			this.add(bts[i]);
		}
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*if(e.getSource().getClass().toString().contains("JMenuItem"))
		{
			JMenuItem item=(JMenuItem)e.getSource();
			if(item.getText().equals("��ɫ"))
			{
				this.getContentPane().setBackground(Color.red);
			}
			else
			{
				if(item.getText().equals("��ɫ"))
				{
					this.getContentPane().setBackground(Color.blue);
				}
				else
				{
					this.getContentPane().setBackground(Color.green);
				}
			}
		}
		else
		{
			JButton item=(JButton)e.getSource();
			if(item.getText().equals("��ɫ"))
			{
				this.getContentPane().setBackground(Color.red);
			}
			else
			{
				if(item.getText().equals("��ɫ"))
				{
					this.getContentPane().setBackground(Color.blue);
				}
				else
				{
					this.getContentPane().setBackground(Color.green);
				}
			}
		}*/
		AbstractButton item=(AbstractButton)e.getSource();
		if(item.getText().equals("��ɫ"))
		{
			this.getContentPane().setBackground(Color.red);
		}
		else
		{
			if(item.getText().equals("��ɫ"))
			{
				this.getContentPane().setBackground(Color.blue);
			}
			else
			{
				this.getContentPane().setBackground(Color.green);
			}
		}
		
	}
	
	
}
