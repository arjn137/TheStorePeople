import java.awt.Component;
import java.awt.Dimension;
import java.util.* ;
import java.util.Arrays;
import java.util.List;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.Random;
import javax.swing.*;

public class makePurchase extends JPanel  implements ActionListener {
	final static String LABEL_TEXT= "Make Purchase";
	JFrame frame;
	JPanel contentPane;
	JLabel name, address, city, zipCode, phoneNum, cardNum, cardName, expirationDate, year1, month, blank;
	JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9 ;
	JButton confirm, cancel, home;
	String[] months= { "January" , "February" , "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	String[] year= { "2015", "2016", "2017", "2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031"};
	String  name2, address2, city2, zipCode2, phoneNum2, cardNum2, cardName2, expirationDate2, year2, month2;
	ArrayList <String> nameArray =new ArrayList<String>();
	ArrayList <String> addressArray= new ArrayList<String>();
	ArrayList <String> cityArray= new ArrayList<String>(); 
	ArrayList <String> zipCodeArray= new ArrayList<String>(); 
	ArrayList <String> phoneNumArray= new ArrayList<String>();
	ArrayList <String> cardNumArray= new ArrayList<String>();
	ArrayList <String> cardNameArray= new ArrayList<String>();
	ArrayList <String> monthArray= new ArrayList<String>();
	ArrayList <String> yearArray= new ArrayList<String>(); 
	ArrayList <Integer> confirmationOrder= new ArrayList<Integer>(); 
	int confirmationNum;
	Random rand = new Random();

	public makePurchase(){
		frame= new JFrame("Make Purchase");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		contentPane= new JPanel();
		contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		contentPane.setBorder(BorderFactory.createEmptyBorder (20, 20, 20,20));
		contentPane.setBackground(new Color(46, 65, 114));


		name= new JLabel("Name: ");
		name.setForeground(Color.white);
		name.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		contentPane.add(name);
		field1= new JTextField(10);
		contentPane.add(field1);


		address= new JLabel("Address: ");
		address.setForeground(Color.white);
		address.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		contentPane.add(address);
		field2= new JTextField(10);
		contentPane.add(field2);

		city= new JLabel("City: ");
		city.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		city.setForeground(Color.white);
		contentPane.add(city);
		field3= new JTextField(10);
		contentPane.add(field3);

		zipCode= new JLabel("Zip Code: ");
		zipCode.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		zipCode.setForeground(Color.white);
		contentPane.add(zipCode);
		field4= new JTextField(10);
		contentPane.add(field4);

		phoneNum= new JLabel("Phone Number: ");
		phoneNum.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 

		phoneNum.setForeground(Color.white);
		contentPane.add(phoneNum);
		field5= new JTextField(10);
		contentPane.add(field5);

		cardNum= new JLabel("Credit Card Number: ");
		cardNum.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		cardNum.setForeground(Color.white);
		contentPane.add(cardNum);
		field6= new JTextField(10);
		contentPane.add(field6); 

		cardName= new JLabel("Name Displayed on Credit Card: ");
		cardName.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		cardName.setForeground(Color.white);
		contentPane.add(cardName);
		field7= new JTextField(10);
		contentPane.add(field7); 

		expirationDate= new JLabel("Expiration Date ");
		expirationDate.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		expirationDate.setForeground(Color.white);
		blank= new JLabel(" ");
		contentPane.add(expirationDate);
		contentPane.add(blank);
		month= new JLabel("Month:");
		month.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		month.setForeground(Color.white);
		contentPane.add(month);
		field8=new JTextField(10);
		contentPane.add(field8);
		year1= new JLabel("Year:");
		year1.setFont(new Font("Bodoni MT Condensed", Font.BOLD, 40)); 
		year1.setForeground(Color.white);
		contentPane.add(year1);
		field9=new JTextField(10);
		contentPane.add(field9);


		confirm= new JButton("Confirm Order");
		confirm.setActionCommand("Confirm Order");
		confirm.addActionListener((ActionListener) this);
		contentPane.add(confirm);

		cancel= new JButton("Cancel Order");
		cancel.setActionCommand("Cancel Order");
		cancel.addActionListener((ActionListener) this);
		contentPane.add(cancel);

		home= new JButton("Return To Home");
		home.setActionCommand("Return To Home");
		home.addActionListener((ActionListener) this);
		contentPane.add(home);

		frame.setContentPane(contentPane);

		frame.pack();
		frame.setVisible(true);

	}
	public void actionPerformed(ActionEvent event){
		String eventName = event.getActionCommand();
		if(eventName.equals("Confirm Order")){
			if(field1.getText().equals("") || field2.getText().equals("")  || field3.getText().equals("") || field4.getText().equals("")|| field5.getText().equals("")|| field6.getText().equals("")|| field7.getText().equals("")|| field8.getText().equals("")|| field9.getText().equals("")){
				JOptionPane.showMessageDialog(frame,
						"Please fill out all required fields");
			}  else{

				name2=field1.getText();
				nameArray.add(name2);
				address2=field2.getText();
				addressArray.add(address2);
				city2= field3.getText();
				cityArray.add(city2);
				zipCode2= field4.getText();
				zipCodeArray.add(zipCode2);
				phoneNum2=field5.getText();
				phoneNumArray.add(phoneNum2);
				cardNum2=field6.getText();
				cardNumArray.add(cardNum2);
				cardName2=field7.getText();
				cardNameArray.add(cardName2);
				month2= field8.getText();
				monthArray.add(month2);
				year2=field9.getText();	
				yearArray.add(year2);
				confirmationNum = rand.nextInt(100000);
				JOptionPane.showMessageDialog(frame,
						"Your order has been received! Your confirmation number is " + confirmationNum);

				confirmationOrder.add(confirmationNum);
			}
		}
		else if(eventName.equals("Cancel Order")){
			JOptionPane.showMessageDialog(frame,
					"Your order has been canceled.");
			field1.setText("");
			field2.setText("");
			field3.setText("");
			field4.setText("");
			field5.setText("");
			field6.setText("");
			field7.setText("");
			field8.setText("");
			field9.setText("");
			while(Main.shop.getCount()>0){
				Main.shop.removeFromCart(0);
			}
		}
		else if(eventName.equals("Return To Home")){
			HomePage.runGUI();
			frame.dispose();
		}

	}

	public static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		makePurchase page= new makePurchase();
	}

}



