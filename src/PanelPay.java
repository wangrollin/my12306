import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelPay extends JPanel {
	private JButton goback = new JButton("返回");
	private JButton buy = new JButton("付款");
	
	private JLabel title = new JLabel("确认付款");
	private JLabel line1 = new JLabel("---------------------------------------------");
	private JLabel time = new JLabel("2017/06/20");
	private JLabel city = new JLabel("出发地-->目的地");
	private JLabel name = new JLabel("车次：k8082");
	private JLabel begin = new JLabel("发时：8:30");
	private JLabel end = new JLabel("到时：11:30");
	private JLabel through = new JLabel("历时：3小时");
	private JLabel seatANDprice = new JLabel("价格：30¥");
	private JLabel line2 = new JLabel("---------------------------------------------");
	
	private JLabel title2 = new JLabel("选择乘坐人：");
	
	JRadioButton radioButton1 = new JRadioButton("姓名1 ＋ 身份证号");
	JRadioButton radioButton2 = new JRadioButton("姓名2 ＋ 身份证号");
	JRadioButton radioButton3 = new JRadioButton("姓名3 ＋ 身份证号");
	JRadioButton radioButton4 = new JRadioButton("姓名4 ＋ 身份证号");
	JRadioButton radioButton5 = new JRadioButton("姓名5 ＋ 身份证号");
      
	ButtonGroup group = new ButtonGroup();
	
	private Train train = null;
	ArrayList<Identity> arr = null;
	
	private void addAll() {
		add(goback);
		add(buy);
		add(time);
		add(city);
		add(name);
		add(begin);
		add(end);
		add(through);
		add(seatANDprice);
		add(line1);
		add(line2);
		add(title);
		add(title2);
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		group.add(radioButton4);
		group.add(radioButton5);
		radioButton1.setSelected(true);
		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		add(radioButton4);
		add(radioButton5);
		
		
		title.setBounds(215, 20, 500, 50);
		title.setFont(new java.awt.Font("Dialog",   1,   15));
		
		int x = 50;
		int y = 100;
		line1.setBounds(x+10, y, 500, 5);
		line2.setBounds(x+10, y+130, 500, 5);
		
		time.setBounds(x+250,y+10,80,40);
		name.setBounds(x+50,y+10,80,40);
		begin.setBounds(x+50,y+50,80,40);
		end.setBounds(x+150,y+50,80,40);
		through.setBounds(x+250,y+50,80,40);
		city.setBounds(x+50,y+90,200,40);
		seatANDprice.setBounds(x+250,y+90,80,40);
		
		title2.setBounds(100, 250, 500, 40);
		title.setFont(new java.awt.Font("Dialog",   0,   14));
		
		

		buy.setBounds(200,545,80,40);
		goback.setBounds(400,545,80,40);
	}
	
	public void showID() {
		if(arr.size()>=1) {
			radioButton1.setText(arr.get(0).getName()+"  "+arr.get(0).getNum());
			radioButton1.setBounds(100,280,500,40);
		}
		if(arr.size()>=2) {
			radioButton2.setText(arr.get(1).getName()+"  "+arr.get(1).getNum());
			radioButton2.setBounds(100,320,500,40);
		}
		if(arr.size()>=3) {
			radioButton3.setText(arr.get(2).getName()+"  "+arr.get(2).getNum());
			radioButton3.setBounds(100,360,500,40);
		}
		if(arr.size()>=4) {
			radioButton4.setText(arr.get(3).getName()+"  "+arr.get(3).getNum());
			radioButton4.setBounds(100,400,500,40);
		}
		if(arr.size()>=5) {
			radioButton5.setText(arr.get(4).getName()+"  "+arr.get(4).getNum());
			radioButton5.setBounds(100,440,500,40);
		}
		
	}
	
	public void setTrain(Train train,String str,String time,String city,ArrayList<Identity> arr) {
		this.train = train;
		this.arr = arr;
		name.setText(train.getName());
		begin.setText("发时：" + train.getBegin());
		end.setText("到时：" + train.getEnd());
		through.setText("到时：" + train.getThrough());
		
		if("ss".equals(str)) {
			seatANDprice.setText("软座：" + train.getSoftSeatPrice() + "¥");
		}else if("hs".equals(str)) {
			seatANDprice.setText("硬座：" + train.getHardSeatPrice() + "¥");
		}else if("sb".equals(str)) {
			seatANDprice.setText("软卧：" + train.getSoftBedPrice() + "¥");
		}else if("hb".equals(str)) {
			seatANDprice.setText("硬卧：" + train.getHardBedPrice() + "¥");
		}else if("st".equals(str)) {
			seatANDprice.setText("站票：" + train.getStandPrice() + "¥");
		}
		
		this.time.setText(time);
		this.city.setText(time);
		showID();
	}
	
	public PanelPay() {
		addAll();
		
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}

	
	public JButton getGoback() {
		return goback;
	}

	
	public JButton getBuy() {
		return buy;
	}
	
	
	public void clear() {
		this.arr = null;
		radioButton1.setBounds(1000,280,500,40);
		radioButton2.setBounds(1000,320,500,40);
		radioButton3.setBounds(1000,360,500,40);
		radioButton4.setBounds(1000,400,500,40);
		radioButton5.setBounds(1000,440,500,40);
	}
	
	public boolean checkid() {
		return !(arr.size()==0);
	}
	

	public void error() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("您还没有添加身份，请先添加身份再购买。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	

	/*********************/
	//ID 中的这个人买 这张票
	public void buy(String ID) {
		
		Identity identity = null; 
		if(radioButton1.isSelected()) {
			identity = arr.get(0);
		}else if(radioButton2.isSelected()) {
			identity = arr.get(1);
		}else if(radioButton3.isSelected()) {
			identity = arr.get(2);
		}else if(radioButton4.isSelected()) {
			identity = arr.get(3);
		}else if(radioButton5.isSelected()) {
			identity = arr.get(4);
		}
		
		String time = this.time.getText();
		String city2city = this.city.getText();
		Train train = this.train;
		
		/*
		 * do it
		 */
	}
	
}
