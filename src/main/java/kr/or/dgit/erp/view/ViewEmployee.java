package kr.or.dgit.erp.view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.erp.content.ContentEmployee;
import kr.or.dgit.erp.table.TableEmployee;

public class ViewEmployee extends JFrame {
	private JPanel contentPane;

	public ViewEmployee() {
		setTitle("사원 관리");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 300, 700, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		setContentPane(contentPane);
		
		//컨텐트 삽입
		ContentEmployee emp = new ContentEmployee();
		emp.setBorder(new EmptyBorder(10, 100, 10, 100));
		contentPane.add(emp);
		
		//버튼 삽입
		JPanel pBtn = new JPanel();
		JButton btnSave = new JButton("추가");
		JButton btnReset = new JButton("취소");
		pBtn.add(btnSave);
		pBtn.add(btnReset);
		contentPane.add(pBtn);
		
		//테이블 삽입
		TableEmployee empTable = new TableEmployee();
		contentPane.add(empTable);		
	}
	
}
