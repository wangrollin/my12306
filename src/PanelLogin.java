import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelLogin extends JPanel {

	
	private JButton goback = new JButton("返回");
	private JButton login = new JButton("登录");
	private JButton reg = new JButton("注册");
	private JLabel _id = new JLabel("用户名: ");
	private JLabel _pass = new JLabel("密码: ");
	private JTextField id = new JTextField("");
	private JPasswordField pass = new JPasswordField("");
	
	public PanelLogin() {
		
		add(goback);
		goback.setBounds(140,450,240,50);
		add(login);
		login.setBounds(280,300,100,50);
		add(reg);
		reg.setBounds(140,300,100,50);
		
		//set id & pass
		add(_id);
		_id.setBounds(140,90,50,50);
		add(id);
		id.setBounds(190,90,200,50);
		
		add(_pass);
		_pass.setBounds(140,150,50,50);
		add(pass);
		pass.setBounds(190,150,200,50);
		
		
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	public JButton getGoback() {
		return goback;
	}
	
	public JButton getLogin() {
		return login;
	}
	
	public JButton getReg() {
		return reg;
	}
	
	public void clear() {
		id.setText("");
		pass.setText("");
	}
	
	public String getId() {
		return id.getText();
	}
	
	public void netError() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("连接不到数据库，请检查网络是否连接。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	
	public void idError() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("用户名或密码错误，请重新登录。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	
	
	/*************************/
	//检查是否可以登录，1可以登录  －1网络错误  0用户名或者密码错误
	public int canLogin() {
		String name = id.getText();
		String pass = id.getText();
		
		/*
		 * do it
		 */
		
		return 1;
	}
	
	
	
	
}





