import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMyorder extends JPanel {
	
	private JLabel title = new JLabel("我的订单：");
	private JLabel line = new JLabel("--------------------------------------------------------");
	
	//1
	private JLabel name1 = new JLabel("车次：8082");
	private JLabel time1 = new JLabel("2017/06/21");
	private JLabel begin1 = new JLabel("发时：08:30");
	private JLabel end1 = new JLabel("到时：11:30");
	private JLabel through1 = new JLabel("历时：3小时");
	private JLabel city1 = new JLabel("出发地-->目的地");
	private JLabel seatANDprice1 = new JLabel("软座：30¥");
	private JLabel idname1 = new JLabel("姓名：王XX");
	private JLabel idnum1 = new JLabel("身份证号：XXXX453266");
	private JButton refund1 = new JButton("退票");
	private JLabel line1 = new JLabel("--------------------------------------------------------");
	//2
	private JLabel name2 = new JLabel("车次：8082");
	private JLabel time2 = new JLabel("2017/06/21");
	private JLabel begin2 = new JLabel("发时：08:30");
	private JLabel end2 = new JLabel("到时：11:30");
	private JLabel through2 = new JLabel("历时：3小时");
	private JLabel city2 = new JLabel("出发地-->目的地");
	private JLabel seatANDprice2 = new JLabel("软座：30¥");
	private JLabel idname2 = new JLabel("姓名：王XX");
	private JLabel idnum2 = new JLabel("身份证号：XXXX453266");
	private JButton refund2 = new JButton("退票");
	private JLabel line2 = new JLabel("--------------------------------------------------------");
	//3
	private JLabel name3 = new JLabel("车次：8082");
	private JLabel time3 = new JLabel("2017/06/21");
	private JLabel begin3 = new JLabel("发时：08:30");
	private JLabel end3 = new JLabel("到时：11:30");
	private JLabel through3 = new JLabel("历时：3小时");
	private JLabel city3 = new JLabel("出发地-->目的地");
	private JLabel seatANDprice3 = new JLabel("软座：30¥");
	private JLabel idname3 = new JLabel("姓名：王XX");
	private JLabel idnum3 = new JLabel("身份证号：XXXX453266");
	private JButton refund3 = new JButton("退票");
	private JLabel line3 = new JLabel("--------------------------------------------------------");
	//4
	private JLabel name4 = new JLabel("车次：8082");
	private JLabel time4 = new JLabel("2017/06/21");
	private JLabel begin4 = new JLabel("发时：08:30");
	private JLabel end4 = new JLabel("到时：11:30");
	private JLabel through4 = new JLabel("历时：3小时");
	private JLabel city4 = new JLabel("出发地-->目的地");
	private JLabel seatANDprice4 = new JLabel("软座：30¥");
	private JLabel idname4 = new JLabel("姓名：王XX");
	private JLabel idnum4 = new JLabel("身份证号：XXXX453266");
	private JButton refund4 = new JButton("退票");
	private JLabel line4 = new JLabel("--------------------------------------------------------");
	
	private JButton goback = new JButton("返回");
	private JButton prePage = new JButton("上一页");
	private JButton nextPage = new JButton("下一页");
	private JLabel page = new JLabel("- 0 -");
	int nowIndex = 0;
	int maxIndex = 0;
	
	ArrayList<Ticket> arr = null;
	
	
	
	public JButton getRefund1() {
		return refund1;
	}

	public JButton getRefund2() {
		return refund2;
	}

	public JButton getRefund3() {
		return refund3;
	}

	public JButton getRefund4() {
		return refund4;
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

	private void addAll() {
		add(title);
		title.setBounds(30, 10, 500, 35);
		title.setFont(new java.awt.Font("Dialog",   1,   15));
		
		add(goback);
		add(prePage);
		add(page);
		add(nextPage);
		add(line);
		goback.setBounds(375, 555, 100, 40);
		prePage.setBounds(20, 555, 100, 40);
		page.setBounds(170, 555, 50, 40);
		nextPage.setBounds(250, 555, 100, 40);
		line.setBounds(20, 45, 480, 5);

		int y=50;
		//1
		y = y + 0;
		add(name1);	add(city1);	add(time1);	add(begin1);	add(end1);	add(through1);	add(seatANDprice1);	
		add(idname1);	add(idnum1);	 add(refund1);		add(line1);
		
		//2
		y = y + 125;
		add(name2);	add(city2);	add(time2);	add(begin2);	add(end2);	add(through2);	add(seatANDprice2);	
		add(idname2);	add(idnum2);	 add(refund2);add(line2);

		//3
		y = y + 125;
		add(name3);	add(city3);	add(time3);	add(begin3);	add(end3);	add(through3);	add(seatANDprice3);	
		add(idname3);	add(idnum3);	 add(refund3);		add(line3);

		//4
		y = y + 125;
		add(name4);	add(city4);	add(time4);	add(begin4);	add(end4);	add(through4);	add(seatANDprice4);	
		add(idname4);	add(idnum4);	 add(refund4);	add(line4);
	
	}

	private void clear() {
		int y =1000;
		name1.setBounds(40, y, 500, 30);
		city1.setBounds(180, y, 500, 30);
		time1.setBounds(340, y, 500, 30);
		begin1.setBounds(40, y+30, 500, 30);
		end1.setBounds(180, y+30, 500, 30);
		through1.setBounds(340, y+30, 500, 30);
		
		idname1.setBounds(40, y+60, 500, 30);
		idnum1.setBounds(180, y+60, 500, 30);
		
		seatANDprice1.setBounds(40, y+90, 500, 30);
		refund1.setBounds(180, y+90, 100, 30);
		line1.setBounds(20, y+120, 500, 5);
		
		name2.setBounds(40, y, 500, 30);
		city2.setBounds(180, y, 500, 30);
		time2.setBounds(340, y, 500, 30);
		begin2.setBounds(40, y+30, 500, 30);
		end2.setBounds(180, y+30, 500, 30);
		through2.setBounds(340, y+30, 500, 30);
		
		idname2.setBounds(40, y+60, 500, 30);
		idnum2.setBounds(180, y+60, 500, 30);
		
		seatANDprice2.setBounds(40, y+90, 500, 30);
		refund2.setBounds(180, y+90, 100, 30);
		line2.setBounds(20, y+120, 500, 5);
		
		name3.setBounds(40, y, 500, 30);
		city3.setBounds(180, y, 500, 30);
		time3.setBounds(340, y, 500, 30);
		begin3.setBounds(40, y+30, 500, 30);
		end3.setBounds(180, y+30, 500, 30);
		through3.setBounds(340, y+30, 500, 30);
		
		idname3.setBounds(40, y+60, 500, 30);
		idnum3.setBounds(180, y+60, 500, 30);
		
		seatANDprice3.setBounds(40, y+90, 500, 30);
		refund3.setBounds(180, y+90, 100, 30);
		line3.setBounds(20, y+120, 500, 5);
		
		name4.setBounds(40, y, 500, 30);
		city4.setBounds(180, y, 500, 30);
		time4.setBounds(340, y, 500, 30);
		begin4.setBounds(40, y+30, 500, 30);
		end4.setBounds(180, y+30, 500, 30);
		through4.setBounds(340, y+30, 500, 30);
		
		idname4.setBounds(40, y+60, 500, 30);
		idnum4.setBounds(180, y+60, 500, 30);
		
		seatANDprice4.setBounds(40, y+90, 500, 30);
		refund4.setBounds(180, y+90, 100, 30);
		line4.setBounds(20, y+120, 500, 5);
		
	}

	private void add(int x,Ticket ticket) {
		int y = 50 + 125*(x-1);
		if(x == 1) {
			name1.setBounds(40, y, 500, 30);
			city1.setBounds(180, y, 500, 30);
			time1.setBounds(340, y, 500, 30);
			begin1.setBounds(40, y+30, 500, 30);
			end1.setBounds(180, y+30, 500, 30);
			through1.setBounds(340, y+30, 500, 30);
			
			idname1.setBounds(40, y+60, 500, 30);
			idnum1.setBounds(180, y+60, 500, 30);
			
			seatANDprice1.setBounds(40, y+90, 500, 30);
			refund1.setBounds(340, y+90, 100, 30);
			line1.setBounds(20, y+120, 500, 5);
			name1.setText("车次：" + ticket.getName());
			city1.setText(ticket.getCity());
			time1.setText(ticket.getTime());
			begin1.setText("发时：" + ticket.getBegin());
			end1.setText("到时：" + ticket.getEnd());
			through1.setText("历时：" + ticket.getThrough());
			idname1.setText("姓名：" + ticket.getId().getName());
			idnum1.setText("身份证号：" + ticket.getId().getNum());
			seatANDprice1.setText(ticket.getSeatANDprice());
		}else if(x == 2) {
			name2.setBounds(40, y, 500, 30);
			city2.setBounds(180, y, 500, 30);
			time2.setBounds(340, y, 500, 30);
			begin2.setBounds(40, y+30, 500, 30);
			end2.setBounds(180, y+30, 500, 30);
			through2.setBounds(340, y+30, 500, 30);
			
			idname2.setBounds(40, y+60, 500, 30);
			idnum2.setBounds(180, y+60, 500, 30);
			
			seatANDprice2.setBounds(40, y+90, 500, 30);
			refund2.setBounds(340, y+90, 100, 30);
			line2.setBounds(20, y+120, 500, 5);
			name2.setText("车次：" + ticket.getName());
			city2.setText(ticket.getCity());
			time2.setText(ticket.getTime());
			begin2.setText("发时：" + ticket.getBegin());
			end2.setText("到时：" + ticket.getEnd());
			through2.setText("历时：" + ticket.getThrough());
			idname2.setText("姓名：" + ticket.getId().getName());
			idnum2.setText("身份证号：" + ticket.getId().getNum());
			seatANDprice2.setText(ticket.getSeatANDprice());
		}else if(x == 3) {
			name3.setBounds(40, y, 500, 30);
			city3.setBounds(180, y, 500, 30);
			time3.setBounds(340, y, 500, 30);
			begin3.setBounds(40, y+30, 500, 30);
			end3.setBounds(180, y+30, 500, 30);
			through3.setBounds(340, y+30, 500, 30);
			
			idname3.setBounds(40, y+60, 500, 30);
			idnum3.setBounds(180, y+60, 500, 30);
			
			seatANDprice3.setBounds(40, y+90, 500, 30);
			refund3.setBounds(340, y+90, 100, 30);
			line3.setBounds(20, y+120, 500, 5);
			name3.setText("车次：" + ticket.getName());
			city3.setText(ticket.getCity());
			time3.setText(ticket.getTime());
			begin3.setText("发时：" + ticket.getBegin());
			end3.setText("到时：" + ticket.getEnd());
			through3.setText("历时：" + ticket.getThrough());
			idname3.setText("姓名：" + ticket.getId().getName());
			idnum3.setText("身份证号：" + ticket.getId().getNum());
			seatANDprice3.setText(ticket.getSeatANDprice());
		}else if(x == 4) {
			name4.setBounds(40, y, 500, 30);
			city4.setBounds(180, y, 500, 30);
			time4.setBounds(340, y, 500, 30);
			begin4.setBounds(40, y+30, 500, 30);
			end4.setBounds(180, y+30, 500, 30);
			through4.setBounds(340, y+30, 500, 30);
			
			idname4.setBounds(40, y+60, 500, 30);
			idnum4.setBounds(180, y+60, 500, 30);
			
			seatANDprice4.setBounds(40, y+90, 500, 30);
			refund4.setBounds(340, y+90, 100, 30);
			line4.setBounds(20, y+120, 500, 5);
			name4.setText("车次：" + ticket.getName());
			city4.setText(ticket.getCity());
			time4.setText(ticket.getTime());
			begin4.setText("发时：" + ticket.getBegin());
			end4.setText("到时：" + ticket.getEnd());
			through4.setText("历时：" + ticket.getThrough());
			idname4.setText("姓名：" + ticket.getId().getName());
			idnum4.setText("身份证号：" + ticket.getId().getNum());
			seatANDprice4.setText(ticket.getSeatANDprice());
		}
		
	}
	
	public PanelMyorder(){
		addAll();
		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	public void setTicketArr(ArrayList<Ticket> arr) {
		this.arr = arr;
		maxIndex = arr.size()/4 + (arr.size()%4==0 ? 0 : 1);
		nextPage();
	}
	
	public void clearAll() {
		clear();
		arr = null;
		page.setText("- 0 -");
		nowIndex = 0;
		maxIndex = 0;
		
	}
	
	public void nextPage() {
		if(arr == null || nowIndex >= maxIndex) return;
		
		nowIndex++;
		clear();
		for(int i=(nowIndex-1)*4, index = 1;i<arr.size()&&i<nowIndex*4;++i,++index) {
			add(index,arr.get(i));
		}
		page.setText("- " + nowIndex +" -");
	}
	
	public void prePage() {
		if(arr == null || nowIndex <= 1) return;
		
		nowIndex--;
		clear();
		for(int i=(nowIndex-1)*4, index = 1;i<arr.size()&&i<nowIndex*4;++i,++index) {
			add(index,arr.get(i));
		}
		page.setText("- " + nowIndex +" -");
	}
	
	public void refund(int x,String ID) {
		clear();
		refund(arr.remove((nowIndex-1)*4+(x-1)), ID);
		maxIndex = arr.size()/4 + (arr.size()%4==0 ? 0 : 1);
		nowIndex = 0;
		page.setText("- 0 -");
		nextPage();
		alert();
	}
	
	public void alert() {
		JDialog dia = new JDialog();
		dia.setLayout(new FlowLayout());
		JLabel text = new JLabel("退票成功。");
		dia.add(text);
		
		dia.setVisible(true);
		dia.setTitle("操作提示");
        dia.setSize(400,100);
        dia.setLocation(500,300);
	}
	
	/***********************/
	//处理退票
	private void refund(Ticket ticket,String ID) {
		//do it
	}


}
