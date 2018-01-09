import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Department implements ActionListener{
	private JFrame frame;
	private JPanel contentpane;
	private String font = "Bodoni MT Condensed";
	private Color a = new Color(161, 173, 202);
	private ArrayList<ProductShell> data;
	private String name;
	
	public Department(String name){
		this.name=name;
		data=Main.getData(name);
		int num=data.size();
		Dimension screen = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		frame = new JFrame(name);
		frame.setPreferredSize(screen);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentpane = new JPanel();
		contentpane.setBackground(new Color(46, 65, 114));
		contentpane.setLayout(null);
		
		//home, back, and cart button
		JButton home = new JButton();
		home.setSize(new Dimension(50, 50));
		home.setActionCommand("home");
		home.addActionListener(this);
		ImageIcon img = new ImageIcon(getClass().getResource("Product Images/home.png"));
		Image temp = img.getImage();
		temp = temp.getScaledInstance(50, -1, Image.SCALE_SMOOTH);
		img = new ImageIcon(temp);
		home.setIcon(img);
		home.setLocation(25, 25);
		contentpane.add(home);
		
		JButton back = new JButton();
		back.setSize(new Dimension(50, 50));
		back.setActionCommand("back");
		back.addActionListener(this);
		ImageIcon img2 = new ImageIcon(getClass().getResource("Product Images/back.png"));
		Image temp2 = img2.getImage();
		temp2 = temp2.getScaledInstance(50, -1, Image.SCALE_SMOOTH);
		img2 = new ImageIcon(temp2);
		back.setIcon(img2);
		back.setLocation(100, 25);
		contentpane.add(back);
		
		JButton cart = new JButton();
		cart.setSize(new Dimension(50, 50));
		cart.setActionCommand("checkout");
		cart.addActionListener(this);
		ImageIcon img3 = new ImageIcon(getClass().getResource("Product Images/cart.png"));
		Image temp3 = img3.getImage();
		temp3 = temp3.getScaledInstance(50, -1, Image.SCALE_SMOOTH);
		img3 = new ImageIcon(temp3);
		cart.setIcon(img3);
		cart.setLocation((int)(screen.getWidth())-100, 25);
		contentpane.add(cart);
		
		//department name
		JLabel depname = new JLabel();
		depname.setSize(new Dimension(500,100));
		depname.setText(name);
		depname.setFont(new Font(font, Font.BOLD, 70));
		depname.setForeground(Color.white);
		depname.setLocation((int)((screen.getWidth()/2)-(name.length()*14)), 25);
		contentpane.add(depname);
		
		//product previews
		Color b=Color.white;
		int side=(int)((screen.getWidth()-165)/5);
		int x=25, y=150;
		for(int i=0; i<num; i++){
			if(i==5){
				y+=side+50; x=25;
			}
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			panel.setSize(side, side);
			if(i%2==0){
				panel.setBackground(a);
			}
			else{
				panel.setBackground(b);
			}
			panel.setLocation(x, y);
			x+=side+25;
			panel=create(i, panel);
			contentpane.add(panel);
		}
		
		frame.setContentPane(contentpane);
		frame.pack();
		frame.setVisible(true);
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		try{
			Thread.sleep(100);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
	
	private JPanel create(int i, JPanel panel){
		//add product title, image, and button
		//title
		JButton button = new JButton("Preview/Order");
		button.setFont(new Font(font, Font.PLAIN, 20));
		button.setAlignmentX(panel.CENTER_ALIGNMENT);
		JLabel label1 = new JLabel();
		label1.setFont(new Font(font, Font.PLAIN, 32));
		label1.setAlignmentX(panel.CENTER_ALIGNMENT);
		if(i%2==0) {
			label1.setForeground(Color.white);
			button.setBackground(Color.white);
			button.setForeground(Color.black);
		}
		else{
			label1.setForeground(Color.black);
			button.setBackground(a);
			button.setForeground(Color.white);
		}
		String title = data.get(i).getName(); //get title from product data
		label1.setText(title);
		panel.add(label1);
		button.setActionCommand(i+"");
		button.addActionListener(this);
		//image
		JLabel label2 = new JLabel();
		label2.setAlignmentX(panel.CENTER_ALIGNMENT);
		ImageIcon img = data.get(i).getImg(); //load image from product data
		Image temp = img.getImage();
		if(temp.getHeight(null)>temp.getWidth(null)){
			temp = temp.getScaledInstance(-1, 175, Image.SCALE_SMOOTH);
		}
		else{
			temp = temp.getScaledInstance(175, -1, Image.SCALE_SMOOTH);
		}
		img = new ImageIcon(temp);
		label2.setIcon(img);
		panel.add(label2);
		panel.add(Box.createVerticalStrut(25));
		panel.add(button);
		
		return panel;
	}
	
	public void close(){
		frame.dispose();
	}
	
	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		if(eventName.equals("home")){
			//go to the home page
			HomePage.runGUI();
			close();
		}
		else if(eventName.equals("back")){
			//go to the previous page
			HomePage.runGUI();
			close();
		}
		else if(eventName.equals("checkout")){
			ReviewPage.runGUI(name, null);
			close();
			//open checkout page
		}
		else{
			//open specific product page
			Product.runGUI(name, eventName);
			close();
		}
	}
	
	public static void runGUI(String dep){
		Department run = new Department(dep);
	}
}



