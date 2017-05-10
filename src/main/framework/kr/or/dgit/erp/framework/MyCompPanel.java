package kr.or.dgit.erp.framework;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class MyCompPanel extends JPanel {

	private JLabel lblTitle;
	protected JPanel pValue;

	public MyCompPanel() {
		setLayout(new GridLayout(0, 2, 20, 0));
		
		lblTitle = new JLabel("타이틀을 작성하세요");
		lblTitle.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblTitle);
		
		pValue = new JPanel();
		add(pValue);
		pValue.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
	}
	
	//타이틀변경
	public void setTitle(String title) {
		lblTitle.setText(title);
	}

	//패널에 있는 값 가져오기
	public JPanel getpValue() {
		return pValue;
	}	

}
