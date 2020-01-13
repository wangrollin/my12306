import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelReg extends JPanel {

	private JLabel _id = new JLabel("用户名: ");
	private JLabel _pass = new JLabel("密码: ");
	private JTextField id = new JTextField();
	private JPasswordField pass = new JPasswordField();
	
	private JButton reg = new JButton("注册新用户");
	private JButton unreg = new JButton("取消注册");
	
	private void addAll() {
		//set id & pass
		add(_id);
		_id.setBounds(140,90,50,50);
		add(id);
		id.setBounds(190,90,200,50);
		
		add(_pass);
		_pass.setBounds(140,150,50,50);
		add(pass);
		pass.setBounds(190,150,200,50);
		
		add(reg);
		add(unreg);
		reg.setBounds(200, 270, 150, 50);
		unreg.setBounds(200, 370, 150, 50);
	}
	
	public PanelReg() {
		addAll();
		
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}

	public JButton getReg() {
		return reg;
	}

	public JButton getUnreg() {
		return unreg;
	}
	
	public void clear() {
		id.setText("");
		pass.setText("");
	}

	public void error() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("用户名为空或者用户名已被注册，请换一个用户名注册。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}

	/***************************/
	//判断是否有重复的用户名 
	public boolean canReg() {
		//不能为空
		if("".equals(id.getText())) {
			return false;
		}
		String name = id.getText();
		/*
		 * do it
		 */
		return true;
	}
	
}
