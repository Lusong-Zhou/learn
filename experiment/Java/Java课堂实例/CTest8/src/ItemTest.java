import javax.swing.*;
import java.awt.event.*;


public class ItemTest extends JFrame implements ItemListener
{
	JComboBox com;//���������
	String currentSelect;//��ǰ��ѡ��
	
	public ItemTest()
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
		this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(!currentSelect.equals(com.getSelectedItem()))
		{
			currentSelect= com.getSelectedItem().toString();
			JOptionPane.showMessageDialog(this, com.getSelectedItem());
		}
		
		
	}
}
