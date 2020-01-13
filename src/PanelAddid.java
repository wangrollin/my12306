import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelAddid extends JPanel {
	
	private JButton cancel = new JButton("取消添加");
	private JButton add = new JButton("确认添加");
	
	private JLabel text1 = new JLabel("姓名不能为空，不能超过10个字符。");
	private JLabel text2 = new JLabel("身份证号不能为空，身份证号不能超过十个字符。");

	private JLabel _id = new JLabel("姓名: ");
	private JLabel _num = new JLabel("身份证号: ");
	private JTextField id = new JTextField("");
	private JTextField num = new JTextField("");
	
	private String ID = null;
	
	public JButton getCancel() {
		return cancel;
	}

	public JButton getAdd() {
		return add;
	}

	private void addAll() {
		add(cancel);
		add(add);
		add(_id);
		add(_num);
		add(id);
		add(num);
		add(text1);
		add(text2);
		
		_id.setBounds(110,90,200,50);
		id.setBounds(190,90,200,50);
		_num.setBounds(110,190,200,50);
		num.setBounds(190,190,200,50);
		
		text1.setBounds(195, 145, 500, 20);
		text2.setBounds(195, 245, 500, 20);
		
		cancel.setBounds(150,450,200,50);
		add.setBounds(150,350,200,50);
	}
	
	public PanelAddid() {
		addAll();
		
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void clear() {
		id.setText("");
		num.setText("");
		ID = null;
	}
	
	public boolean check() {
		boolean flag = true;
		if("".equals(id.getText())||"".equals(num.getText())||id.getText().length()>10||num.getText().length()>10) {
			flag = false;
		}
		return flag;
	}
	
	public void error() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("姓名或者身份证号不符合规范");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	
	/*********************/
	//添加该身份到数据库
	public void add() {
		//ID
		String id = this.ID;
		//identity
		String name = this.id.getText();
		String num = this.num.getText();
		/*
		 * do it
		 */
	}
	
}
