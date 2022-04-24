package blood_bank_management_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.View;

import com.sun.java.swing.plaf.windows.TMSchema.Control;
import com.sun.tools.classfile.Opcode.Set;
import com.sun.tools.javap.TryBlockWriter;

import jdk.javadoc.internal.doclets.toolkit.util.VisibleMemberCache;
import jdk.javadoc.internal.doclets.toolkit.util.VisibleMemberTable;
import sun.jvm.hotspot.ui.action.ShowAction;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.beans.Visibility;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 619, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(183, 128, 99, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(183, 184, 89, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField1 = new JTextField();
		textField1.setBackground(new Color(224, 255, 255));
		textField1.setForeground(new Color(0, 0, 0));
		textField1.setBounds(324, 130, 233, 34);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBackground(new Color(224, 255, 255));
		textField2.setBounds(324, 186, 233, 34);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
  if (textField1.getText().equals("Istiak") && textField2.getText().equals("admin"))
 {           frame.setVisible(false);   
	new homepage().frame.setVisible(true);
	}
	else {
		JOptionPane.showConfirmDialog(null,"Incorrect username or password");
	}
	
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(login.class.getResource("/Icons/login.png")));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewButton_1.setBounds(225, 261, 119, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =JOptionPane.showConfirmDialog(null, "Do you really want to close application","Select",JOptionPane.YES_NO_OPTION);
				if (a==0)
					System.exit(0);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(login.class.getResource("/Icons/Exit application.png")));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewButton_2.setBounds(434, 261, 138, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(login.class.getResource("/Icons/blood-640x360.png")));
		lblNewLabel_2.setBounds(-15, -69, 742, 498);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
