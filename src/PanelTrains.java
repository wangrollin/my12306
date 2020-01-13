import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTrains extends JPanel {
	JLabel city = new JLabel("济南-->北京");
	JLabel time = new JLabel("2017-06-19");

	JLabel line = new JLabel("--------------------------------------------------------");
	JButton goback = new JButton("返回");
	JButton prePage = new JButton("上一页");
	JButton nextPage = new JButton("下一页");
	
	ArrayList<Train> arr = null;
	JLabel page = new JLabel("- 0 -");
	int nowIndex = 0;
	int maxIndex = 0;
	
	/******************* 1 **********************/
	JButton buyss1 = new JButton("购买ss");
	JButton buyhs1 = new JButton("购买hs");
	JButton buysb1 = new JButton("购买sb");
	JButton buyhb1 = new JButton("购买hb");
	JButton buyst1 = new JButton("购买st");
	JButton detail1 = new JButton("查看历经车站");

	JLabel name1 = new JLabel("name");
	JLabel begin1 = new JLabel("begin");
	JLabel end1 = new JLabel("end");
	JLabel through1 = new JLabel("through");
	
	JLabel ss1 = new JLabel();
	JLabel hs1 = new JLabel();
	JLabel sb1 = new JLabel();
	JLabel hb1 = new JLabel();
	JLabel st1 = new JLabel();
	JLabel line1 = new JLabel("--------------------------------------------------------");
	/******************* 2 **********************/
	JButton buyss2 = new JButton("购买ss");
	JButton buyhs2 = new JButton("购买hs");
	JButton buysb2 = new JButton("购买sb");
	JButton buyhb2 = new JButton("购买hb");
	JButton buyst2 = new JButton("购买st");
	JButton detail2 = new JButton("查看历经车站");

	JLabel name2 = new JLabel("name");
	JLabel begin2 = new JLabel("begin");
	JLabel end2 = new JLabel("end");
	JLabel through2 = new JLabel("through");
	
	JLabel ss2 = new JLabel();
	JLabel hs2 = new JLabel();
	JLabel sb2 = new JLabel();
	JLabel hb2 = new JLabel();
	JLabel st2 = new JLabel();
	JLabel line2 = new JLabel("--------------------------------------------------------");
	/******************* 3 **********************/
	JButton buyss3 = new JButton("购买ss");
	JButton buyhs3 = new JButton("购买hs");
	JButton buysb3 = new JButton("购买sb");
	JButton buyhb3 = new JButton("购买hb");
	JButton buyst3 = new JButton("购买st");
	JButton detail3 = new JButton("查看历经车站");

	JLabel name3 = new JLabel("name");
	JLabel begin3 = new JLabel("begin");
	JLabel end3 = new JLabel("end");
	JLabel through3 = new JLabel("through");
	
	JLabel ss3 = new JLabel();
	JLabel hs3 = new JLabel();
	JLabel sb3 = new JLabel();
	JLabel hb3 = new JLabel();
	JLabel st3 = new JLabel();
	JLabel line3 = new JLabel("--------------------------------------------------------");
	/******************* 4 **********************/
	JButton buyss4 = new JButton("购买ss");
	JButton buyhs4 = new JButton("购买hs");
	JButton buysb4 = new JButton("购买sb");
	JButton buyhb4 = new JButton("购买hb");
	JButton buyst4 = new JButton("购买st");
	JButton detail4 = new JButton("查看历经车站");

	JLabel name4 = new JLabel("name");
	JLabel begin4 = new JLabel("begin");
	JLabel end4 = new JLabel("end");
	JLabel through4 = new JLabel("through");
	
	JLabel ss4 = new JLabel();
	JLabel hs4 = new JLabel();
	JLabel sb4 = new JLabel();
	JLabel hb4 = new JLabel();
	JLabel st4 = new JLabel();
	JLabel line4 = new JLabel("--------------------------------------------------------");
	
	public PanelTrains() {
		addAll();
		
		city.setBounds(200, 10, 500, 30);
		time.setBounds(200, 50, 200, 30);
		goback.setBounds(375, 525, 100, 40);
		prePage.setBounds(20, 525, 100, 40);
		page.setBounds(170, 525, 50, 40);
		nextPage.setBounds(250, 525, 100, 40);
		line.setBounds(20, 90, 480, 10);

		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	public void setTrain (ArrayList<Train> arr,String time,String city1,String city2) {
		
		this.arr = arr;
		maxIndex = arr.size()/4 + (arr.size()%4==0 ? 0 : 1);
		this.city.setText(city1 + "-->" + city2);
		this.time.setText(time);
		nextPage();
	}
	
	
	public JButton getDetail1() {
		return detail1;
	}

	public JButton getDetail2() {
		return detail2;
	}

	public JButton getDetail3() {
		return detail3;
	}

	public JButton getDetail4() {
		return detail4;
	}

	public JButton getBuyss1() {
		return buyss1;
	}

	public JButton getBuyhs1() {
		return buyhs1;
	}

	public JButton getBuysb1() {
		return buysb1;
	}

	public JButton getBuyhb1() {
		return buyhb1;
	}

	public JButton getBuyst1() {
		return buyst1;
	}

	public JButton getBuyss2() {
		return buyss2;
	}

	public JButton getBuyhs2() {
		return buyhs2;
	}

	public JButton getBuysb2() {
		return buysb2;
	}

	public JButton getBuyhb2() {
		return buyhb2;
	}

	public JButton getBuyst2() {
		return buyst2;
	}

	public JButton getBuyss3() {
		return buyss3;
	}

	public JButton getBuyhs3() {
		return buyhs3;
	}

	public JButton getBuysb3() {
		return buysb3;
	}

	public JButton getBuyhb3() {
		return buyhb3;
	}

	public JButton getBuyst3() {
		return buyst3;
	}

	public JButton getBuyss4() {
		return buyss4;
	}

	public JButton getBuyhs4() {
		return buyhs4;
	}

	public JButton getBuysb4() {
		return buysb4;
	}

	public JButton getBuyhb4() {
		return buyhb4;
	}

	public JButton getBuyst4() {
		return buyst4;
	}

	public void clearAll() {
		clear();
		arr = null;
		page.setText("- 0 -");
		nowIndex = 0;
		maxIndex = 0;
	}
	
	public void nextPage() {
		
		if(arr == null||nowIndex == maxIndex) return;
		
		nowIndex++;
		clear();
		for(int i=(nowIndex-1)*4, index = 1;i<arr.size()&&i<nowIndex*4;++i,++index) {
			add(index,arr.get(i));
		}
		page.setText("- " + nowIndex +" -");
	}
	
	public void prePage() {
		if(arr == null||nowIndex == 1) return;
		
		nowIndex--;
		clear();
		for(int i=(nowIndex-1)*4, index = 1;i<arr.size()&&i<nowIndex*4;++i,++index) {
			add(index,arr.get(i));
		}
		page.setText("- " + nowIndex +" -");
	}
	
	private void addAll() {
		
		add(city);
		add(time);
		add(line);
		add(goback);
		add(prePage);
		add(nextPage);
		add(page);
		
			add(buyss1);	add(name1);	add(ss1);
			add(buyhs1);	add(begin1);	add(hs1);
			add(buysb1);	add(end1);	add(sb1);
			add(buyhb1);	add(through1);	add(hb1);
			add(buyst1);					add(st1);
			add(detail1);	add(line1);
			
			add(buyss2);	add(name2);	add(ss2);
			add(buyhs2);	add(begin2);	add(hs2);
			add(buysb2);	add(end2);	add(sb2);
			add(buyhb2);	add(through2);	add(hb2);
			add(buyst2);					add(st2);
			add(detail2);	add(line2);
			
			add(buyss3);	add(name3);	add(ss3);
			add(buyhs3);	add(begin3);	add(hs3);
			add(buysb3);	add(end3);	add(sb3);
			add(buyhb3);	add(through3);	add(hb3);
			add(buyst3);					add(st3);
			add(detail3);	add(line3);
			
			add(buyss4);	add(name4);	add(ss4);
			add(buyhs4);	add(begin4);	add(hs4);
			add(buysb4);	add(end4);	add(sb4);
			add(buyhb4);	add(through4);	add(hb4);
			add(buyst4);					add(st4);
			add(detail4);	add(line4);
	}
	
	public void add(int x, Train train) {
		if(x == 1) {
			int y=100;

			name1.setText(train.getName());
			begin1.setText("发时：" + train.getBegin());
			end1.setText("到时：" + train.getEnd());
			through1.setText("历时：" + train.getThrough());
			
			ss1.setText("软座：" + train.getSoftSeat() + "张 " + train.getSoftSeatPrice() + "¥");
			hs1.setText("硬座：" + train.getHardSeat() + "张 " + train.getHardSeatPrice() + "¥");
			sb1.setText("软卧：" + train.getSoftBed() + "张 " + train.getSoftBedPrice() + "¥");
			hb1.setText("硬卧：" + train.getHardBed() + "张 " + train.getHardBedPrice() + "¥");
			st1.setText("站票：" + train.getStand() + "张 " + train.getStandPrice() + "¥");
			

			name1.setBounds(30,y ,100 ,25);
			begin1.setBounds(130, y, 100,25 );
			end1.setBounds(260,y, 100,25);
			through1.setBounds(390,y , 100,25 );
			
			ss1.setBounds(30,y+25,100 ,25 );	buyss1.setBounds(140,y+26,70 ,23 );
			hs1.setBounds(220, y+25, 100,25 );	buyhs1.setBounds(330, y+26, 70,23 );
			sb1.setBounds(30,y+50, 100,25);	buysb1.setBounds(140,y+51, 70,23);
			hb1.setBounds(220,y+50 , 100,25 );	buyhb1.setBounds(330,y+51 , 70,23 );
			st1.setBounds(30,y+75 , 100,25 );	buyst1.setBounds(140,y+76 , 70,23 );
			
			detail1.setBounds(280,y+76 , 120,23 );
			line1.setBounds(20, y+90, 480, 10);
			
		}else if (x == 2) {
			int y=200;
			
			name2.setText(train.getName());
			begin2.setText("发时：" + train.getBegin());
			end2.setText("到时：" + train.getEnd());
			through2.setText("历时：" + train.getThrough());
			
			ss2.setText("软座：" + train.getSoftSeat() + "张 " + train.getSoftSeatPrice() + "¥");
			hs2.setText("硬座：" + train.getHardSeat() + "张 " + train.getHardSeatPrice() + "¥");
			sb2.setText("软卧：" + train.getSoftBed() + "张 " + train.getSoftBedPrice() + "¥");
			hb2.setText("硬卧：" + train.getHardBed() + "张 " + train.getHardBedPrice() + "¥");
			st2.setText("站票：" + train.getStand() + "张 " + train.getStandPrice() + "¥");
			

			name2.setBounds(30,y ,100 ,25);
			begin2.setBounds(130, y, 100,25 );
			end2.setBounds(260,y, 100,25);
			through2.setBounds(390,y , 100,25 );
			
			ss2.setBounds(30,y+25,100 ,25 );	buyss2.setBounds(140,y+26,70 ,23 );
			hs2.setBounds(220, y+25, 100,25 );	buyhs2.setBounds(330, y+26, 70,23 );
			sb2.setBounds(30,y+50, 100,25);	buysb2.setBounds(140,y+51, 70,23);
			hb2.setBounds(220,y+50 , 100,25 );	buyhb2.setBounds(330,y+51 , 70,23 );
			st2.setBounds(30,y+75 , 100,25 );	buyst2.setBounds(140,y+76 , 70,23 );
			
			detail2.setBounds(280,y+76 , 120,23 );
			line2.setBounds(20, y+90, 480, 10);	
		}else if (x == 3) {
			int y=300;
			
			
			name3.setText(train.getName());
			begin3.setText("发时：" + train.getBegin());
			end3.setText("到时：" + train.getEnd());
			through3.setText("历时：" + train.getThrough());
			
			ss3.setText("软座：" + train.getSoftSeat() + "张 " + train.getSoftSeatPrice() + "¥");
			hs3.setText("硬座：" + train.getHardSeat() + "张 " + train.getHardSeatPrice() + "¥");
			sb3.setText("软卧：" + train.getSoftBed() + "张 " + train.getSoftBedPrice() + "¥");
			hb3.setText("硬卧：" + train.getHardBed() + "张 " + train.getHardBedPrice() + "¥");
			st3.setText("站票：" + train.getStand() + "张 " + train.getStandPrice() + "¥");
			

			name3.setBounds(30,y ,100 ,25);
			begin3.setBounds(130, y, 100,25 );
			end3.setBounds(260,y, 100,25);
			through3.setBounds(390,y , 100,25 );
			
			ss3.setBounds(30,y+25,100 ,25 );	buyss3.setBounds(140,y+26,70 ,23 );
			hs3.setBounds(220, y+25, 100,25 );	buyhs3.setBounds(330, y+26, 70,23 );
			sb3.setBounds(30,y+50, 100,25);	buysb3.setBounds(140,y+51, 70,23);
			hb3.setBounds(220,y+50 , 100,25 );	buyhb3.setBounds(330,y+51 , 70,23 );
			st3.setBounds(30,y+75 , 100,25 );	buyst3.setBounds(140,y+76 , 70,23 );
			
			detail3.setBounds(280,y+76 , 120,23 );
			line3.setBounds(20, y+90, 480, 10);
		}else if(x == 4) {
			int y=400;
			
			
			name4.setText(train.getName());
			begin4.setText("发时：" + train.getBegin());
			end4.setText("到时：" + train.getEnd());
			through4.setText("历时：" + train.getThrough());
			
			ss4.setText("软座：" + train.getSoftSeat() + "张 " + train.getSoftSeatPrice() + "¥");
			hs4.setText("硬座：" + train.getHardSeat() + "张 " + train.getHardSeatPrice() + "¥");
			sb4.setText("软卧：" + train.getSoftBed() + "张 " + train.getSoftBedPrice() + "¥");
			hb4.setText("硬卧：" + train.getHardBed() + "张 " + train.getHardBedPrice() + "¥");
			st4.setText("站票：" + train.getStand() + "张 " + train.getStandPrice() + "¥");
			

			name4.setBounds(30,y ,100 ,25);
			begin4.setBounds(130, y, 100,25 );
			end4.setBounds(260,y, 100,25);
			through4.setBounds(390,y , 100,25 );
			
			ss4.setBounds(30,y+25,100 ,25 );	buyss4.setBounds(140,y+26,70 ,23 );
			hs4.setBounds(220, y+25, 100,25 );	buyhs4.setBounds(330, y+26, 70,23 );
			sb4.setBounds(30,y+50, 100,25);	buysb4.setBounds(140,y+51, 70,23);
			hb4.setBounds(220,y+50 , 100,25 );	buyhb4.setBounds(330,y+51 , 70,23 );
			st4.setBounds(30,y+75 , 100,25 );	buyst4.setBounds(140,y+76 , 70,23 );
			
			detail4.setBounds(280,y+76 , 120,23 );
			line4.setBounds(20, y+90, 480, 10);
		}
	}
	
	private void clear() {
		//4
		buyss4.setBounds(1000, 1000, 0, 0);
		buyhs4.setBounds(1000, 1000, 0, 0);
		buysb4.setBounds(1000, 1000, 0, 0);
		buyhb4.setBounds(1000, 1000, 0, 0);
		buyst4.setBounds(1000, 1000, 0, 0);
		detail4.setBounds(1000, 1000, 0, 0);

		name4.setBounds(1000, 1000, 0, 0);
		begin4.setBounds(1000, 1000, 0, 0);
		end4.setBounds(1000, 1000, 0, 0);
		through4.setBounds(1000, 1000, 0, 0);
		line4.setBounds(1000, 1000, 0, 0);
		
		ss4.setBounds(1000, 1000, 0, 0);
		hs4.setBounds(1000, 1000, 0, 0);
		sb4.setBounds(1000, 1000, 0, 0);
		hb4.setBounds(1000, 1000, 0, 0);
		st4.setBounds(1000, 1000, 0, 0);
		
		//3
		buyss3.setBounds(1000, 1000, 0, 0);
		buyhs3.setBounds(1000, 1000, 0, 0);
		buysb3.setBounds(1000, 1000, 0, 0);
		buyhb3.setBounds(1000, 1000, 0, 0);
		buyst3.setBounds(1000, 1000, 0, 0);
		detail3.setBounds(1000, 1000, 0, 0);

		name3.setBounds(1000, 1000, 0, 0);
		begin3.setBounds(1000, 1000, 0, 0);
		end3.setBounds(1000, 1000, 0, 0);
		through3.setBounds(1000, 1000, 0, 0);
		line3.setBounds(1000, 1000, 0, 0);
		
		ss3.setBounds(1000, 1000, 0, 0);
		hs3.setBounds(1000, 1000, 0, 0);
		sb3.setBounds(1000, 1000, 0, 0);
		hb3.setBounds(1000, 1000, 0, 0);
		st3.setBounds(1000, 1000, 0, 0);
		
		//2
		buyss2.setBounds(1000, 1000, 0, 0);
		buyhs2.setBounds(1000, 1000, 0, 0);
		buysb2.setBounds(1000, 1000, 0, 0);
		buyhb2.setBounds(1000, 1000, 0, 0);
		buyst2.setBounds(1000, 1000, 0, 0);
		detail2.setBounds(1000, 1000, 0, 0);

		name2.setBounds(1000, 1000, 0, 0);
		begin2.setBounds(1000, 1000, 0, 0);
		end2.setBounds(1000, 1000, 0, 0);
		through2.setBounds(1000, 1000, 0, 0);
		line2.setBounds(1000, 1000, 0, 0);
		
		ss2.setBounds(1000, 1000, 0, 0);
		hs2.setBounds(1000, 1000, 0, 0);
		sb2.setBounds(1000, 1000, 0, 0);
		hb2.setBounds(1000, 1000, 0, 0);
		st2.setBounds(1000, 1000, 0, 0);
		
		//1
		buyss1.setBounds(1000, 1000, 0, 0);
		buyhs1.setBounds(1000, 1000, 0, 0);
		buysb1.setBounds(1000, 1000, 0, 0);
		buyhb1.setBounds(1000, 1000, 0, 0);
		buyst1.setBounds(1000, 1000, 0, 0);
		detail1.setBounds(1000, 1000, 0, 0);

		name1.setBounds(1000, 1000, 0, 0);
		begin1.setBounds(1000, 1000, 0, 0);
		end1.setBounds(1000, 1000, 0, 0);
		through1.setBounds(1000, 1000, 0, 0);
		line1.setBounds(1000, 1000, 0, 0);
		
		ss1.setBounds(1000, 1000, 0, 0);
		hs1.setBounds(1000, 1000, 0, 0);
		sb1.setBounds(1000, 1000, 0, 0);
		hb1.setBounds(1000, 1000, 0, 0);
		st1.setBounds(1000, 1000, 0, 0);
	}
	
	public JButton getGoback() {
		return goback;
	}
	
	public JButton getPrePage() {
		return prePage;
	}
	
	public JButton getNextPage() {
		return nextPage;
	}
	
	public Train canBuy(String str) {
		//1
		if("ss1".equals(str)) {
			return (arr.get((nowIndex-1)*4).getSoftSeat()>=1 ? arr.get((nowIndex-1)*4) : null);
		}else if("hs1".equals(str)) {
			return (arr.get((nowIndex-1)*4).getHardSeat()>=1 ? arr.get((nowIndex-1)*4) : null);
		}else if("sb1".equals(str)) {
			return (arr.get((nowIndex-1)*4).getSoftBed()>=1 ? arr.get((nowIndex-1)*4) : null);
		}else if("hb1".equals(str)) {
			return (arr.get((nowIndex-1)*4).getHardBed()>=1 ? arr.get((nowIndex-1)*4) : null);
		}else if("st1".equals(str)) {
			return (arr.get((nowIndex-1)*4).getStand()>=1 ? arr.get((nowIndex-1)*4) : null);
		}
		//2
		else if("ss2".equals(str)) {
			return (arr.get((nowIndex-1)*4+1).getSoftSeat()>=1 ? arr.get((nowIndex-1)*4+1) : null);
		}else if("hs2".equals(str)) {
			return (arr.get((nowIndex-1)*4+1).getHardSeat()>=1 ? arr.get((nowIndex-1)*4+1) : null);
		}else if("sb2".equals(str)) {
			return (arr.get((nowIndex-1)*4+1).getSoftBed()>=1 ? arr.get((nowIndex-1)*4+1) : null);
		}else if("hb2".equals(str)) {
			return (arr.get((nowIndex-1)*4+1).getHardBed()>=1 ? arr.get((nowIndex-1)*4+1) : null);
		}else if("st2".equals(str)) {
			return (arr.get((nowIndex-1)*4+1).getStand()>=1 ? arr.get((nowIndex-1)*4+1) : null);
		}
		//3
		else if("ss3".equals(str)) {
			return (arr.get((nowIndex-1)*4+2).getSoftSeat()>=1 ? arr.get((nowIndex-1)*4+2) : null);
		}else if("hs3".equals(str)) {
			return (arr.get((nowIndex-1)*4+2).getHardSeat()>=1 ? arr.get((nowIndex-1)*4+2) : null);
		}else if("sb3".equals(str)) {
			return (arr.get((nowIndex-1)*4+2).getSoftBed()>=1 ? arr.get((nowIndex-1)*4+2) : null);
		}else if("hb3".equals(str)) {
			return (arr.get((nowIndex-1)*4+2).getHardBed()>=1 ? arr.get((nowIndex-1)*4+2) : null);
		}else if("st3".equals(str)) {
			return (arr.get((nowIndex-1)*4+2).getStand()>=1 ? arr.get((nowIndex-1)*4+2) : null);
		}
		//4
		else if("ss4".equals(str)) {
			return (arr.get((nowIndex-1)*4+3).getSoftSeat()>=1 ? arr.get((nowIndex-1)*4+3) : null);
		}else if("hs4".equals(str)) {
			return (arr.get((nowIndex-1)*4+3).getHardSeat()>=1 ? arr.get((nowIndex-1)*4+3) : null);
		}else if("sb4".equals(str)) {
			return (arr.get((nowIndex-1)*4+3).getSoftBed()>=1 ? arr.get((nowIndex-1)*4+3) : null);
		}else if("hb4".equals(str)) {
			return (arr.get((nowIndex-1)*4+3).getHardBed()>=1 ? arr.get((nowIndex-1)*4+3) : null);
		}else if("st4".equals(str)) {
			return (arr.get((nowIndex-1)*4+3).getStand()>=1 ? arr.get((nowIndex-1)*4+3) : null);
		}
		return null;
	}
	
	public void numError() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("该票已售罄，请购买其他票。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	
	public void loginError() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("您还没有登录，请登录再购买。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("错误提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	
	public String getTime() {
		return this.time.getText();
	}
	
	public String getCity() {
		return this.city.getText();
	}
	
	/**************** 将指定Train的细节传回来 *******************************/
	public ArrayList<Detail> getTrainDetail(int x) {
		ArrayList<Detail> arr = new ArrayList<>();
		Train train = this.arr.get((nowIndex-1)*4 + x);
		String checi = train.getName();
		/*
		 * do it
		 */
		
		//test
		for(int i =0;i<18;++i)
			arr.add(new Detail(1,"济南站","8:30","08:45","15分钟"));
		
		return arr;
	}
	

	
}
