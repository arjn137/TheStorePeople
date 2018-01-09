import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Product implements ActionListener {

	private JFrame frame;
	private JPanel contentPane;
	private JLabel title, desc, pLabel;
	private JButton button;
	private String[] quantities = { "1", "2", "3", "4", "5" };
	private String font = "Bodoni MT Condensed";
	private String nameOfProd;
	private String descOfProd;
	private double price;
	private JComboBox<String> qList;
	private Color a = new Color(161, 173, 202);
	private ImageIcon image;
	private ProductShell data;
	private String dep;
	private int p;
	private String prod;
	
	public Product(String dep, String prod) {
		this.dep=dep;
		this.prod=prod;
		p=Integer.parseInt(prod);
		data = Main.getData(dep).get(p);
		nameOfProd=data.getName();
		descOfProd=data.getDesc();
		image=data.getImg();
		price=data.getPrice();

		frame = new JFrame("Product Page");
		Dimension screen = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(screen);
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		contentPane.setBackground(new Color(46, 65, 114));
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		//home, back, and cart button
		JPanel buttons=new JPanel();
		buttons.setLayout(null);
		buttons.setBackground(null);
		
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
		buttons.add(home);

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
		buttons.add(back);

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
		buttons.add(cart);
		
		contentPane.add(buttons);
		
		title = new JLabel(nameOfProd);
		title.setFont(new Font(font, Font.CENTER_BASELINE, 50));
		title.setForeground(new Color(255, 255, 255));
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		title.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(title);
		
		JPanel panel = new JPanel(new GridLayout(1,2));
		panel.setBackground(new Color(46, 65, 114));// 1 row, 2 cols
		
		desc = new JLabel();
		desc.setText(tab(descOfProd));
		desc.setFont(new Font(font, Font.PLAIN, 40));
		desc.setForeground(new Color(255, 255, 255));
		desc.setAlignmentX(Component.LEFT_ALIGNMENT);
		desc.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		Image temp4 = image.getImage();
		if(temp4.getHeight(null)>temp4.getWidth(null)){
			temp4 = temp4.getScaledInstance(-1, 350, Image.SCALE_SMOOTH);
		}
		else{
			temp4 = temp4.getScaledInstance(350, -1, Image.SCALE_SMOOTH);
		}
		image = new ImageIcon(temp4);
		JLabel label2 = new JLabel("");
		label2.setIcon(image);
		label2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		label2.setBorder(new EmptyBorder(0, 200, 0, 0));
		
		panel.add(desc);
		panel.add(label2);
		contentPane.add(panel);

		// Create the combo box, select item at index 4.
		// Indices start at 0, so 4 specifies the pig.

		qList = new JComboBox<String>(quantities);
		qList.setSelectedIndex(0);
		qList.setAlignmentX(Component.CENTER_ALIGNMENT);
		qList.setMaximumSize(new Dimension(50, 30));
		qList.setBackground(Color.white);
		qList.setForeground(Color.black);
		qList.setBorder(new EmptyBorder(0, 0, 50, 0));
		qList.setBackground(new Color(46, 65, 114));
		qList.addActionListener(this);
		contentPane.add(qList);
		
		DecimalFormat df= new DecimalFormat("#,###.00");
		pLabel = new JLabel("Price: $"+df.format(price));
		pLabel.setFont(new Font(font, Font.PLAIN, 40));
		pLabel.setForeground(new Color(255, 255, 255));
		pLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		pLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(pLabel);

		button = new JButton("Add to Cart");
		button.setActionCommand("Add to Cart");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setBackground(Color.white);
		button.setForeground(Color.black);
		button.setBorder(new EmptyBorder(30, 10, 30, 10));
		button.setMaximumSize(new Dimension(400,150));
		button.addActionListener(this);
		contentPane.add(button);
		
		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);

	}
	
	private String tab(String desc){
//		String temp="";
//		if(desc.length()>60){
//			temp+=desc.substring(0, 60);
//			temp+="<html><br></html>";
//			temp+=desc.substring(60);
//		}
//		else{
//			temp=desc;
//		}
		return desc;
	}
	
	public void actionPerformed(ActionEvent event) {

		String eventName = event.getActionCommand();
		
		if(eventName.equals("home")){
			//go to the home page
			HomePage.runGUI();
			frame.dispose();
		}
		else if(eventName.equals("back")){
			//go to the previous page
			Department.runGUI(dep);
			frame.dispose();
		}
		else if(eventName.equals("checkout")){
			//open checkout page
			frame.dispose();
			ReviewPage.runGUI(dep, prod);
		}
		else if(eventName.equals("Add to Cart")){ 
			// Add to Shopping cart
			String units = (String)qList.getSelectedItem();
			if(units.equals("1")){
				Main.getData(dep).get(p).setQuan(1);
			} else if(units.equals("2")){
				Main.getData(dep).get(p).setQuan(2);
			} else if(units.equals("3")){
				Main.getData(dep).get(p).setQuan(3);
			} else if(units.equals("4")){
				Main.getData(dep).get(p).setQuan(4);
			} else if(units.equals("5")){
				Main.getData(dep).get(p).setQuan(5);
			}
			Main.shop.addToCart(data);
			button.setText("Added");
			button.setActionCommand("Added");
		}

	}
	
	public static void runGUI(String dep, String prod) {

		JFrame.setDefaultLookAndFeelDecorated(true);

		Product product = new Product(dep, prod);
	}

}


