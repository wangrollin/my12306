import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMyhome extends JPanel {
	private JLabel title = new JLabel("");
	private String ID = null;
	private boolean ONLINE = false;
	
	private JButton order = new JButton("我的订单");
	private JButton search = new JButton("车票查询");
	private JButton ids = new JButton("身份验证");
	private JButton quit = new JButton("退出登录");
	
	public JButton getOrder() {
		return order;
	}

	public JButton getSearch() {
		return search;
	}

	public JButton getIds() {
		return ids;
	}
	
	public JButton getQuit() {
		return quit;
	}

	private void addAll() {
		add(title);
		add(order);
		add(search);
		add(ids);
		add(quit);
		title.setBounds(80, 30, 500, 30);
		title.setFont(new java.awt.Font("Dialog",   1,   15));
		order.setBounds(50, 100, 400, 100);
		search.setBounds(50, 220, 400, 100);
		ids.setBounds(50, 340, 400, 100);
		quit.setBounds(150, 480, 200, 70);
	}
	
	public PanelMyhome(){
		addAll();
		
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	public String getID() {
		return this.ID;
	}
	
	public void login(String ID) {
		this.ID = ID;
		title.setText("尊敬的<"+ID+">您好，欢迎使用My12306。");
		this.ONLINE = true;
	}
	
	public void quit() {
		ID = null;
		ONLINE = false;
	}
	
	/*******************************/
	//返回该用户的订单并返回
	public ArrayList<Ticket> getTicketArr() {
		String id = this.ID;
		ArrayList<Ticket> arr = new ArrayList<>();
		/*
		 * do it
		 */
		//test
		arr.add(new Ticket("k878","09:34","10:43","1小时","软座：30¥",new Identity("王XX","XXX3154353"),"济南-->北京","2017/06/11"));
		arr.add(new Ticket("k11","09:11","10:11","1小时","软座：11¥",new Identity("王11","1XXX3154353"),"济南1-->北京","2017/06/11"));
		arr.add(new Ticket("k22","09:22","10:22","1小时","软座：22¥",new Identity("王22","2XXX3154353"),"济南2-->北京","2017/06/22"));
		arr.add(new Ticket("k33","09:33","10:33","1小时","软座：33¥",new Identity("王33","3XXX3154353"),"济南3-->北京","2017/06/23"));
		arr.add(new Ticket("k44","09:44","10:44","1小时","软座：44¥",new Identity("王44","4XXX3154353"),"济南4-->北京","2017/06/24"));
		arr.add(new Ticket("k44","09:44","10:44","1小时","软座：44¥",new Identity("王44","4XXX3154353"),"济南4-->北京","2017/06/24"));
		return arr;
	}
	//返回该用户的所有身份
	public ArrayList<Identity> getIdArray() {
		ArrayList<Identity> arr = new ArrayList<>();
		String ID = this.getID();
		/*
		 * do it
		 */
		//test
		arr.add(new Identity("王11","XXX3154353"));
		arr.add(new Identity("王22","XXX3154353"));
		arr.add(new Identity("王33","XXX3154353"));
		
		return arr;
	}
	
}
