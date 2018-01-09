import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HomePage implements ActionListener 
{
	JFrame frame;
	JPanel contentPane;
	JButton store;
	JLabel departmentSelection, display, storeBanner;
	JComboBox departmentNames;
	public HomePage()
	{
		frame = new JFrame("The Store People");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		frame.setSize(screen);
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		Color color = new Color(47, 65, 113);
		Color color2 = new Color(93, 110, 154);
		
		
		ImageIcon store1 = new ImageIcon(getClass().getResource("Product Images/cart.png"));
		Image start = store1.getImage();
		Image newimg = start.getScaledInstance( 60, 60,  java.awt.Image.SCALE_SMOOTH );
		store1 = new ImageIcon( newimg );
		store = new JButton (store1);
		store.addActionListener(this);
		store.setActionCommand("cart");
		store.setSize(60,60);
		store.setLocation((int)(screen.getWidth())-100, 25);
		contentPane.add(store);
		
		String[] names = {"Select a department", "Cars", "Clothing", "Entertainment",
				"Food", "Furniture", "Health", "Outdoors", "Technology"};
		departmentNames = new JComboBox(names);
		departmentNames.setSize(350, 60);
		departmentNames.setLocation(625, 500);
		departmentNames.setBackground(color2);

		departmentNames.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
		departmentNames.setSelectedIndex(0);
		departmentNames.addActionListener(this);
		contentPane.add(departmentNames);

		ImageIcon banner = new ImageIcon(getClass().getResource("Product Images/logo.png"));
		Image temp = banner.getImage();
		Image bannerImg = temp.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH );
		ImageIcon banner2  = new ImageIcon(bannerImg);
		storeBanner = new JLabel();
		storeBanner.setIcon(banner2);
		storeBanner.setSize(300, 300);
		storeBanner.setLocation(650,150);
		contentPane.add(storeBanner);

		contentPane.setBackground(color);
		frame.add(contentPane);
		frame.setLocationByPlatform(true);
		frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

		frame.setVisible(true);

	}
	public void actionPerformed(ActionEvent event)
	{
		String eventName = event.getActionCommand();
		if(eventName.equals("cart")){
			//go to the cart page
			ReviewPage.runGUI(null, null);
			frame.dispose();
		}
		else{
			JComboBox comboBox = (JComboBox)event.getSource();
			String departmentSelection = (String)comboBox.getSelectedItem();
			if(departmentSelection.equals("Select a department")){
				
			}
			else{
				Department.runGUI(departmentSelection);
				frame.dispose();
			}
		}
	}
	public static void runGUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);

		HomePage run = new HomePage();
	}
}


