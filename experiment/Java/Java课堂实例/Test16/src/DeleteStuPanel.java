import javax.swing.*;

import java.util.*;

import java.awt.Color;
import java.awt.event.*;

public class DeleteStuPanel extends JPanel implements ActionListener{
	
	JLabel numLabel;
	JTextField numText;
	JButton delBt;
	JScrollPane scrollpane;
	JTable table;//չʾѧ����Ϣ�ı��
	
	public DeleteStuPanel()
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
		delBt=new JButton("ɾ��");
		delBt.setSize(80,30);
		delBt.setLocation(300, 20);
		delBt.addActionListener(this);
		this.add(delBt);
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
	    scrollpane.setLocation(20, 60);
		scrollpane.setSize(400, 230);
	    this.add(scrollpane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(!checkIsNull())//����û�����Ϊ�յĻ�
		{
			JOptionPane.showMessageDialog(this, "ѧ������Ϊ��");
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
				if(dao.deleteStudent(numText.getText().trim()))
				{
					JOptionPane.showMessageDialog(this,"ɾ��ѧ����¼�ɹ�");
					numText.setText("");
					refreshTable();
				}
				else
				{
					JOptionPane.showMessageDialog(this,"ɾ��ѧ����¼ʧ��");
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
