import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PanelHome extends JPanel {
	private JButton search = new JButton("车票查询");
	private JButton login = new JButton("用户登录");
	private ImageIcon back = null;
	public PanelHome() {
		
		add(search);
		add(login);
		search.setBounds(100,500,100,50);
		login.setBounds(300,500,100,50);
		back=new ImageIcon(getClass().getResource("bg.jpg"));
		
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	 public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	back.paintIcon(this,g,0,0);
    }
	
	public JButton getSearch() {
		return search;
	}
	
	public JButton getLogin() {
		return login;
	}
	
	
}
