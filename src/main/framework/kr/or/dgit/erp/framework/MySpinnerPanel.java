package kr.or.dgit.erp.framework;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.GridLayout;

public class MySpinnerPanel extends MyCompPanel {

	private JSpinner spinner;

	public MySpinnerPanel() {
		pValue.setLayout(new GridLayout(0, 1, 0, 0));		
		spinner = new JSpinner();
		pValue.add(spinner);
	}
	
	//기본값, 최소값, 최대값, 간격크기
	public void setValues(double value, double minimum, double maximum, double stepSize){
		spinner.setModel(new SpinnerNumberModel(value, minimum, maximum, stepSize));
	}
	
	public double getValue(){
		return (double)spinner.getValue();
	}
	
	public void setValue(double value){
		spinner.setValue(value);
	}

}
