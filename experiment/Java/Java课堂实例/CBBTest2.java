import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class CBBTest2 extends JFrame implements ItemListener
{
	JComboBox cbx;//ѧԺ������
	JComboBox cbx1;//רҵ������
	JComboBox cbx2;//�༶������
	String currentSelectXY;
	String currentSelectZY;
	
	String[] strs1={"��е���ӹ���","��е���������"};
	String[] strs2={"���繤��","�������ѧ�뼼��"};
	String[] strs3={"��Ϣ������ѧ","��ѧ��Ӧ����ѧ"};
	public CBBTest2()
	{
		this.setSize(300, 300);
		this.setLayout(null);
		cbx=new JComboBox();
		cbx.setSize(150, 30);
		cbx.setLocation(30,30);
		String[] strs={"����ѧԺ","����ѧԺ","����ѧԺ"};
		for(int i=0;i<strs.length;i++)
		{
			cbx.addItem(strs[i]);
		}
		cbx.addItemListener(this);
		currentSelectXY="����ѧԺ";

		this.add(cbx);
		cbx1=new JComboBox();
		cbx1.setSize(150, 30);
		cbx1.setLocation(30,70);
		for(int i=0;i<strs1.length;i++)
		{
			cbx1.addItem(strs1[i]);
		}
		currentSelectZY="��е���ӹ���";
		//cbx1.setSelectedItem("��е���ӹ���");
		cbx1.addItemListener(this);
		this.add(cbx1);
		cbx2=new JComboBox();
		cbx2.setSize(150, 30);
		cbx2.setLocation(30,110);
		for(int i=0;i<3;i++)
		{
			cbx2.addItem(currentSelectZY+(i+1)+"��");
		}
		this.add(cbx2);
	    this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		JComboBox cbb=(JComboBox)e.getSource();
		if(cbb.equals(cbx))//�ж��¼�Դ����ʾѧԺ��������
		{
			if (!currentSelectXY.equals(cbx.getSelectedItem())) {
				currentSelectXY = cbx.getSelectedItem().toString();
				cbx1.removeAllItems();
				cbx2.removeAllItems();
				if (currentSelectXY.equals("����ѧԺ")) {
					for (int i = 0; i < strs1.length; i++) {
						cbx1.addItem(strs1[i]);
					}
				} else {
					if (currentSelectXY.equals("����ѧԺ")) {
						for (int i = 0; i < strs2.length; i++) {
							cbx1.addItem(strs2[i]);
						}
					} else {
						for (int i = 0; i < strs3.length; i++) {
							cbx1.addItem(strs3[i]);
						}
					}
				}
			}
		}
		else
		{
			if ((cbx1.getItemCount()!=0)&&(!currentSelectZY.equals(cbx1.getSelectedItem()))) {
				currentSelectZY = cbx1.getSelectedItem().toString();
				cbx2.removeAllItems();
				for (int i = 0; i < 3; i++) {
					cbx2.addItem(currentSelectZY + (i + 1) + "��");
				}

			}
		}	
	}
}
