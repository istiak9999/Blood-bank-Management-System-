package blood_bank_management_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class homepage {

	JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
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
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setMaximumSize(new Dimension(100000000, 70000000));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(homepage.class.getResource("/Icons/home.png")));
		lblNewLabel.setBounds(-287, 0, 1271, 505);
		frame.getContentPane().add(lblNewLabel);
		frame.setMaximumSize(new Dimension(1300, 700));
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 800, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Doner");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 16));
		mnNewMenu.setIcon(new ImageIcon(homepage.class.getResource("/Icons/Donor.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Add New Doner");
		mntmNewMenuItem_1.setIcon(new ImageIcon(homepage.class.getResource("/Icons/Add new.png")));
		mntmNewMenuItem_1.setMargin(new Insets(0, 0, 0, 0));
		mntmNewMenuItem_1.setPreferredSize(new Dimension(60, 30));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new add_doner().frame.setVisible(true);
			    
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Update Doner Information");
		mntmNewMenuItem_6.setIcon(new ImageIcon(homepage.class.getResource("/Icons/Update details.png")));
		mntmNewMenuItem_6.setMargin(new Insets(0, 0, 0, 0));
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("View Doner List");
		mntmNewMenuItem_5.setIcon(new ImageIcon(homepage.class.getResource("/Icons/Details.png")));
		mntmNewMenuItem_5.setMargin(new Insets(0, 0, 0, 0));
		mntmNewMenuItem_5.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_1 = new JMenu("Search");
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		mnNewMenu_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		mnNewMenu_1.setIcon(new ImageIcon(homepage.class.getResource("/Icons/search user.png")));
		mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Location");
		mntmNewMenuItem_2.setIcon(new ImageIcon(homepage.class.getResource("/Icons/Location.png")));
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_1.add(separator_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Blood Group");
		mntmNewMenuItem_3.setIcon(new ImageIcon(homepage.class.getResource("/Icons/Blood group.png")));
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Delet Doner Info");
		mnNewMenu_2.setFont(new Font("Arial", Font.PLAIN, 16));
		mnNewMenu_2.setForeground(new Color(0, 0, 0));
		mnNewMenu_2.setIcon(new ImageIcon(homepage.class.getResource("/Icons/delete donor.png")));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_3 = new JMenu("Exit");
		mnNewMenu_3.setForeground(new Color(0, 0, 0));
		mnNewMenu_3.setFont(new Font("Arial", Font.PLAIN, 16));
		mnNewMenu_3.setIcon(new ImageIcon(homepage.class.getResource("/Icons/exit.png")));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Logout");
		mntmNewMenuItem_4.setIcon(new ImageIcon(homepage.class.getResource("/Icons/Logout.png")));
		mntmNewMenuItem_4.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_3.add(separator_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit Application");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(homepage.class.getResource("/Icons/Exit application.png")));
		mnNewMenu_3.add(mntmNewMenuItem);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
