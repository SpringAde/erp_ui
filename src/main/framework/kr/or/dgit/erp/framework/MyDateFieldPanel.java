package kr.or.dgit.erp.framework;

import java.awt.GridLayout;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class MyDateFieldPanel extends MyCompPanel {
	
	private JFormattedTextField dateField;
	private MaskFormatter maskFormatter;

	public MyDateFieldPanel() {
		pValue.setLayout(new GridLayout(0, 1, 0, 0));
		maskFormatter = new MaskFormatter();
		
		dateField = new JFormattedTextField(maskFormatter);		
		pValue.add(dateField);		
	}
	
	public void setMaskPattern(String pattern, char placeHolder){
		try {
			maskFormatter.setMask(pattern);
			maskFormatter.setPlaceholderCharacter(placeHolder);
		} catch (ParseException e) {
			e.printStackTrace();			
		}
	}

	public String getTfValue(){
		return dateField.getText();
	}
	
	public void setTfVAlue(String value){
		dateField.setValue(value);
	}

	public boolean isEmpty(){
		if(dateField.getText().equals("")){
			dateField.requestFocus();
			return true;
		}
		return false;
	}	

}
