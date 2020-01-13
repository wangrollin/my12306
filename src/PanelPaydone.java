import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPaydone extends JPanel {
	
	private JButton goback = new JButton("返回");
	private JLabel text1 = new JLabel("尊敬的用户您好，车票已经购买成功,");
	private JLabel text2 = new JLabel("您可在<我的订单>中查看具体信息。");
	public PanelPaydone() {
		add(goback);
		add(text1);
		add(text2);
		text1.setBounds(120, 130, 500, 50);
		text2.setBounds(120, 190, 500, 50);
		text1.setFont(new java.awt.Font("Dialog",   1,   15));
		text2.setFont(new java.awt.Font("Dialog",   1,   15));
		goback.setBounds(150,400 , 200, 50);
		
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	public JButton getGoback() {
		return goback;
	}

	public void clear() {
		
	}
	
}
