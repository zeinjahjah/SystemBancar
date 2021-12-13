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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Zen jah
 */
public class Transfer extends JFrame {

	/**
	 * Creates new form 'Transfer'.
	 */

	public Transfer() {
		initComponents();

	}

	/**
	 * Constructor class Transfer.
	 * 
	 * @param role2				user/admin
	 * @param customer_id2		customer id
	 * @param customer_name2	customer name
	 */
	public Transfer(String role2, String customer_id2, String customer_name2) {
		initComponents();
		this.role = role2;
		this.customer_id = customer_id2;
		this.customer_name = customer_name2;
	}
	

	/**
	 * This method is called from within the constructor to initialize the form. The
	 * content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		toano = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		fano = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		txtamount = new javax.swing.JTextField();
		txtbal = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();

		setPreferredSize(new java.awt.Dimension(700, 351));
		getContentPane().setLayout(null);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

		jLabel1.setText("Balance");

		jLabel2.setText("To  Account No");

		jLabel7.setText("From Account No");

		jLabel5.setText("Amount");

		txtbal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtbalActionPerformed(evt);
			}
		});

		jButton3.setText("Transfer");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton2.setText("Find");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton4.setText("Cancel");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addGap(152, 152, 152).addComponent(
												txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 209,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addGap(32, 32, 32).addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel2).addComponent(jLabel1))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(txtbal,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 207,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(toano,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 209,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(fano, javax.swing.GroupLayout.PREFERRED_SIZE, 209,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(2, 2, 2)))))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(41, 41, 41).addComponent(jLabel5)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
						.addContainerGap(44, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(fano, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7).addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE,
										40, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(36, 36, 36)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1).addComponent(txtbal,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(29, 29, 29)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2).addComponent(toano,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30).addComponent(
												jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(24, 24, 24)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5).addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
										45, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(82, Short.MAX_VALUE)));

		getContentPane().add(jPanel1);
		jPanel1.setBounds(17, 55, 530, 330);

		homeButton = new JButton("Home");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeButtonActionPerformed(e);

			}
		});
		homeButton.setForeground(Color.BLACK);
		homeButton.setBackground(new Color(51, 153, 102));
		homeButton.setBounds(402, 6, 81, 37);
		getContentPane().add(homeButton);

		pack();
	}

	/**
	 * Find button functionality for this account id
	 * 
	 * @param evt ActionEvent when clicking on find button
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String accno = fano.getText();

		try {
			DB_Connector connector = new DB_Connector();
			con1 = connector.getConnection();

			insert = con1.prepareStatement(
					"select balance from customer,account where customer.cust_id = account.cust_id and account.acc_id = ?");
			insert.setString(1, accno);
			rs1 = insert.executeQuery();

			if (rs1.next() == false) {
				JOptionPane.showMessageDialog(null, "Account No no found");

			}

			else {

				String balance = rs1.getString(1);
				txtbal.setText(balance.trim());

			}

		} catch (SQLException ex) {
			System.out.println("Failed " + ex);
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
	 * Transfer button functionality which transfer money to another account
	 * 
	 * @param evt ActionEvent when clicking on find button
	 */
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String faccno = fano.getText();
			String taccno = toano.getText();

			Double balance = Double.parseDouble(txtbal.getText());
			Double amount = Double.parseDouble(txtamount.getText().trim());

			if (amount <= balance) {
				DB_Connector connector = new DB_Connector();
				con1 = connector.getConnection();

				PreparedStatement st1 = con1.prepareStatement("update account set balance=balance-? where acc_id=?");
				st1.setDouble(1, amount);
				st1.setString(2, faccno);
				st1.executeUpdate();

				PreparedStatement st2 = con1.prepareStatement("update account set balance=balance+? where acc_id=?");
				st2.setDouble(1, amount);
				st2.setString(2, taccno);
				st2.executeUpdate();

				PreparedStatement st3 = con1
						.prepareStatement("insert into transfer(f_account,to_account,amount, date) values(?,?,?,?)");
				st3.setString(1, faccno);
				st3.setString(2, taccno);
				st3.setDouble(3, amount);
				st3.setString(4, date());
				st3.executeUpdate();
				JOptionPane.showMessageDialog(this, "Amount Transfer...!!!!!!!");

				fano.setText("");
				toano.setText("");
				txtamount.setText("");
				txtbal.setText("");

			} else {
				JOptionPane.showMessageDialog(this, "Not enough balance");
				txtamount.setText("");
			}

		} catch (SQLException ex) {
			ex.printStackTrace(System.err);
			try {
				con1.rollback();
				JOptionPane.showMessageDialog(this, "Transanction Failed");

			} catch (SQLException ex1) {
				Logger.getLogger(Transfer.class.getName()).log(Level.SEVERE, null, ex1);
			}
		}

	}

	private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {
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
	 * 
	 * Display 'Date'
	 * 
	 */
	public String date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);

		return date;

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
	private javax.swing.JTextField fano;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton homeButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField toano;
	private javax.swing.JTextField txtamount;
	private javax.swing.JTextField txtbal;
	private String role = "user";
	private String customer_id;
	private String customer_name;
	private Connection con1;
	private PreparedStatement insert;
	private ResultSet rs1;
	// End of variables declaration
}
