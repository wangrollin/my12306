import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDetails extends JPanel {
	private JLabel index = new JLabel("站序");
	private JLabel station = new JLabel("站名");
	private JLabel come = new JLabel("到时");
	private JLabel go = new JLabel("发时");
	private JLabel stay = new JLabel("停留");
	private JLabel line = new JLabel("------------------------------------------------------");
	
	//1
	private JLabel index1 = new JLabel("1");
	private JLabel station1 = new JLabel("站名");
	private JLabel come1 = new JLabel("到时");
	private JLabel go1 = new JLabel("发时");
	private JLabel stay1 = new JLabel("停留");
	private JLabel line1 = new JLabel("------------------------------------------------------");
	//2
	private JLabel index2 = new JLabel("2");
	private JLabel station2 = new JLabel("站名");
	private JLabel come2 = new JLabel("到时");
	private JLabel go2 = new JLabel("发时");
	private JLabel stay2 = new JLabel("停留");
	private JLabel line2 = new JLabel("------------------------------------------------------");
	//3
	private JLabel index3 = new JLabel("3");
	private JLabel station3 = new JLabel("站名");
	private JLabel come3 = new JLabel("到时");
	private JLabel go3 = new JLabel("发时");
	private JLabel stay3 = new JLabel("停留");
	private JLabel line3 = new JLabel("------------------------------------------------------");
	//4
	private JLabel index4 = new JLabel("4");
	private JLabel station4 = new JLabel("站名");
	private JLabel come4 = new JLabel("到时");
	private JLabel go4 = new JLabel("发时");
	private JLabel stay4 = new JLabel("停留");
	private JLabel line4 = new JLabel("------------------------------------------------------");
	//5
	private JLabel index5 = new JLabel("5");
	private JLabel station5 = new JLabel("站名");
	private JLabel come5 = new JLabel("到时");
	private JLabel go5 = new JLabel("发时");
	private JLabel stay5 = new JLabel("停留");
	private JLabel line5 = new JLabel("------------------------------------------------------");
	//6
	private JLabel index6 = new JLabel("6");
	private JLabel station6 = new JLabel("站名");
	private JLabel come6 = new JLabel("到时");
	private JLabel go6 = new JLabel("发时");
	private JLabel stay6 = new JLabel("停留");
	private JLabel line6 = new JLabel("------------------------------------------------------");
	//7
	private JLabel index7 = new JLabel("7");
	private JLabel station7 = new JLabel("站名");
	private JLabel come7 = new JLabel("到时");
	private JLabel go7 = new JLabel("发时");
	private JLabel stay7 = new JLabel("停留");
	private JLabel line7 = new JLabel("------------------------------------------------------");
	//8
	private JLabel index8 = new JLabel("8");
	private JLabel station8 = new JLabel("站名");
	private JLabel come8 = new JLabel("到时");
	private JLabel go8 = new JLabel("发时");
	private JLabel stay8 = new JLabel("停留");
	private JLabel line8 = new JLabel("------------------------------------------------------");
	//9
	private JLabel index9 = new JLabel("9");
	private JLabel station9 = new JLabel("站名");
	private JLabel come9 = new JLabel("到时");
	private JLabel go9 = new JLabel("发时");
	private JLabel stay9 = new JLabel("停留");
	private JLabel line9 = new JLabel("------------------------------------------------------");
	//10
	private JLabel index10 = new JLabel("10");
	private JLabel station10 = new JLabel("站名");
	private JLabel come10 = new JLabel("到时");
	private JLabel go10 = new JLabel("发时");
	private JLabel stay10 = new JLabel("停留");
	private JLabel line10 = new JLabel("------------------------------------------------------");
	//11
	private JLabel index11 = new JLabel("11");
	private JLabel station11 = new JLabel("站名");
	private JLabel come11 = new JLabel("到时");
	private JLabel go11 = new JLabel("发时");
	private JLabel stay11 = new JLabel("停留");
	private JLabel line11 = new JLabel("------------------------------------------------------");
	//12
	private JLabel index12 = new JLabel("12");
	private JLabel station12 = new JLabel("站名");
	private JLabel come12 = new JLabel("到时");
	private JLabel go12 = new JLabel("发时");
	private JLabel stay12 = new JLabel("停留");
	private JLabel line12 = new JLabel("------------------------------------------------------");
	//13
	private JLabel index13 = new JLabel("13");
	private JLabel station13 = new JLabel("站名");
	private JLabel come13 = new JLabel("到时");
	private JLabel go13 = new JLabel("发时");
	private JLabel stay13 = new JLabel("停留");
	private JLabel line13 = new JLabel("------------------------------------------------------");
	//14
	private JLabel index14 = new JLabel("14");
	private JLabel station14 = new JLabel("站名");
	private JLabel come14 = new JLabel("到时");
	private JLabel go14 = new JLabel("发时");
	private JLabel stay14 = new JLabel("停留");
	private JLabel line14 = new JLabel("------------------------------------------------------");
	//15
	private JLabel index15 = new JLabel("15");
	private JLabel station15 = new JLabel("站名");
	private JLabel come15 = new JLabel("到时");
	private JLabel go15 = new JLabel("发时");
	private JLabel stay15 = new JLabel("停留");
	private JLabel line15 = new JLabel("------------------------------------------------------");
	//16
	private JLabel index16 = new JLabel("16");
	private JLabel station16 = new JLabel("站名");
	private JLabel come16 = new JLabel("到时");
	private JLabel go16 = new JLabel("发时");
	private JLabel stay16 = new JLabel("停留");
	private JLabel line16 = new JLabel("------------------------------------------------------");
	
	
	private JButton goback = new JButton("返回");
	private JButton prePage = new JButton("上一页");
	private JButton nextPage = new JButton("下一页");
	
	public JButton getGoback() {
		return goback;
	}

	public JButton getPrePage() {
		return prePage;
	}

	public JButton getNextPage() {
		return nextPage;
	}

	private JLabel pageNum = new JLabel("- 0 -");
	private int page = 0;
	private int nowPage = 0;
	private int maxPage = 0;
	
	ArrayList<Detail> arr = null;
	
	private void addAll() {
		add(index);		add(index1);	add(index2);	add(index3);	add(index4);	add(index5);	add(index6);	add(index7);	add(index8);	add(index9);	add(index10);
						add(index11);	add(index12);	add(index13);	add(index14);	add(index15);	add(index16);
		add(station);	add(station1);	add(station2);	add(station3);	add(station4);	add(station5);	add(station6);	add(station7);	add(station8);	add(station9);	add(station10);
						add(station11);	add(station12);	add(station13);	add(station14);	add(station15);	add(station16);
		add(come);		add(come1);	add(come2);	add(come3);	add(come4);	add(come5);	add(come6);	add(come7);	add(come8);	add(come9);	add(come10);
						add(come11);	add(come12);	add(come13);	add(come14);	add(come15);	add(come16);	
		add(go);		add(go1);	add(go2);	add(go3);	add(go4);	add(go5);	add(go6);	add(go7);	add(go8);	add(go9);	add(go10);
						add(go11);	add(go12);	add(go13);	add(go14);	add(go15);	add(go16);
		add(stay);		add(stay1);	add(stay2);	add(stay3);	add(stay4);	add(stay5);	add(stay6);	add(stay7);	add(stay8);	add(stay9);	add(stay10);
						add(stay11);	add(stay12);	add(stay13);	add(stay14);	add(stay15);	add(stay16);
		add(line);		add(line1);	add(line2);	add(line3);	add(line4);	add(line5);	add(line6);	add(line7);	add(line8);	add(line9);	add(line10);
						add(line11);	add(line12);	add(line13);	add(line14);	add(line15);	add(line16);
		index.setBounds(20,10,80,35);
		station.setBounds(120,10,80,35);
		come.setBounds(220,10,80,35);
		go.setBounds(320,10,80,35);
		stay.setBounds(420,10,80,35);
		line.setBounds(20, 45, 500, 5);
		
		add(pageNum);
		add(prePage);
		add(nextPage);
		add(goback); 	
					
		goback.setBounds(375, 545, 100, 40);
		prePage.setBounds(20, 545, 100, 40);
		pageNum.setBounds(170, 545, 50, 40);
		nextPage.setBounds(250, 545, 100, 40);
	}
	
	private void add(int x,Detail d) {
		int y = 50 + (x-1)*30;
		String str = "" + ((nowPage-1)*16+x);
		if(x == 1){
			index1.setText(str);
			index1.setBounds(20,y,80,25);
			station1.setBounds(120,y,80,25);
			come1.setBounds(220,y,80,25);
			go1.setBounds(320,y,80,25);
			stay1.setBounds(420,y,80,25);
			line1.setBounds(20, y+25, 500, 5);
		}else if(x == 2) {
			index2.setText(str);
			index2.setBounds(20,y,80,25);
			station2.setBounds(120,y,80,25);
			come2.setBounds(220,y,80,25);
			go2.setBounds(320,y,80,25);
			stay2.setBounds(420,y,80,25);
			line2.setBounds(20, y+25, 500, 5);
		}else if(x == 3) {
			index3.setText(str);
			index3.setBounds(20,y,80,25);
			station3.setBounds(120,y,80,25);
			come3.setBounds(220,y,80,25);
			go3.setBounds(320,y,80,25);
			stay3.setBounds(420,y,80,25);
			line3.setBounds(20, y+25, 500, 5);
		}else if(x == 4) {
			index4.setText(str);
			index4.setBounds(20,y,80,25);
			station4.setBounds(120,y,80,25);
			come4.setBounds(220,y,80,25);
			go4.setBounds(320,y,80,25);
			stay4.setBounds(420,y,80,25);
			line4.setBounds(20, y+25, 500, 5);
		}else if(x == 5) {
			index5.setText(str);
			index5.setBounds(20,y,80,25);
			station5.setBounds(120,y,80,25);
			come5.setBounds(220,y,80,25);
			go5.setBounds(320,y,80,25);
			stay5.setBounds(420,y,80,25);
			line5.setBounds(20, y+25, 500, 5);
		}else if(x == 6) {
			index6.setText(str);
			index6.setBounds(20,y,80,25);
			station6.setBounds(120,y,80,25);
			come6.setBounds(220,y,80,25);
			go6.setBounds(320,y,80,25);
			stay6.setBounds(420,y,80,25);
			line6.setBounds(20, y+25, 500, 5);
		}else if(x == 7) {
			index7.setText(str);
			index7.setBounds(20,y,80,25);
			station7.setBounds(120,y,80,25);
			come7.setBounds(220,y,80,25);
			go7.setBounds(320,y,80,25);
			stay7.setBounds(420,y,80,25);
			line7.setBounds(20, y+25, 500, 5);
		}else if(x == 8) {
			index8.setText(str);
			index8.setBounds(20,y,80,25);
			station8.setBounds(120,y,80,25);
			come8.setBounds(220,y,80,25);
			go8.setBounds(320,y,80,25);
			stay8.setBounds(420,y,80,25);
			line8.setBounds(20, y+25, 500, 5);
		}else if(x == 9) {
			index9.setText(str);
			index9.setBounds(20,y,80,25);
			station9.setBounds(120,y,80,25);
			come9.setBounds(220,y,80,25);
			go9.setBounds(320,y,80,25);
			stay9.setBounds(420,y,80,25);
			line9.setBounds(20, y+25, 500, 5);
		}else if(x == 10) {
			index10.setText(str);
			index10.setBounds(20,y,80,25);
			station10.setBounds(120,y,80,25);
			come10.setBounds(220,y,80,25);
			go10.setBounds(320,y,80,25);
			stay10.setBounds(420,y,80,25);
			line10.setBounds(20, y+25, 500, 5);
		}else if(x == 11) {
			index11.setText(str);
			index11.setBounds(20,y,80,25);
			station11.setBounds(120,y,80,25);
			come11.setBounds(220,y,80,25);
			go11.setBounds(320,y,80,25);
			stay11.setBounds(420,y,80,25);
			line11.setBounds(20, y+25, 500, 5);
		}else if(x == 12) {
			index12.setText(str);
			index12.setBounds(20,y,80,25);
			station12.setBounds(120,y,80,25);
			come12.setBounds(220,y,80,25);
			go12.setBounds(320,y,80,25);
			stay12.setBounds(420,y,80,25);
			line12.setBounds(20, y+25, 500, 5);
		}else if(x == 13) {
			index13.setText(str);
			index13.setBounds(20,y,80,25);
			station13.setBounds(120,y,80,25);
			come13.setBounds(220,y,80,25);
			go13.setBounds(320,y,80,25);
			stay13.setBounds(420,y,80,25);
			line13.setBounds(20, y+25, 500, 5);
		}else if(x == 14) {
			index14.setText(str);
			index14.setBounds(20,y,80,25);
			station14.setBounds(120,y,80,25);
			come14.setBounds(220,y,80,25);
			go14.setBounds(320,y,80,25);
			stay14.setBounds(420,y,80,25);
			line14.setBounds(20, y+25, 500, 5);
		}else if(x == 15) {
			index15.setText(str);
			index15.setBounds(20,y,80,25);
			station15.setBounds(120,y,80,25);
			come15.setBounds(220,y,80,25);
			go15.setBounds(320,y,80,25);
			stay15.setBounds(420,y,80,25);
			line15.setBounds(20, y+25, 500, 5);
		}else if(x == 16) {
			index16.setText(str);
			index16.setBounds(20,y,80,25);
			station16.setBounds(120,y,80,25);
			come16.setBounds(220,y,80,25);
			go16.setBounds(320,y,80,25);
			stay16.setBounds(420,y,80,25);
			line16.setBounds(20, y+25, 500, 5);
		}
	}
	
	private void clear() {
		//1
		index1.setBounds(1000,1000,80,25);
		station1.setBounds(1000,1000,80,25);
		come1.setBounds(1000,1000,80,25);
		go1.setBounds(1000,1000,80,25);
		stay1.setBounds(1000,1000,80,25);
		line1.setBounds(1000, 1000, 500, 5);
		//2
		index2.setBounds(1000,1000,80,25);
		station2.setBounds(1000,1000,80,25);
		come2.setBounds(1000,1000,80,25);
		go2.setBounds(1000,1000,80,25);
		stay2.setBounds(1000,1000,80,25);
		line2.setBounds(1000, 1000, 500, 5);
		//3
		index3.setBounds(1000,1000,80,25);
		station3.setBounds(1000,1000,80,25);
		come3.setBounds(1000,1000,80,25);
		go3.setBounds(1000,1000,80,25);
		stay3.setBounds(1000,1000,80,25);
		line3.setBounds(1000, 1000, 500, 5);
		//4
		index4.setBounds(1000,1000,80,25);
		station4.setBounds(1000,1000,80,25);
		come4.setBounds(1000,1000,80,25);
		go4.setBounds(1000,1000,80,25);
		stay4.setBounds(1000,1000,80,25);
		line4.setBounds(1000, 1000, 500, 5);
		//5
		index5.setBounds(1000,1000,80,25);
		station5.setBounds(1000,1000,80,25);
		come5.setBounds(1000,1000,80,25);
		go5.setBounds(1000,1000,80,25);
		stay5.setBounds(1000,1000,80,25);
		line5.setBounds(1000, 1000, 500, 5);
		//6
		index6.setBounds(1000,1000,80,25);
		station6.setBounds(1000,1000,80,25);
		come6.setBounds(1000,1000,80,25);
		go6.setBounds(1000,1000,80,25);
		stay6.setBounds(1000,1000,80,25);
		line6.setBounds(1000, 1000, 500, 5);
		//7
		index7.setBounds(1000,1000,80,25);
		station7.setBounds(1000,1000,80,25);
		come7.setBounds(1000,1000,80,25);
		go7.setBounds(1000,1000,80,25);
		stay7.setBounds(1000,1000,80,25);
		line7.setBounds(1000, 1000, 500, 5);
		//8
		index8.setBounds(1000,1000,80,25);
		station8.setBounds(1000,1000,80,25);
		come8.setBounds(1000,1000,80,25);
		go8.setBounds(1000,1000,80,25);
		stay8.setBounds(1000,1000,80,25);
		line8.setBounds(1000, 1000, 500, 5);
		//9
		index9.setBounds(1000,1000,80,25);
		station9.setBounds(1000,1000,80,25);
		come9.setBounds(1000,1000,80,25);
		go9.setBounds(1000,1000,80,25);
		stay9.setBounds(1000,1000,80,25);
		line9.setBounds(1000, 1000, 500, 5);
		//10
		index10.setBounds(1000,1000,80,25);
		station10.setBounds(1000,1000,80,25);
		come10.setBounds(1000,1000,80,25);
		go10.setBounds(1000,1000,80,25);
		stay10.setBounds(1000,1000,80,25);
		line10.setBounds(1000, 1000, 500, 5);
		//11
		index11.setBounds(1000,1000,80,25);
		station11.setBounds(1000,1000,80,25);
		come11.setBounds(1000,1000,80,25);
		go11.setBounds(1000,1000,80,25);
		stay11.setBounds(1000,1000,80,25);
		line11.setBounds(1000, 1000, 500, 5);
		//12
		index12.setBounds(1000,1000,80,25);
		station12.setBounds(1000,1000,80,25);
		come12.setBounds(1000,1000,80,25);
		go12.setBounds(1000,1000,80,25);
		stay12.setBounds(1000,1000,80,25);
		line12.setBounds(1000, 1000, 500, 5);
		//13
		index13.setBounds(1000,1000,80,25);
		station13.setBounds(1000,1000,80,25);
		come13.setBounds(1000,1000,80,25);
		go13.setBounds(1000,1000,80,25);
		stay13.setBounds(1000,1000,80,25);
		line13.setBounds(1000, 1000, 500, 5);
		//14
		index14.setBounds(1000,1000,80,25);
		station14.setBounds(1000,1000,80,25);
		come14.setBounds(1000,1000,80,25);
		go14.setBounds(1000,1000,80,25);
		stay14.setBounds(1000,1000,80,25);
		line14.setBounds(1000, 1000, 500, 5);
		//15
		index15.setBounds(1000,1000,80,25);
		station15.setBounds(1000,1000,80,25);
		come15.setBounds(1000,1000,80,25);
		go15.setBounds(1000,1000,80,25);
		stay15.setBounds(1000,1000,80,25);
		line15.setBounds(1000, 1000, 500, 5);
		//16
		index16.setBounds(1000,1000,80,25);
		station16.setBounds(1000,1000,80,25);
		come16.setBounds(1000,1000,80,25);
		go16.setBounds(1000,1000,80,25);
		stay16.setBounds(1000,1000,80,25);
		line16.setBounds(1000, 1000, 500, 5);
		
	}
	
	
	public PanelDetails() {
		addAll();

		setFocusable(true);		
		setLayout(null);
		setPreferredSize(new Dimension(500,600));
		setVisible(true);
		
	}
	
	public void setArr(ArrayList<Detail> arr) {
		this.arr = arr;
		maxPage = arr.size()/16 + (arr.size()%16==0 ? 0 : 1);
		nextPage();
	}

	public void clearAll() {
		clear();
		arr = null;
		pageNum.setText("- 0 -");
		page = 0;
		nowPage = 0;
		maxPage = 0;
		
	}

	public void nextPage() {
		if(arr == null || nowPage >= maxPage) return;
		
		nowPage++;
		clear();
		for(int i=(nowPage-1)*16, index = 1;i<arr.size()&&i<nowPage*16;++i,++index) {
			add(index,arr.get(i));
		}
		pageNum.setText("- " + nowPage +" -");
	}
	
	public void prePage() {
		if(arr == null || nowPage <= 1) return;
		
		nowPage--;
		clear();
		for(int i=(nowPage-1)*16, index = 1;i<arr.size()&&i<nowPage*16;++i,++index) {
			add(index,arr.get(i));
		}
		pageNum.setText("- " + nowPage +" -");
	}
	

}
