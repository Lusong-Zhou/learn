import javax.swing.*;
import java.awt.event.*;

public class MainFrm extends JFrame implements ActionListener
{
	JMenuBar bar;
	JMenu menu;
	JMenuItem[] items;
	JPanel panel;
	
	public MainFrm()
	{
		this.setSize(500,400);
		this.setTitle("ѧ����Ϣ����");
		this.setLayout(null);
		this.intiMenu();
		this.setVisible(true);
	}
	
	private void intiMenu()
	{
		bar=new JMenuBar();
		menu=new JMenu("����");
		items=new JMenuItem[4];
		String[] menuNames={"����","ɾ��","�޸�","��ѯ"};
		for(int i=0;i<menuNames.length;i++)
		{
			items[i]=new JMenuItem(menuNames[i]);
			items[i].addActionListener(this);
			menu.add(items[i]);
		}
		bar.add(menu);
		this.setJMenuBar(bar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item=(JMenuItem)e.getSource();
		if(panel!=null)
		{
			this.remove(panel);
		}
		if(item.getText().equals("����"))
		{
			panel=new AddStuPanel();
			//����һ������ѧ����Ϣ��������
			panel.setLocation(20,20);
			this.add(panel);
			this.repaint();
		}
		else
		{
			if(item.getText().equals("ɾ��"))
			{
				panel=new DeleteStuPanel();
				//����һ������ѧ����Ϣ��������
				panel.setLocation(20,20);
				this.add(panel);
				this.repaint();
			}
			else
			{
				if(item.getText().equals("�޸�"))
				{
					panel=new UpdateStuPanel();
					//����һ������ѧ����Ϣ��������
					panel.setLocation(20,20);
					this.add(panel);
					this.repaint();
				}
			}
		}
		
	}
}
