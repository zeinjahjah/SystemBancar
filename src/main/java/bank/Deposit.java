
package bank;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Zen jah
 */
public class Deposit extends JFrame {

	/**
	 * constructori class Deposit
	 * 
	 */
	public Deposit() {
		initComponents();
		date();
	}

	/**
	 * 
	 * @param role2
	 * @param customer_id2
	 * @param customer_name2
	 */

	public Deposit(String role2, String customer_id2, String customer_name2) {

		initComponents();
		date();
		this.role = role;
		this.customer_id = customer_id2;
		this.customer_name = customer_name2;
	}

	Connection con1;
	PreparedStatement insert;
	PreparedStatement insert2;
	ResultSet rs1;

	/**
	 * This method is called from within the constructor to initialize the form. The
	 * content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")

	private void initComponents() {

		jButton3 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		lbal = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtaccno = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		txtfname = new javax.swing.JTextField();
		txtlame = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		amount = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();

		jButton3.setText("Cancel");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel9.setText("Customer ID");

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel4.setText("Balance");

		lbal.setFont(new java.awt.Font("Tahoma", 1, 24));
		lbal.setForeground(new java.awt.Color(0, 51, 204));
		lbal.setText("Balance");

		jLabel2.setText("Firstname");

		jLabel3.setText("Lastname");

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Account No"));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLabel1.setText("Enter the Acccount No");

		jButton1.setText("Find");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43)
												.addComponent(jLabel1))
										.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(
												txtaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 239,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 12, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE).addComponent(jButton1)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addGap(18, 18, 18)
						.addComponent(txtaccno, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
						.addComponent(jButton1)));

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel5.setText("Deposit");

		amount.setBackground(new java.awt.Color(172, 3, 3));
		amount.setFont(new java.awt.Font("Tahoma", 1, 24));
		amount.setForeground(new java.awt.Color(255, 255, 255));

		jButton2.setText("OK");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLabel6.setText("jLabel6");

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLabel7.setText("jLabel7");

		jButton4.setText("Cancel");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel10.setText("Customer ID");

		jLabel11.setText("Date");

		homeButton = new JButton("Home");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeButtonActionPerformed(e);
			}
		});
		homeButton.setForeground(Color.BLACK);
		homeButton.setBackground(new Color(51, 153, 102));
		
		lblCurrency = new JLabel();
		lblCurrency.setText("Currency");
		
		lblNewLabel = new JLabel("");
		
		lblNewLabel_1 = new JLabel("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
							.addGap(36)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addComponent(jLabel10)
									.addGap(18)
									.addComponent(jLabel7))
								.addGroup(layout.createSequentialGroup()
									.addComponent(jLabel2)
									.addGap(18)
									.addComponent(txtfname, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
									.addGap(78)
									.addComponent(lblNewLabel))
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblCurrency, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18)
									.addComponent(txtlame, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)))))
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addGap(82)
									.addComponent(jLabel4)
									.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
									.addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
									.addGap(120)
									.addComponent(jLabel5))
								.addGroup(layout.createSequentialGroup()
									.addGap(60)
									.addComponent(lbal)
									.addGap(18)
									.addComponent(lblNewLabel_1)))
							.addContainerGap())
						.addGroup(layout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
							.addComponent(amount, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addGap(67))))
				.addGroup(layout.createSequentialGroup()
					.addGap(40)
					.addComponent(jLabel11)
					.addGap(47)
					.addComponent(jLabel6)
					.addPreferredGap(ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(17))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
									.addGap(17)
									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4))
									.addGap(34)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lbal)
										.addComponent(lblNewLabel_1))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel7)
								.addComponent(jLabel10))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(layout.createSequentialGroup()
							.addComponent(jLabel5)
							.addGap(14)))
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(amount, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
							.addGap(18)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtfname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel3)
						.addComponent(txtlame, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurrency)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel11))
					.addGap(28))
		);
		getContentPane().setLayout(layout);

		pack();
	}

	/**
	 * Set an account by account ID
	 * 
	 * @param data1 account Id
	 */
	public void setTxtuser(String data1) {

		txtaccno.setText(data1);

	}

	/**
	 * Find button functionality
	 * 
	 * @param evt ActionEvent when clicking on find button
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		String accno = txtaccno.getText();
//		String result121 ="";

		try {
			DB_Connector connector = new DB_Connector();
			con1 = connector.getConnection();

			insert = con1.prepareStatement(
					"select c.cust_id,c.firstname,c.lastname,a.balance, a.acc_type from customer c,account a where c.cust_id = a.cust_id and a.acc_id = ? and c.cust_id=?");
			insert.setString(1, accno);
			insert.setString(2, this.customer_id);
			rs1 = insert.executeQuery();

			if (rs1.next() == false) {
//				String result121 ="";
				JOptionPane.showMessageDialog(null, "Account No no found");
				txtfname.setText("");
				txtlame.setText("");
				lbal.setText("");

			}

			else {
//				String result121 ="";
				String id = rs1.getString(1);
				String firstname = rs1.getString(2);
				String laststname = rs1.getString(3);
				String balance = rs1.getString(4);
				String type = rs1.getString(5);

				jLabel7.setText(id.trim());
				txtfname.setText(firstname.trim());
				txtlame.setText(laststname.trim());
				lblNewLabel.setText(type.trim());
				lbal.setText(balance.trim());
				lblNewLabel_1.setText(type.trim());

			}

		} catch (SQLException ex) {
			Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
		}
//		return result121;

	}

	/**
	 * 
	 * Display today's 'Date'
	 * 
	 */
	public void date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);

		jLabel6.setText(date);

	}

	/**
	 * 'Ok' button functionality and add deposit number to assigned account.
	 * 
	 * @param evt ActionEvent when clicking on add button
	 * 
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			con1.setAutoCommit(false);
			String accno = txtaccno.getText();
			String cust_id = jLabel7.getText();
			String date = jLabel6.getText();
			String balance = lbal.getText();
			String amount1 = amount.getText();
			String finalAmount = Double.toString(Double.parseDouble(balance) + Double.parseDouble(amount1)); 
			
			
			DB_Connector connector = new DB_Connector();
			con1 = connector.getConnection();

			con1.setAutoCommit(false);
			String queryco1 = "Insert into deposit(acc_id,cust_id,date,balance,deposit)values(?,?,?,?,?)";
			insert = con1.prepareStatement(queryco1);
			insert.setString(1, accno);
			insert.setString(2, cust_id);
			insert.setString(3, date);
			insert.setString(4, balance);
			insert.setString(5, amount1);
			insert.executeUpdate();

			String sqlupdate = "update Account set balance= balance+ ? where acc_id=? ";
			insert2 = con1.prepareStatement(sqlupdate);
			insert2.setString(1, amount1);
			insert2.setString(2, accno);

			insert2.executeUpdate();
			lbal.setText(finalAmount);
			amount.setText("");
			JOptionPane.showMessageDialog(null, "Amount Deposited...!!!!");
			con1.commit();

		}

		catch (SQLException ex) {
			try {
				Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
				con1.rollback();
			} catch (SQLException ex1) {
				Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex1);
			}

		}

	}

	/**
	 * 'Home' button functionality which returns to the main page.
	 * 
	 * @param evt ActionEvent when clicking on Home button
	 */
	private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {

		MainMenu c = new MainMenu(this.role, this.customer_id, this.customer_name);
		c.permissions(this.role);
		this.hide();
		c.setVisible(true);

	}

	/**
	 * 'Cancel' button functionality which returns to the main page.
	 * 
	 * @param evt ActionEvent when clicking on Cancel button
	 */

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		dispose();
	}

	/**
	 * 'Cancel' button functionality which returns to the main page.
	 * 
	 * @param evt ActionEvent when clicking on Cancel button
	 */
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

		setVisible(false);
		dispose();
	}

	/**
	 * Set Account permissions
	 * 
	 * @param role use or admin, could be determinated after login
	 */
	public void permissions(String role) {
		this.role = role;
		if (role.contentEquals("admin")) {

			homeButton.setVisible(false);
		} else {
			homeButton.setVisible(true);

		}

	}

	/**
	 * Variables declaration
	 */
	private javax.swing.JTextField amount;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton homeButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel lbal;
	private javax.swing.JTextField txtaccno;
	private javax.swing.JTextField txtfname;
	private javax.swing.JTextField txtlame;
	private String role = "user";
	private String customer_id;
	private String customer_name;
	private JLabel lblCurrency;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
}
