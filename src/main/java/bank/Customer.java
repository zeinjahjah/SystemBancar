package bank;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author Zen jah
 * 
 */
public class Customer extends JFrame {

	/**
	 * Constructor class  'Customer'.
	 */
	public Customer() {
		initComponents();
		autoId();

	}

	Connection con1;
	PreparedStatement insert;

	/**
	 * This method is called from within the constructor to initialize the form. The
	 * content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		txtstreet = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txtcity = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		txtmobile = new javax.swing.JTextField();
		txtfname = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		txtlname = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer"));

		jLabel3.setText("Address");

		jLabel4.setText("City");

		jLabel6.setText("Mobile");

		jLabel1.setText("First Name");

		jLabel2.setText("Last Name");

		jLabel7.setText("Customer No");

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20));
		jLabel8.setForeground(new java.awt.Color(0, 102, 255));
		jLabel8.setText("jLabel8");

		jButton1.setText("Add");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Cancel");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		lblEmail = new JLabel();
		lblEmail.setText("Email");

		lblUserName = new JLabel();
		lblUserName.setText("User Name");

		lblPassword = new JLabel();
		lblPassword.setText("Password");

		textMail = new JTextField();

		textUserName = new JTextField();

		textPassword = new JTextField();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(41)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel1)
								.addComponent(jLabel5).addComponent(jLabel7)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblUserName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(jLabel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGap(19)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(textPassword, GroupLayout.PREFERRED_SIZE, 262,
												GroupLayout.PREFERRED_SIZE)
										.addGap(168))
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
										.createSequentialGroup()
										.addComponent(textUserName, GroupLayout.PREFERRED_SIZE, 262,
												GroupLayout.PREFERRED_SIZE)
										.addGap(168))
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(textMail, GroupLayout.PREFERRED_SIZE, 262,
																GroupLayout.PREFERRED_SIZE)
														.addGap(168))
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(txtmobile, 262, 262, 262)
																.addContainerGap())
														.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(jLabel8)
																		.addContainerGap(349, Short.MAX_VALUE))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGroup(jPanel1Layout
																				.createParallelGroup(Alignment.LEADING)
																				.addGroup(jPanel1Layout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(jPanel1Layout
																								.createSequentialGroup()
																								.addGroup(jPanel1Layout
																										.createParallelGroup(
																												Alignment.TRAILING)
																										.addComponent(
																												txtlname,
																												Alignment.LEADING,
																												GroupLayout.DEFAULT_SIZE,
																												262,
																												Short.MAX_VALUE)
																										.addComponent(
																												txtfname,
																												Alignment.LEADING,
																												GroupLayout.PREFERRED_SIZE,
																												262,
																												GroupLayout.PREFERRED_SIZE))
																								.addGap(46))
																						.addGroup(jPanel1Layout
																								.createSequentialGroup()
																								.addComponent(txtstreet,
																										262, 262, 262)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(txtcity, 262, 262,
																								262)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)))
																		.addGroup(jPanel1Layout
																				.createParallelGroup(Alignment.LEADING,
																						false)
																				.addComponent(jButton1,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(jButton2,
																						GroupLayout.PREFERRED_SIZE, 85,
																						Short.MAX_VALUE))
																		.addGap(37)))))))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout
								.createParallelGroup(Alignment.BASELINE).addComponent(jLabel8).addComponent(jLabel7))
						.addGap(18)
						.addGroup(
								jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtfname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1))
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
								.createSequentialGroup().addGap(18)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2)
										.addComponent(txtlname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtstreet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtcity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4))
								.addGap(13)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(jLabel5)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(txtmobile, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(26)
										.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 49,
												GroupLayout.PREFERRED_SIZE)
										.addGap(4).addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 52,
												GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(lblEmail)
								.addComponent(textMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(lblUserName)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblPassword))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(textUserName, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(textPassword,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(27, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36));
		jLabel9.setText("Customer ");

		loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeButtonActionPerformed(e);
			}
		});
		loginButton.setBackground(new Color(51, 153, 102));
		loginButton.setForeground(new Color(0, 0, 0));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(29)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 578,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(layout.createSequentialGroup().addComponent(jLabel9)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(loginButton).addGap(33)))));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(11)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9)
								.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
						.addGap(22)));
		getContentPane().setLayout(layout);

		pack();
	}


	/**
	 * 'Login' button functionality.
	 * 
	 * @param evt ActionEvent when clicking on add button
	 */
	private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {

		Login c = new Login();
		this.hide();
		c.setVisible(true);

	}

	/**
	 * 'Add' button functionality which add new Customer to the assigned customer.
	 * 
	 * @param evt ActionEvent when clicking on add button
	 * 
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		addCustomer(false);
	}

	/**
	 * 'Cancel' button functionality which returns to the main page.
	 * 
	 * @param evt ActionEvent when clicking on Cancel button
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

		setVisible(false);
		dispose();

	}

	/**
	 * Add new new Customer
	 * 
	 * @param test test flag for unit test
	 * @return status of adding a new Customer
	 */
	public String addCustomer(Boolean test) {
		String result = "fail";
		try {
			String id = jLabel8.getText();
			String fname = txtfname.getText();
			String lname = txtlname.getText();
			String street = txtstreet.getText();
			String city = txtcity.getText();
			String mobile = txtmobile.getText();
			String mail = textMail.getText();
			String userName = textUserName.getText();
			String password = textPassword.getText();

			DB_Connector connector = new DB_Connector();
			con1 = connector.getConnection();
			insert = con1.prepareStatement(
					"insert into customer(cust_id, firstname, lastname, street, city, phone, mail) values (?,?,?,?,?,?,?)");
			insert.setString(1, id);
			insert.setString(2, fname);
			insert.setString(3, lname);
			insert.setString(4, street);
			insert.setString(5, city);
			insert.setString(6, mobile);
			insert.setString(7, mail);
			insert.executeUpdate();

			insert = con1.prepareStatement("insert into logins(username, password, whois, role) values (?,?,?,?)");
			insert.setString(1, userName);
			insert.setString(2, password);
			insert.setString(3, id);
			insert.setString(4, "user");
			insert.executeUpdate();
			if (!test) {
				JOptionPane.showMessageDialog(this, "Sucsessfully Saved");
			}
			autoId();
			result = "done";

			txtfname.setText("");
			txtlname.setText("");
			txtstreet.setText("");
			txtcity.setText("");
			txtmobile.setText("");
			textMail.setText("");
			textUserName.setText("");
			textPassword.setText("");

			// table_update();

		} catch (SQLException ex) {
			Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
		}

		return result;
	}

	public void permissions(String role) {

		this.role = role;
		if (this.role == "admin") {
			loginButton.setVisible(false);
		} else {
			loginButton.setVisible(true);
		}
	}

	/**
	 * Get the Max account ID + 1 for the new created account
	 * 
	 * @return the new ID for new account
	 */
	public String autoId() {
		String result = "";
		try {
			DB_Connector connector = new DB_Connector();
			con1 = connector.getConnection();
			Statement s = con1.createStatement();
			ResultSet rs = s.executeQuery("SELECT MAX(cust_id) FROM customer");
			rs.next();
			rs.getString("MAX(cust_id)");
			if (rs.getString("MAX(cust_id)") == null) {
				jLabel8.setText("CS001");
				result = "CS001";
			} else {
				long id = Long
						.parseLong(rs.getString("MAX(cust_id)").substring(2, rs.getString("MAX(cust_id)").length()));
				id++;
				jLabel8.setText("CS" + String.format("%03d", id));
				result = "CS" + String.format("%03d", id);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public String deleteCustomer(String id) {
		String result = "fail";
		try {
			DB_Connector connector = new DB_Connector();
			con1 = connector.getConnection();
			Statement s = con1.createStatement();
			s.executeUpdate("DELETE FROM customer where cust_id  = \"" + id + "\"");
			result = "done";
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	/**
	 * Set an account by account ID
	 * 
	 * @param data1 		Customer No
	 * @param data2 		First Name
	 * @param data3 		Last Name
	 * @param data4 		Address
	 * @param data5 		city
	 * @param data6 		Mobile
	 * @param data7 		Email
	 * @param data8 		User Name
	 * @param data9			Password

	 */
	public void setTxtuser(String data1, String data2, String data3, String data4, String data5, String data6,
			String data7, String data8, String data9) {
		jLabel8.setText(data1);
		txtfname.setText(data2);
		txtlname.setText(data3);
		txtstreet.setText(data4);
		txtcity.setText(data5);
		txtmobile.setText(data6);
		textMail.setText(data7);
		textUserName.setText(data8);
		textPassword.setText(data9);
	}

	/**
	 * Variables declaration
	 */
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton loginButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txtcity;
	private javax.swing.JTextField txtfname;
	private javax.swing.JTextField txtlname;
	private javax.swing.JTextField txtmobile;
	private javax.swing.JTextField txtstreet;
	private String role = "user";
	private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	private JLabel lblEmail;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JTextField textMail;
	private JTextField textUserName;
	private JTextField textPassword;
}
