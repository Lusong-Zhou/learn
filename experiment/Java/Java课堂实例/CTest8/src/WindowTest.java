import javax.swing.*;
import java.awt.event.*;

public class WindowTest extends JFrame implements WindowListener
{
	public WindowTest()
	{
		this.setSize(300,300);
		this.addWindowListener(this);
		this.setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		//JOptionPane.showMessageDialog(this, "�����ý���");
	}
	public void windowClosed(WindowEvent e) {
		
	}
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "���ڹر�");
	}
	public void windowDeactivated(WindowEvent e) {
		//JOptionPane.showMessageDialog(this, "����ʧȥ����");
	}
	public void windowDeiconified(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "����ָ�����");
	}
	public void windowIconified(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "����ͼ�껯");
	}
	public void windowOpened(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "�����Ѿ���");
	}
}
