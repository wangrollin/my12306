import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMyids extends JPanel {
	
	private JLabel title = new JLabel("我的身份：");
	private JLabel line1 = new JLabel("--------------------------------------------------------");
	private JLabel line2 = new JLabel("--------------------------------------------------------");
	private JLabel line3 = new JLabel("--------------------------------------------------------");
	private JLabel line4 = new JLabel("--------------------------------------------------------");
	private JLabel line5 = new JLabel("--------------------------------------------------------");
	private JLabel line6 = new JLabel("--------------------------------------------------------");
	private JLabel name1 = new JLabel("姓名：王XX");
	private JLabel name2 = new JLabel("姓名：王XX");
	private JLabel name3 = new JLabel("姓名：王XX");
	private JLabel name4 = new JLabel("姓名：王XX");
	private JLabel name5 = new JLabel("姓名：王XX");
	private JLabel num1 = new JLabel("身份证号：XXXX24455");
	private JLabel num2 = new JLabel("身份证号：XXXX24455");
	private JLabel num3 = new JLabel("身份证号：XXXX24455");
	private JLabel num4 = new JLabel("身份证号：XXXX24455");
	private JLabel num5 = new JLabel("身份证号：XXXX24455");
	private JLabel num6 = new JLabel("身份证号：XXXX24455");
	
	private JButton add1 = new JButton("添加新身份");
	private JButton add2 = new JButton("添加新身份");
	private JButton add3 = new JButton("添加新身份");
	private JButton add4 = new JButton("添加新身份");
	private JButton add5 = new JButton("添加新身份");
	private JButton remove1 = new JButton("删除该身份");
	private JButton remove2 = new JButton("删除该身份");
	private JButton remove3 = new JButton("删除该身份");
	private JButton remove4 = new JButton("删除该身份");
	private JButton remove5 = new JButton("删除该身份");
	
	private JButton goback = new JButton("返回");
	
	
	ArrayList<Identity> arr = new ArrayList<>();
	private String ID = null;
	private int cnt = 0;
	private final int max = 5;
	
	
	
	public JButton getAdd1() {
		return add1;
	}

	public JButton getAdd2() {
		return add2;
	}

	public JButton getAdd3() {
		return add3;
	}

	public JButton getAdd4() {
		return add4;
	}

	public JButton getAdd5() {
		return add5;
	}

	public JButton getRemove1() {
		return remove1;
	}

	public JButton getRemove2() {
		return remove2;
	}

	public JButton getRemove3() {
		return remove3;
	}

	public JButton getRemove4() {
		return remove4;
	}

	public JButton getRemove5() {
		return remove5;
	}

	public JButton getGoback() {
		return goback;
	}

	private void addAll() {
		add(title);
		title.setBounds(30, 10, 500, 35);
		title.setFont(new java.awt.Font("Dialog",   1,   15));
		
		add(line1); 
		add(line2); 
		add(line3); 
		add(line4); 
		add(line5); 
		add(line6); 
		add(name1); 
		add(name2); 
		add(name3); 
		add(name4); 
		add(name5); 
		add(num1); 
		add(num2); 
		add(num3); 
		add(num4); 
		add(num5); 
		add(add1); 
		add(add2); 
		add(add3); 
		add(add4); 
		add(add5); 
		add(remove1); 
		add(remove2); 
		add(remove3); 
		add(remove4); 
		add(remove5); 
		add(goback);
		
		line1.setBounds(30, 45, 500, 5);
		line2.setBounds(30, 145, 500, 5);
		line3.setBounds(30, 245, 500, 5);
		line4.setBounds(30, 345, 500, 5);
		line5.setBounds(30, 445, 500, 5);
		line6.setBounds(30, 545, 500, 5);
		
		goback.setBounds(150, 550, 200, 50);
		
	}
	
	private void add0(int x) {
		int y = (x-1)*100;
		if(x == 1) {
			add1.setBounds(330, y + 60, 100, 80);
		}else if(x == 2) {
			add2.setBounds(330, y + 60, 100, 80);
		}else if(x == 3) {
			add3.setBounds(330, y + 60, 100, 80);
		}else if(x == 4) {
			add4.setBounds(330, y + 60, 100, 80);
		}else if(x == 5) {
			add5.setBounds(330, y + 60, 100, 80);
		}
	}
	
	private void add1(int x,Identity id) {
		int y = (x-1)*100;
		if(x == 1) {
			name1.setText("姓名：" + id.getName());
			num1.setText("身份证号：" + id.getNum());
			name1.setBounds(70, y + 60, 500, 40);
			num1.setBounds(70, y + 100, 500, 40);
			remove1.setBounds(330, y + 60, 100, 80);
		}else if(x == 2) {
			name2.setText("姓名：" + id.getName());
			num2.setText("身份证号：" + id.getNum());
			name2.setBounds(70, y + 60, 500, 40);
			num2.setBounds(70, y + 100, 500, 40);
			remove2.setBounds(330, y + 60, 100, 80);
		}else if(x == 3) {
			name3.setText("姓名：" + id.getName());
			num3.setText("身份证号：" + id.getNum());
			name3.setBounds(70, y + 60, 500, 40);
			num3.setBounds(70, y + 100, 500, 40);
			remove3.setBounds(330, y + 60, 100, 80);
		}else if(x == 4) {
			name4.setText("姓名：" + id.getName());
			num4.setText("身份证号：" + id.getNum());
			name4.setBounds(70,y +  60, 500, 40);
			num4.setBounds(70, y + 100, 500, 40);
			remove4.setBounds(330,y +  60, 100, 80);
		}else if(x == 5) {
			name5.setText("姓名：" + id.getName());
			num5.setText("身份证号：" + id.getNum());
			name5.setBounds(70, y + 60, 500, 40);
			num5.setBounds(70,y +  100, 500, 40);
			remove5.setBounds(330,y + 60, 100, 80);
		}
	}
	
	private void clear() {
		int y=1000;
		//1
		name1.setBounds(70, y + 60, 500, 40);
		num1.setBounds(70, y + 100, 500, 40);
		remove1.setBounds(330, y + 60, 100, 80);
		add1.setBounds(330, y + 60, 100, 80);
		//2
		name2.setBounds(70, y + 60, 500, 40);
		num2.setBounds(70, y + 100, 500, 40);
		remove2.setBounds(330, y + 60, 100, 80);
		add2.setBounds(330, y + 60, 100, 80);
		//3
		name3.setBounds(70, y + 60, 500, 40);
		num3.setBounds(70, y + 100, 500, 40);
		remove3.setBounds(330, y + 60, 100, 80);
		add3.setBounds(330, y + 60, 100, 80);
		//4
		name4.setBounds(70, y + 60, 500, 40);
		num4.setBounds(70, y + 100, 500, 40);
		remove4.setBounds(330, y + 60, 100, 80);
		add4.setBounds(330, y + 60, 100, 80);
		//5
		name5.setBounds(70, y + 60, 500, 40);
		num5.setBounds(70, y + 100, 500, 40);
		remove5.setBounds(330, y + 60, 100, 80);
		add5.setBounds(330, y + 60, 100, 80);
	}

	public PanelMyids(){
		addAll();

		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
	}
	
	public void clearAll() {
		clear();
		this.arr = null;
		ID = null;
		cnt = 0;
	}
	
	public void setIdArray(ArrayList<Identity> arr, String ID) {
		this.arr = arr;
		this.ID = ID;
		cnt = arr.size();
		if(cnt >5) {
			System.out.println("Bug in PanelMydis: 身份超过了五个。");
		}
		showids();
	}
	
	private void showids() {
		int i;
		for(i = 0; i < cnt ; ++i) {
			add1(i,arr.get(i));
		}
		for( ;i<=5;++i) {
			add0(i);
		}
	}
	
	public void removeid(int x) {
		removeid(arr.remove(x),ID);
		clear();
		cnt--;
		showids();
	}

	/**************************/
	//删掉这个人的这个身份
	private void removeid(Identity id,String ID) {
		/*
		 * do it
		 */
	}
}








