package kr.or.dgit.erp.framework;

import java.awt.GridLayout;
import javax.swing.JTextField;

public class MyTextFieldPanel extends MyCompPanel {
	private JTextField textField;

	public MyTextFieldPanel() {
		pValue.setLayout(new GridLayout(1, 0, 0, 0));		
		textField = new JTextField();
		pValue.add(textField);
	}

	public void setTfValue(String value){
		textField.setText(value);
	}
	
	public String getTfValue(){
		return textField.getText().trim();
	}	
	
	public JTextField getTextField() {
		return textField;
	}
	
	//공백체크
	public boolean isEmptyCheck(){
		Boolean result = false;
		if (textField.getText().equals("")){
			textField.requestFocus();
			result = true;			
		}
		return result;
	}	

}
