import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;
//By The Store People

public class ReviewPage implements ActionListener{
	JFrame frame;
	JPanel contentPane, rightBox,leftBox,titleBox;
	JComboBox dept;
	double total, tax;
	JButton confirm, home,enterCode;
	JTextField promo;
	boolean bool=false;
	String promoCode="Code",code;
	JLabel title, border;
	JLabel right1,right2,right3,right4,right5,right6,right7,right8,right9;
	JLabel name,pic,price;
	private String dep, prod;
	
	public ReviewPage(String dep, String prod){
		this.dep=dep; this.prod=prod;
		
		frame = new JFrame("Review Cart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DecimalFormat df= new DecimalFormat("#,###.00");
		
		contentPane= new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(BorderFactory.createEmptyBorder(0,2,10,5));
		contentPane.setBackground(new Color(46, 65, 114));
		
		//home and back button
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
		contentPane.add(home);

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
		contentPane.add(back);

		border=new JLabel();
		border.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		border.setLocation(0, 0);
		contentPane.add(border);
		
		//Title Box
		titleBox = new JPanel();
		titleBox.setBackground(new Color(161, 173,202));
		titleBox.setBounds(493, 60, 600, 80);
		title = new JLabel();
		title.setText("Review Page");
		title.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 55));
		title.setForeground(Color.white);
		titleBox.add(title);
		contentPane.add(titleBox);
		
		//Right Box
		rightBox = new JPanel();
		rightBox.setLayout(new BoxLayout(rightBox, BoxLayout.Y_AXIS));
		rightBox.setBackground(new Color(161, 173,202));
		rightBox.setBounds(970, 170, 500, 600);
		
		rightBox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		right1 = new JLabel();
		right1.setText("Price:");
		right1.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 50));
		right1.setForeground(Color.white);
		rightBox.add(right1);
		
		right2 = new JLabel();
		right2.setText("    $"+df.format(Main.shop.getTotal()));
		right2.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40));
		right2.setForeground(new Color(46, 65, 114));
		rightBox.add(right2);
		
		right3 = new JLabel();
		
		tax = (int)((Main.shop.getTotal()*.06)*100);
		tax/=100;
		right3.setText("Tax: ");
		right3.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 50));
		right3.setForeground(Color.white);
		rightBox.add(right3);
		
		right4 = new JLabel();
		right4.setText("    $"+df.format(tax));
		right4.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40));
		right4.setForeground(new Color(46, 65, 114));
		rightBox.add(right4);
		
		right5 = new JLabel();
		right5.setText("Shipping:");
		right5.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 50));
		right5.setForeground(Color.white);
		rightBox.add(right5);

		right6 = new JLabel();
		right6.setText("    $5.00 Flat Rate - Tax Included");
		right6.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40));
		right6.setForeground(new Color(46, 65, 114));
		rightBox.add(right6);
		
		right7 = new JLabel();
		right7.setText("Total:");
		right7.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 50));
		right7.setForeground(Color.white);
		rightBox.add(right7);
		
		right8 = new JLabel();
		
		if(bool){
			right8.setText("    $"+df.format(((Main.shop.getTotal()+tax+5)*.8)));
		} else{
			right8.setText("    $"+df.format((Main.shop.getTotal()+tax+5)));
		}
		right8.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40));
		right8.setForeground(new Color(46, 65, 114));
		rightBox.add(right8);
		
		
		confirm = new JButton("Confirm Purchase");
		confirm.setActionCommand("Confirm Purchase");
		confirm.addActionListener(this);
		rightBox.add(Box.createVerticalStrut(5));
		rightBox.add(confirm);
		
		right9 = new JLabel();
		right9.setText("       Thank you for shopping with us!");
		right9.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 35));
		right9.setForeground(new Color(46, 65, 114));
		rightBox.add(Box.createVerticalStrut(10));
		rightBox.add(right9);
		
		contentPane.add(rightBox);
		
		//Left Box
		leftBox = new JPanel();
		leftBox.setBackground(new Color(161, 173,202));
		leftBox.setBounds(120, 170, 500, 600);
		contentPane.add(leftBox);
		
		leftBox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		for (int i =0; i <Main.shop.getCart().size();i++){
			JPanel productPanel=new JPanel();
			pic=new JLabel();
			ImageIcon img1 = Main.shop.getCurrent(i).getImg();
			Image temp1 = img1.getImage();
			if(temp1.getHeight(null)>temp1.getWidth(null)){
				temp1 = temp1.getScaledInstance(-1, 75, Image.SCALE_SMOOTH);
			}
			else{
				temp1 = temp1.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
			}
			img1 = new ImageIcon(temp1);
			pic.setIcon(img1);
			productPanel.add(pic);
			
			name=new JLabel();
			name.setText(Main.shop.getCurrent(i).getName());
			
			price = new JLabel();
			price.setText("$"+df.format(Main.shop.getCurrent(i).getPrice()));
			
			JLabel quantity = new JLabel();
			quantity.setText("Quantity: "+Main.shop.getCurrent(i).getQuan());
			
			productPanel.add(pic);
			productPanel.add(name);
			productPanel.add(price);
			productPanel.add(quantity);
			leftBox.add(productPanel);
		}
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		if(eventName.equals("Confirm Purchase")){
			makePurchase.runGUI();
			frame.dispose();
		}
		else if(eventName.equals("home")){
			//go to the home page
			HomePage.runGUI();
			frame.dispose();
		}
		else {
			//go to the previous page
			if(dep==null&&prod==null){
				HomePage home=new HomePage();
			}
			else if(prod==null){
				Department dept=new Department(dep);
			}
			else {
				Product pro=new Product(dep, prod);
			}
			frame.dispose();
		}
	}
	
	public static void runGUI(String dep, String prod){
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		ReviewPage front = new ReviewPage(dep, prod);
	}
	
}
