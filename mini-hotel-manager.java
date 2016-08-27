import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Hotel extends JFrame {
	public Hotel() {
		initComponents();
	}


	private void initComponents() {
		
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menu2 = new JMenu();
		menuItem2 = new JMenuItem();
		label1 = new JLabel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		label4 = new JLabel();
		textField3 = new JTextField();
		label5 = new JLabel();
		comboBox1 = new JComboBox<>();
		label6 = new JLabel();
		textField4 = new JTextField();
		label7 = new JLabel();
		label8 = new JLabel();
		textField5 = new JTextField();
		label9 = new JLabel();
		label10 = new JLabel();
		textField6 = new JTextField();
		label11 = new JLabel();
		textField7 = new JTextField();
		label12 = new JLabel();
		textField8 = new JTextField();
		label13 = new JLabel();
		textField9 = new JTextField();
		label14 = new JLabel();
		textField10 = new JTextField();
		label15 = new JLabel();
		textField11 = new JTextField();
		label16 = new JLabel();
		textField12 = new JTextField();
		label17 = new JLabel();
		textField13 = new JTextField();
		label18 = new JLabel();
		textField14 = new JTextField();
		label19 = new JLabel();
		textField15 = new JTextField();
		label20 = new JLabel();
		textField16 = new JTextField();
		button1 = new JButton();
		label21 = new JLabel();
		textField17 = new JTextField();
		label22 = new JLabel();
		textField18 = new JTextField();
		label23 = new JLabel();
		textField19 = new JTextField();
		label24 = new JLabel();
		button2 = new JButton();
		button3 = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== menuBar1 ========
		{
			menuBar1.setToolTipText("File");

			//======== menu1 ========
			{
				menu1.setText("File");

				//---- menuItem1 ----
				menuItem1.setText("Exit");
				menuItem1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						menuItem1ActionPerformed(e);
					}
				});
				menu1.add(menuItem1);
			}
			menuBar1.add(menu1);

			//======== menu2 ========
			{
				menu2.setText("Help");
				
				//---- menuItem2 ----
				menuItem2.setText("Get Help");
				menuItem2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						menuItem2ActionPerformed(e);
					}
				});
				menu2.add(menuItem2);
			}
			menuBar1.add(menu2);
		}
		setJMenuBar(menuBar1);

		//---- label1 ----
		label1.setText("Guest Information");
		label1.setFont(new Font("Tahoma", Font.ITALIC, 20));

		//---- label2 ----
		label2.setText("First Name");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label3 ----
		label3.setText("Last Name");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label4 ----
		label4.setText("Address");
		label4.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label5 ----
		label5.setText("Country");
		label5.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- comboBox1 ----
		comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
			"--------",
			"Afghanistan",
			"Albania",
			"Algeria",
			"Andorra",
			"Angola",
			"Antigua & Barbuda",
			"Argentina",
			"Armenia",
			"Australia",
			"Austria",
			"Azerbaijan",
			"Bahamas",
			"Bahrain",
			"Bangladesh",
			"Barbados",
			"Belarus",
			"Belgium",
			"Belize",
			"Benin",
			"Bhutan",
			"Bolivia",
			"Bosnia & Herzegovina",
			"Botswana",
			"Brazil",
			"Brunei",
			"Bulgaria",
			"Burkina Faso",
			"Burundi"
		}));

		//---- label6 ----
		label6.setText("Religion");
		label6.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label7 ----
		label7.setText("Identification Info.");
		label7.setFont(new Font("Tahoma", Font.ITALIC, 20));

		//---- label8 ----
		label8.setText("National ID No.");
		label8.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label9 ----
		label9.setText("Rate Information");
		label9.setFont(new Font("Tahoma", Font.ITALIC, 20));

		//---- label10 ----
		label10.setText("Room No.");
		label10.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label11 ----
		label11.setText("Date In");
		label11.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label12 ----
		label12.setText("Date Out");
		label12.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label13 ----
		label13.setText("No. of Days");
		label13.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label14 ----
		label14.setText("No. of Adults");
		label14.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label15 ----
		label15.setText("No. of Childrens");
		label15.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label16 ----
		label16.setText("Notes :");
		label16.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- textField12 ----
		textField12.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label17 ----
		label17.setText("Rate Per Room");
		label17.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label18 ----
		label18.setText("Service Charges");
		label18.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label19 ----
		label19.setText("Other Charges");
		label19.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label20 ----
		label20.setText("Discount");
		label20.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- button1 ----
		button1.setText("Calculate Bill");
		button1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button1ActionPerformed(e);
			}
		});

		//---- label21 ----
		label21.setText("No. of Rooms");
		label21.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label22 ----
		label22.setText("Contact No.");
		label22.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label23 ----
		label23.setText("Amount Paid");
		label23.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- label24 ----
		label24.setText("%");
		label24.setFont(new Font("Tahoma", Font.PLAIN, 14));

		//---- button2 ----
		button2.setText("View");
		button2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button2ActionPerformed(e);
			}
		});

		//---- button3 ----
		button3.setText("New Window");
		button3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button3ActionPerformed(e);
			}
		});

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGap(18, 18, 18)
					.addComponent(button2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
					.addComponent(button3)
					.addGap(32, 32, 32)
					.addComponent(button1)
					.addGap(27, 27, 27))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(31, 31, 31)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(label22)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(textField18))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label3)
								.addComponent(label6)
								.addComponent(label5)
								.addComponent(label4))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(textField3, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
								.addComponent(textField4, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addGap(0, 27, Short.MAX_VALUE))
								.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label1)
								.addComponent(label7))
							.addGap(0, 39, Short.MAX_VALUE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(label8)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(textField5, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(label2)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
					.addGap(132, 132, 132)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addGroup(contentPaneLayout.createSequentialGroup()
								.addGroup(contentPaneLayout.createParallelGroup()
									.addComponent(label10)
									.addComponent(label11))
								.addGap(38, 38, 38)
								.addGroup(contentPaneLayout.createParallelGroup()
									.addComponent(textField6, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
									.addComponent(textField7)))
							.addGroup(contentPaneLayout.createSequentialGroup()
								.addGroup(contentPaneLayout.createParallelGroup()
									.addComponent(label13)
									.addGroup(contentPaneLayout.createSequentialGroup()
										.addGroup(contentPaneLayout.createParallelGroup()
											.addGroup(contentPaneLayout.createSequentialGroup()
												.addComponent(label14)
												.addGap(22, 22, 22))
											.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
												.addComponent(label15)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
										.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
											.addComponent(textField9, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
											.addComponent(textField10, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
											.addComponent(textField11))))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addComponent(label9)
						.addComponent(label16)
						.addComponent(textField12, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
					.addGap(91, 91, 91)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label12)
								.addComponent(label17)
								.addComponent(label21))
							.addGap(24, 24, 24)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(textField17)
								.addComponent(textField13)
								.addComponent(textField8)))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createParallelGroup()
									.addGroup(contentPaneLayout.createSequentialGroup()
										.addGroup(contentPaneLayout.createParallelGroup()
											.addComponent(label18)
											.addComponent(label20))
										.addGap(10, 10, 10))
									.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
										.addComponent(label19)
										.addGap(18, 18, 18)))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label23)
									.addGap(30, 30, 30)))
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(textField14)
								.addComponent(textField15, GroupLayout.Alignment.TRAILING)
								.addComponent(textField19)
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(textField16, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(label24)
									.addGap(0, 1, Short.MAX_VALUE)))))
					.addContainerGap())
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(27, 27, 27)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1)
						.addComponent(label9))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label2)
						.addComponent(label10)
						.addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label21)
						.addComponent(textField17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label3)
						.addComponent(label11)
						.addComponent(label12)
						.addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label13)
							.addComponent(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label17)
							.addComponent(textField13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label4)
						.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label14)
							.addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label18)
							.addComponent(textField14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label22)
							.addComponent(textField18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGap(11, 11, 11)
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(label15)
										.addComponent(textField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18, 18, 18)
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(label16)
										.addComponent(label6)
										.addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGap(6, 6, 6)
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(label19)
										.addComponent(textField15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(textField12, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(label20)
										.addComponent(textField16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label24))
									.addGap(18, 18, 18)
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(label23)
										.addComponent(textField19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(button1)
								.addComponent(button2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(button3))
							.addGap(25, 25, 25))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label5)
								.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(62, 62, 62)
							.addComponent(label7)
							.addGap(18, 18, 18)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label8)
								.addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		pack();
		setLocationRelativeTo(getOwner());
		
	}

	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JMenu menu2;
	private JMenuItem menuItem2;
	private JLabel label1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JTextField textField2;
	private JLabel label4;
	private JTextField textField3;
	private JLabel label5;
	private JComboBox<String> comboBox1;
	private JLabel label6;
	private JTextField textField4;
	private JLabel label7;
	private JLabel label8;
	private JTextField textField5;
	private JLabel label9;
	private JLabel label10;
	private JTextField textField6;
	private JLabel label11;
	private JTextField textField7;
	private JLabel label12;
	private JTextField textField8;
	private JLabel label13;
	private JTextField textField9;
	private JLabel label14;
	private JTextField textField10;
	private JLabel label15;
	private JTextField textField11;
	private JLabel label16;
	private JTextField textField12;
	private JLabel label17;
	private JTextField textField13;
	private JLabel label18;
	private JTextField textField14;
	private JLabel label19;
	private JTextField textField15;
	private JLabel label20;
	private JTextField textField16;
	private JButton button1;
	private JLabel label21;
	private JTextField textField17;
	private JLabel label22;
	private JTextField textField18;
	private JLabel label23;
	private JTextField textField19;
	private JLabel label24;
	private JButton button2;
	private JButton button3;
	
	private void button1ActionPerformed(ActionEvent e) {

		if(e.getSource() == button1){
			String str=textField19.getText();
			double z=Double.parseDouble(str);
			
			JOptionPane.showMessageDialog(null,"Discount   "+ discount()+" Taka" +"\n\n" +"Sub Total   "+bill() +" Taka" 
                    +"\n\n"+"Amount Paid   " +z+" Taka" +"\n\n"+"Total   " 
	                   +totalBill() +" Taka" +"\n\n", "Billing Information",JOptionPane.PLAIN_MESSAGE);
			
		}
	}

	private void button2ActionPerformed(ActionEvent e) {
		if(e.getSource()==button2){
			
			viewMessage();
		}
		
	}
	private void menuItem1ActionPerformed(ActionEvent e) {
		if(e.getSource()==menuItem1){
			System.exit(NORMAL);
		}
	
	}

	private void menuItem2ActionPerformed(ActionEvent e) {
		if(e.getSource() == menuItem2){
			JOptionPane.showMessageDialog(null, "Contact : sarfaraz.ahmed007007@gmail.com ","Help",JOptionPane.PLAIN_MESSAGE);
		}
	}

	

	private void button3ActionPerformed(ActionEvent e) {
			if(e.getSource() == button3){
            
				newWindow();
		}
		
	}
	
	public void newWindow(){
		textField1.setText(null);
        textField2.setText(null);
        textField3.setText(null);
        textField4.setText(null);
        textField5.setText(null);
        textField6.setText(null);
        textField7.setText(null);
        textField8.setText(null);
        textField9.setText(null);
        textField10.setText(null);
        textField11.setText(null);
        textField12.setText(null);
        textField13.setText(null);
        textField14.setText(null);
        textField15.setText(null);
        textField16.setText(null);
        textField17.setText(null);
        textField18.setText(null);
        textField19.setText(null);
		
	}
	
	  public void viewMessage(){
		  String str1=textField1.getText();
		  String str2=textField2.getText();
		  String str3=textField3.getText();
		  String str4=textField18.getText();
		  String str5=comboBox1.getName();
		  String str6=textField4.getText();
		  String str7=textField5.getText();
		  String str8=textField6.getText();
		  String str9=textField7.getText();
		  String str10=textField8.getText();
		  String str11=textField9.getText();
		  String str12=textField10.getText();
		  String str13=textField11.getText();
		  String str14=textField17.getText();
		  String str15=textField12.getText();
		  String str16=textField13.getText();
		  String str17=textField14.getText();
		  String str18=textField15.getText();
		  String str19=textField16.getText();
		  String str20=textField19.getText();
		  
		  JOptionPane.showMessageDialog(null, "First Name: " +str1 + "\n" + "Last Name: "+ str2+"\n"
		  + "Address : " +str3 + "\n"+ "Contact Number : "+str4 +"\n"+"Country : Bangladesh"+"\n" + "Religion : "+str6 
		  + "\n"+"National ID No. : "+str7 +"\n"+"Room No. : "+str8+"\n" + "Date In : "+str9 + "\n"
		  +"Date Out : "+str10+"\n"+"No. of Days : "+ str11+"\n" +"No. of Adults : "+ str12 + "\n"+"No. of Childrens : "+ str13 +"\n"
		  +"No. of Rooms: "+ str14+"\n" + "Notes : "+str15 + "\n"
		  +"Rate Per Room : "+ str16 +"\n"+ "Service Charges : "+str17+"\n" 
		  + "Other Charges : "+ str18 + "\n"+"Discount : " +str19 +" %"
		  +"\n"+"Amount Paid : "+ str20+"\n", "View Information",JOptionPane.PLAIN_MESSAGE) ;
		  
		  
	  }
	
	  public double discount(){
	    	String str1=textField16.getText();
	    	double dis=((Double.parseDouble(str1)*bill())/100);
	    	return dis;
	    	
	    }
		
	    public double bill(){
	    	String str1=textField9.getText();
	    	String str2=textField17.getText();
	    	String str3=textField13.getText();
	    	String str4=textField14.getText();
	    	String str5=textField15.getText();
	    	
	    	double bill=((Double.parseDouble(str1)*Double.parseDouble(str2)*Double.parseDouble(str3))
	    			                   +(Double.parseDouble(str4)+Double.parseDouble(str5)));
	    	return bill;
	    }
	    public double totalBill(){
	    	double t1_bill=bill()-discount();
	    	String str=textField19.getText();
	    	double t2_bill=t1_bill-Double.parseDouble(str);
	    	return t2_bill;
	    }
	
	public static void main(String[] args) {
		
		Hotel frame = new Hotel();
		frame.setTitle("MINI HOTEL MANAGER");
		
		
		frame.setVisible(true);
		
	}
	
}
