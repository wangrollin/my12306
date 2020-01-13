import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeFrame extends JFrame{
	JPanel panels;
	
	public HomeFrame() {
	    
    
		panels =new PanelCard();
	    
        setTitle("My12306");
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panels);
        
        setResizable(false);
        setLocation(470, 120);
        pack();
        setVisible(true);
        
	}
	
	public static void main(String[] args) {
		new HomeFrame();
	}



	
	/*Frame f = new Frame("My12306");
	
	Button b1 = new Button("button"); 
	b1.addMouseListener(new MouseAdapter() {
		public void mouseReleased(MouseEvent e) {
			System.out.println("button is released!");
		}
	});
	
	f.add(b1);*/
}
