package kr.or.dgit.erp.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.erp.content.ContentDepartment;
import kr.or.dgit.erp.content.ContentTitle;
import kr.or.dgit.erp.table.TableDepartment;
import kr.or.dgit.erp.table.TableTitle;

public class ViewTitle extends JFrame {
	private JPanel contentPane;

	public ViewTitle() {
		setTitle("직책 관리");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(1100, 400, 300, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		setContentPane(contentPane);
		
		//컨텐트 삽입
		ContentTitle title = new ContentTitle();
		title.setBorder(new EmptyBorder(10, 20, 10, 20));
		contentPane.add(title);
		
		//버튼 삽입
		JPanel pBtn = new JPanel();
		JButton btnSave = new JButton("추가");
		JButton btnReset = new JButton("취소");
		pBtn.add(btnSave);
		pBtn.add(btnReset);
		contentPane.add(pBtn);
		
		//테이블 삽입
		TableTitle titleTable = new TableTitle();
		contentPane.add(titleTable);
	}

}
