import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSearch extends JPanel {
	private JButton goback = new JButton("返回");
	private JButton search = new JButton("查询");
	private JButton exchange = new JButton("交换城市");
	private JTextField from = new JTextField();
	private JTextField to = new JTextField();
	private JTextField year = new JTextField();
	private JTextField month = new JTextField();
	private JTextField day = new JTextField();
	private JLabel date = new JLabel("出发日期:");
	private JLabel space1 = new JLabel("-");
	private JLabel space2 = new JLabel("-");
	
	private int datex = 100;
	private int datey = 200;
	
	private void addAll() {
		//set city
		add(goback);
		goback.setBounds(300,450,100,50);
		add(search);
		search.setBounds(100,300,300,50);
		add(exchange);
		exchange.setBounds(200,100,100,40);
		
		//set date
		add(date);
		date.setBounds(datex,200,100,35);
		add(year);
		year.setText("2017");
		year.setBounds(datex+55,datey,50,35);
		add(space1);
		space1.setBounds(datex+105,datey,35,35);
		add(month);
		month.setText("06");
		month.setBounds(datex+115,datey,35,35);
		add(space2);
		space2.setBounds(datex+150,datey,35,35);
		add(day);
		day.setText("19");
		day.setBounds(datex+160,datey,35,35);
		
		add(from);
		from.setText("出发地");
		//from.setFont();
		from.setBounds(100,100,100,40);
		
		add(to);
		to.setText("目的地");
		to.setBounds(300,100,100,40);
	}
	
	public PanelSearch() {
		addAll();
	
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	public JButton getGoback() {
		return goback;
	}
	
	public JButton getSearch() {
		return search;
	}
	
	public JButton getExchange() {
		return exchange;
	}

	public void exchange() {
		String str = from.getText();
		from.setText(to.getText());
		to.setText(str);
	}
	
	public void cityError() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("没有匹配的城市名称，请重新输入城市。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	
	public void timeError() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("时间不合法，请重新输入时间。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	
	public boolean checkTime() {
		String year=this.year.getText();
		String month=this.month.getText();
		String day=this.day.getText();
		String str = year + "/" + month + "/" +day;
		
		boolean convertSuccess=true;
	       SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	       try {
	          format.setLenient(false);
	          format.parse(str);
	       } catch (Exception e) {
	           convertSuccess=false;
	       } 
	       return convertSuccess; 
	}
	
	public String getTime(){
		String year=this.year.getText();
		String month=this.month.getText();
		String day=this.day.getText();
		String time = year + "/" + month + "/" +day;
		return time;
	}
	
	public String getCity1(){
		String city1=from.getText();
		return city1;
	}
	
	public String getCity2(){
		String city2=to.getText();
		return city2;
	}
	
	/******************* 需要完成 ************************/
	//检查两个城市是否存在相应的路线
	public boolean checkCity() {
		String city1=from.getText();
		String city2=to.getText();
		/*
		 * do it
		 */
		return true;
	}
	
	//返回搜查到的结果 以Train类包装每一个  最后放在arraylist中
	public ArrayList<Train> TrainArr() {
		//时间
		String year=this.year.getText();
		String month=this.month.getText();
		String day=this.day.getText();
		String time = year + "/" + month + "/" +day;
		//地点
		String city1=from.getText();
		String city2=to.getText();
		
		
		/*
		 * do it ,find the  ArrayList<Train>
		 */
		
		//test
		 ArrayList<Train> arr = new ArrayList<>();
		 arr.add(new Train("k80821","08:30","11.30","3小时",1,2,3,4,0,"11","22","33","44","55"));
		 arr.add(new Train("k80822","08:30","11.30","3小时",1,2,3,0,5,"111","212","313","414","515"));
		 arr.add(new Train("k80823","08:30","11.30","3小时",1,2,0,4,5,"121","222","323","424","525"));
		 arr.add(new Train("k80824","08:30","11.30","3小时",0,0,3,4,5,"131","232","333","434","535"));
		 arr.add(new Train("k80825","08:30","11.30","3小时",0,2,3,4,5,"141","242","343","444","545"));
		 arr.add(new Train("k80826","08:30","11.30","3小时",1,0,3,4,5,"151","252","353","454","555"));
		 return arr;
	}

}
