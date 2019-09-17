import javax.swing.*;

import java.util.*;

import java.awt.Color;
import java.awt.event.*;

public class UpdateStuPanel extends JPanel implements ActionListener{
	
	JLabel numLabel;
	JLabel nameLabel;
	JLabel sexLabel;
	JTextField numText;
	JTextField nameText;
	JComboBox sexCom;
	JButton updateBt;
	JScrollPane scrollpane;
	JTable table;//չʾѧ����Ϣ�ı��
	
	public UpdateStuPanel()
	{
		this.setLayout(null);
		this.setSize(455,320);
		this.setBackground(Color.lightGray);
		this.init();
		this.refreshTable();
		this.setVisible(true);
	}
	
	private void init()
	{
		numLabel=new JLabel("������ѧ��");
		numLabel.setSize(90,30);
		numLabel.setLocation(30, 20);
		this.add(numLabel);
		numText=new JTextField();
		numText.setSize(120,30);
		numText.setLocation(140, 20);
		this.add(numText);
		nameLabel=new JLabel("����������");
		nameLabel.setSize(90,30);
		nameLabel.setLocation(30, 60);
		this.add(nameLabel);
		nameText=new JTextField();
		nameText.setSize(120,30);
		nameText.setLocation(140, 60);
		this.add(nameText);
		sexLabel=new JLabel("��ѡ���Ա�");
		sexLabel.setSize(90,30);
		sexLabel.setLocation(30, 100);
		this.add(sexLabel);
		sexCom=new JComboBox();
		sexCom.setSize(120,30);
		sexCom.setLocation(140, 100);
		sexCom.addItem("��");
		sexCom.addItem("Ů");
		this.add(sexCom);
		updateBt=new JButton("�޸�");
		updateBt.setSize(80,30);
		updateBt.setLocation(300, 100);
		updateBt.addActionListener(this);
		this.add(updateBt);
	}
	
	private void refreshTable()
	{
		String[] titles={"ѧ��","����","�Ա�"};
		StudentDAO dao=new StudentDAO();
		ArrayList<String> stus=dao.findAllStudents();
		Object[][] objs=new Object[stus.size()][3];
		for(int i=0;i<stus.size();i++)
		{
			String[] strs=stus.get(i).split(",");
			objs[i][0]=strs[0];
			objs[i][1]=strs[1];
			objs[i][2]=strs[2];
			System.out.println(strs[0]);
		}
		this.removeAll();
		this.init();
		table=new JTable(objs,titles);
		table.setSize(380,150);
	    scrollpane = new JScrollPane(table);
	    scrollpane.setLocation(20, 150);
		scrollpane.setSize(400, 150);
	    this.add(scrollpane);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(!checkIsNull())//����û�����Ϊ�յĻ�
		{
			JOptionPane.showMessageDialog(this, "ѧ�Ż���������Ϊ��");
		}
		else
		{
			if(!checkInput().equals(""))
			{
				JOptionPane.showMessageDialog(this,checkInput());
			}
			else
			{
				StudentDAO dao=new StudentDAO();
				//����һ������ѧ����Ϣ�ı��ļ��Ķ���
				StringBuffer stuInfo=new StringBuffer();
				stuInfo.append(numText.getText().trim()+",");
				stuInfo.append(nameText.getText().trim()+",");
				stuInfo.append(sexCom.getSelectedItem());
				if(dao.updateStudent(stuInfo.toString()))
				{
					JOptionPane.showMessageDialog(this,"�޸�ѧ����¼�ɹ�");
					numText.setText("");
					nameText.setText("");
					refreshTable();
					//��ӳɹ���ˢ�±��
				}
				else
				{
					JOptionPane.showMessageDialog(this,"�޸�ѧ����¼ʧ��");
				}
			}
		}
	}
	
	//�ж��û������Ƿ�Ϊ��
	private boolean checkIsNull()
	{
		boolean flag=true;
		if(numText.getText().trim().equals(""))
		{
			flag=false;
		}
		else
		{
			if(nameText.getText().trim().equals(""))
			{
				flag=false;
			}
		}
		return flag;
	}
	
	//У���û��������Ϣ�Ƿ�����
	private String checkInput()
	{
		String result="";
		if(numText.getText().trim().length()!=3)
		{
			result="ѧ�ŵĳ��Ȳ���3λ";
		}
		else
		{
			for(int i=0;i<numText.getText().trim().length();i++)
			{
				char ch=numText.getText().trim().charAt(i);
				if((ch<'0')||(ch>'9'))
				{
					result="ѧ���а����������ַ�";
					break;
				}
			}
		}
		return result;
	}
}
