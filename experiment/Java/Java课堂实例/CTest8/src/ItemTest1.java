import javax.swing.*;
import java.awt.event.*;


public class ItemTest1 extends JFrame implements ItemListener
{
	JComboBox com;//���������
	JComboBox com1;
	String currentSelect;//��ǰ��ѡ��
	
	String[] strs1={"��е��Ƽ����Զ���","��е���ӹ���"};
	String[] strs2={"�������ѧ�뼼��","���繤��"};
	String[] strs3={"��ҵ���","�������"};
	
	public ItemTest1()
	{
		this.setSize(300,300);
		this.setLayout(null);
		com=new JComboBox();
		com.setSize(120,30);
		com.setLocation(30,30);
		
		String[] strs={"����ѧԺ","����ѧԺ","����ѧԺ"};
		for(int i=0;i<strs.length;i++)
		{
			com.addItem(strs[i]);
		}
		currentSelect="����ѧԺ";
		com.addItemListener(this);
		this.add(com);
		com1=new JComboBox();
		com1.setSize(120,30);
		com1.setLocation(30,80);
		for(int i=0;i<strs1.length;i++)
		{
			com1.addItem(strs1[i]);
		}
		this.add(com1);
		this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(!currentSelect.equals(com.getSelectedItem()))
		{
			currentSelect= com.getSelectedItem().toString();
			com1.removeAllItems();
			if(currentSelect.equals("����ѧԺ"))
			{
				for(int i=0;i<strs1.length;i++)
				{
					com1.addItem(strs1[i]);
				}
			}
			else
			{
				if(currentSelect.equals("����ѧԺ"))
				{
					for(int i=0;i<strs2.length;i++)
					{
						com1.addItem(strs2[i]);
					}
				}
				else
				{
					for(int i=0;i<strs3.length;i++)
					{
						com1.addItem(strs3[i]);
					}
				}
			}
		}
		
		
	}
}
