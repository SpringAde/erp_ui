package kr.or.dgit.erp.appMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SettingUI extends JFrame {
	private JButton btnInit;
	private JButton btnBackup;
	private JButton btnRestore;

	public SettingUI() {
		setTitle("DB관리메뉴");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 485, 115);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 20, 0));
		
		btnInit = new JButton("초기화");
		contentPane.add(btnInit);
		
		btnBackup = new JButton("백업");
		contentPane.add(btnBackup);
		
		btnRestore = new JButton("복원");
		contentPane.add(btnRestore);
	}
	
}
