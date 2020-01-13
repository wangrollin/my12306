import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCard extends JPanel implements ActionListener{

	private PanelHome home = new PanelHome();
	private PanelSearch search = new PanelSearch();
	private PanelLogin login = new PanelLogin();
	private PanelTrains trains = new PanelTrains();
	private PanelDetails details = new PanelDetails();
	private PanelPay pay = new PanelPay();
	private PanelPaydone paydone = new PanelPaydone();
	private PanelReg reg = new PanelReg();
	private PanelRegdone regdone = new PanelRegdone();
	private PanelMyhome myhome = new PanelMyhome();
	private PanelMyorder myorder = new PanelMyorder();
	private PanelMyids myids = new PanelMyids();
	private PanelAddid addid = new PanelAddid();
	
	public CardLayout lay = new CardLayout();
	
	public PanelCard()
	{		
				
		setLayout(lay);
	    setFocusable(true);
	    
	    add(home,"home");
	    add(search,"search");
	    add(login,"login");
	    add(trains,"trains");
	    add(details,"details");
	    add(pay,"pay");
	    add(paydone,"paydone");
	    add(reg,"reg");
	    add(regdone,"regdone");
	    add(myhome,"myhome");
	    add(myorder,"myorder");
	    add(myids,"myids");
	    add(addid,"addid");
	    
		lay.show(this,"home");
		
		/*************************************/
		home.getSearch().addActionListener(this);
		home.getLogin().addActionListener(this);
		
		/*************************************/
		search.getGoback().addActionListener(this);
		search.getExchange().addActionListener(this);
		search.getSearch().addActionListener(this);
		
		/*************************************/
		trains.getGoback().addActionListener(this);
		trains.getNextPage().addActionListener(this);
		trains.getPrePage().addActionListener(this);
		trains.getDetail1().addActionListener(this);
		trains.getDetail2().addActionListener(this);
		trains.getDetail3().addActionListener(this);
		trains.getDetail4().addActionListener(this);
		
		trains.getBuyss1().addActionListener(this);
		trains.getBuyhs1().addActionListener(this);
		trains.getBuysb1().addActionListener(this);
		trains.getBuyhb1().addActionListener(this);
		trains.getBuyst1().addActionListener(this);
		
		trains.getBuyss2().addActionListener(this);
		trains.getBuyhs2().addActionListener(this);
		trains.getBuysb2().addActionListener(this);
		trains.getBuyhb2().addActionListener(this);
		trains.getBuyst2().addActionListener(this);

		trains.getBuyss3().addActionListener(this);
		trains.getBuyhs3().addActionListener(this);
		trains.getBuysb3().addActionListener(this);
		trains.getBuyhb3().addActionListener(this);
		trains.getBuyst3().addActionListener(this);
		
		trains.getBuyss4().addActionListener(this);
		trains.getBuyhs4().addActionListener(this);
		trains.getBuysb4().addActionListener(this);
		trains.getBuyhb4().addActionListener(this);
		trains.getBuyst4().addActionListener(this);
	
		/*************************************/
		details.getGoback().addActionListener(this);
		details.getNextPage().addActionListener(this);
		details.getPrePage().addActionListener(this);
		
		/*************************************/
		pay.getGoback().addActionListener(this);
		pay.getBuy().addActionListener(this);
		
		/*************************************/
		paydone.getGoback().addActionListener(this);
		
		/*************************************/
		login.getGoback().addActionListener(this);
		login.getReg().addActionListener(this);
		login.getLogin().addActionListener(this);
		
		/*************************************/
		reg.getUnreg().addActionListener(this);
		reg.getReg().addActionListener(this);
		
		/*************************************/
		regdone.getGoback().addActionListener(this);
		
		/*************************************/
		myhome.getOrder().addActionListener(this);
		myhome.getSearch().addActionListener(this);
		myhome.getIds().addActionListener(this);
		myhome.getQuit().addActionListener(this);
		
		/*************************************/
		myorder.getRefund1().addActionListener(this);
		myorder.getRefund2().addActionListener(this);
		myorder.getRefund3().addActionListener(this);
		myorder.getRefund4().addActionListener(this);
		myorder.getGoback().addActionListener(this);
		myorder.getNextPage().addActionListener(this);
		myorder.getPrePage().addActionListener(this);
		
		/*************************************/
		myids.getGoback().addActionListener(this);
		myids.getRemove1().addActionListener(this);
		myids.getRemove2().addActionListener(this);
		myids.getRemove3().addActionListener(this);
		myids.getRemove4().addActionListener(this);
		myids.getRemove5().addActionListener(this);
		myids.getAdd1().addActionListener(this);
		myids.getAdd2().addActionListener(this);
		myids.getAdd3().addActionListener(this);
		myids.getAdd4().addActionListener(this);
		myids.getAdd5().addActionListener(this);
		
		/*************************************/
		addid.getCancel().addActionListener(this);
		addid.getAdd().addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//home//home//home//home//home                                  //home//home//home//home//home
		if (e.getSource() == home.getSearch()) {
			lay.show(this,"search"); 
		} else if (e.getSource() == home.getLogin()) {
			  lay.show(this,"login"); 
		}
		//search														//search
		else if (e.getSource() == search.getGoback()) {
			if(myhome.getID()!=null) {
				lay.show(this, "myhome");
			} else {
				lay.show(this, "home");
			}
		} else if (e.getSource() == search.getExchange()) {
			search.exchange();
		} else if (e.getSource() == search.getSearch()) {
			if(!search.checkCity()) {
				search.cityError();
			} else if(!search.checkTime()){
				search.timeError();
			} else {
				trains.setTrain(search.TrainArr(),search.getTime(),search.getCity1(),search.getCity2());
				lay.show(this, "trains");
			}
		}
		//trains														//trains
		else if(e.getSource() == trains.getGoback()) {
			trains.clearAll();
			lay.show(this, "search");
		} else if(e.getSource() == trains.getNextPage()) {
			trains.nextPage();
		} else if(e.getSource() == trains.getPrePage()) {
			trains.prePage();
		}
		/********************* 1 *********************************/
		else if(e.getSource() == trains.getBuyss1()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("ss1")) != null) {
					pay.setTrain(train,"ss",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				} else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
		}else if(e.getSource() == trains.getBuyhs1()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("hs1")) != null) {
					pay.setTrain(train,"hs",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuysb1()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("sb1")) != null) {
					pay.setTrain(train,"sb",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyhb1()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("hb1")) != null) {
					pay.setTrain(train,"hb",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyst1()) {
			Train train;if(myhome.getID()!=null) {
				if((train=trains.canBuy("st1")) != null) {
					pay.setTrain(train,"st",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
		
		}else if(e.getSource() == trains.getDetail1()) {
			ArrayList<Detail> arr = trains.getTrainDetail(0);
			details.setArr(arr);
			lay.show(this, "details");
		}
		/********************* 2 *********************************/
		else if(e.getSource() == trains.getBuyss2()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("ss2")) != null) {
					pay.setTrain(train,"ss",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyhs2()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("hs2")) != null) {
					pay.setTrain(train,"hs",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuysb2()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("sb2")) != null) {
					pay.setTrain(train,"sb",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyhb2()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("hb2")) != null) {
					pay.setTrain(train,"hb",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyst2()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("st2")) != null) {
					pay.setTrain(train,"st",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getDetail2()) {
			ArrayList<Detail> arr = trains.getTrainDetail(1);
			details.setArr(arr);
			lay.show(this, "details");
		}
		/********************* 3 *********************************/
		else if(e.getSource() == trains.getBuyss3()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("ss3")) != null) {
					pay.setTrain(train,"ss",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
		
		}else if(e.getSource() == trains.getBuyhs3()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("hs3")) != null) {
					pay.setTrain(train,"hs",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuysb3()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("sb3")) != null) {
					pay.setTrain(train,"sb",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyhb3()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("hb3")) != null) {
					pay.setTrain(train,"hb",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyst3()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("st3")) != null) {
					pay.setTrain(train,"st",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getDetail3()) {
			ArrayList<Detail> arr = trains.getTrainDetail(2);
			details.setArr(arr);
			lay.show(this, "details");
		}
		/********************* 4 *********************************/
		else if(e.getSource() == trains.getBuyss4()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("ss4")) != null) {
					pay.setTrain(train,"ss",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyhs4()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("hs4")) != null) {
					pay.setTrain(train,"hs",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
		
		}else if(e.getSource() == trains.getBuysb4()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("sb4")) != null) {
					pay.setTrain(train,"sb",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyhb4()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("hb4")) != null) {
					pay.setTrain(train,"hb",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getBuyst4()) {
			Train train;
			if(myhome.getID()!=null) {
				if((train=trains.canBuy("st4")) != null) {
					pay.setTrain(train,"sst",trains.getTime(),trains.getCity(),myhome.getIdArray());
					lay.show(this, "pay");
				}
				else {
					trains.numError();
				}
			}else {
				trains.loginError();
			}
			
		}else if(e.getSource() == trains.getDetail4()) {
			ArrayList<Detail> arr = trains.getTrainDetail(3);
			details.setArr(arr);
			lay.show(this, "details");
		}
		
		//details															--//details//details//details//details//details--
		else if (e.getSource() == details.getGoback()) {
			details.clearAll();
			lay.show(this, "trains");
		}else if (e.getSource() == details.getNextPage()) {
			details.nextPage();
		}else if (e.getSource() == details.getPrePage()) {
			details.prePage();
		}
		//pay																//pay
		else if (e.getSource() == pay.getGoback()) {
			pay.clear();
			lay.show(this, "trains");
		}else if (e.getSource() == pay.getBuy()) {
			if(pay.checkid()) {
				pay.buy(myhome.getID());
				pay.clear();
				lay.show(this, "paydone");
			} else {
				pay.error();
			}
			
		}
		//paydone														//paydone
		else if (e.getSource() == paydone.getGoback()) {
			paydone.clear();
			pay.clear();
			lay.show(this, "trains");
		}
		
		//login															 //login//login//login//login//login//login//login	
		else if (e.getSource() == login.getGoback()) {
			login.clear();
			lay.show(this,"home"); 
		}else if (e.getSource() == login.getReg()) {
			login.clear();
			lay.show(this,"reg"); 
		}else if (e.getSource() == login.getLogin()) {
			int state = login.canLogin();
			if(state == 1) {
				myhome.login(login.getId());
				login.clear();
				lay.show(this,"myhome"); 
			}else if(state == -1){
				login.netError();
				login.clear();
			}
			else if(state == 0){
				login.idError();
				login.clear();
			}
		}
		//reg															//reg	
		else if (e.getSource() == reg.getUnreg()) {
			reg.clear();
			lay.show(this, "login");
		}else if (e.getSource() == reg.getReg()) {
			if(reg.canReg()) {
				reg.clear();
				lay.show(this, "regdone");
			}else {
				reg.clear();
				reg.error();
			}
		}
		//regdone														//regdone
		else if (e.getSource() == regdone.getGoback()) {
			lay.show(this, "login");
		}
		//myhome														//myhome			
		else if (e.getSource() == myhome.getOrder()) {
			myorder.setTicketArr(myhome.getTicketArr());
			lay.show(this, "myorder");
		}else if (e.getSource() == myhome.getSearch()) {
			lay.show(this, "search");
		}else if (e.getSource() == myhome.getIds()) {
			myids.setIdArray(myhome.getIdArray(), myhome.getID());
			lay.show(this, "myids");
		}else if (e.getSource() == myhome.getQuit()) {
			myhome.quit();
			lay.show(this, "login");
		}
		//myorder														//myorder
		else if (e.getSource() == myorder.getRefund1()) {
			myorder.refund(1,myhome.getID());
		}else if (e.getSource() == myorder.getRefund2()) {
			myorder.refund(2,myhome.getID());
		}else if (e.getSource() == myorder.getRefund3()) {
			myorder.refund(3,myhome.getID());
		}else if (e.getSource() == myorder.getRefund4()) {
			myorder.refund(4,myhome.getID());
		}else if (e.getSource() == myorder.getPrePage()) {
			myorder.prePage();
		}else if (e.getSource() == myorder.getNextPage()) {
			myorder.nextPage();
		}else if (e.getSource() == myorder.getGoback()) {
			myorder.clearAll();
			lay.show(this, "myhome");
		}
		//myids																//myids
		else if (e.getSource() == myids.getGoback()) {
			myids.clearAll();
			lay.show(this, "myhome");
		}else if (e.getSource() == myids.getRemove1()) {
			myids.removeid(1);
		}else if (e.getSource() == myids.getRemove2()) {
			myids.removeid(2);
		}else if (e.getSource() == myids.getRemove3()) {
			myids.removeid(3);
		}else if (e.getSource() == myids.getRemove4()) {
			myids.removeid(4);
		}else if (e.getSource() == myids.getRemove5()) {
			myids.removeid(5);
		}else if (e.getSource() == myids.getAdd1()||e.getSource() == myids.getAdd2()
					||e.getSource() == myids.getAdd3()||e.getSource() == myids.getAdd4()
					||e.getSource() == myids.getAdd5()) {
			myids.clearAll();
			addid.setID(myhome.getID());
			lay.show(this, "addid");
		}
		//addid	
		else if (e.getSource() == addid.getCancel()) {
			addid.clear();
			myids.setIdArray(myhome.getIdArray(), myhome.getID());
			lay.show(this, "myids");
		}else if (e.getSource() == addid.getAdd()) {
			if(addid.check()) {
				addid.add();
				addid.clear();
				myids.setIdArray(myhome.getIdArray(), myhome.getID());
				lay.show(this, "myids");
			}else {
				addid.error();
			}
			
		}
		
		
	}
	

}
