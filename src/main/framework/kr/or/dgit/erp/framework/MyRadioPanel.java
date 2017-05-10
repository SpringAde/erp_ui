package kr.or.dgit.erp.framework;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.Component;
import java.awt.GridLayout;

public class MyRadioPanel extends MyCompPanel {
	
	private ButtonGroup radioGroup = new ButtonGroup();

	public MyRadioPanel() {
		pValue.setLayout(new GridLayout(1, 0, 0, 0));
	}
	
	//라디오 버튼 항목 추가
	public void setAddItems(String...items){
		for (int i=0; i<items.length; i++){
			JRadioButton rdBtn = new JRadioButton(items[i]);
			radioGroup.add(rdBtn);
			pValue.add(rdBtn);
		}
	}	
	
	public void setSelectedItem(String item){
		JRadioButton btn = null;
		for (Component c : pValue.getComponents()){
			btn = (JRadioButton)c;
			if(btn.getText().equals(item)){
				btn.setSelected(true);
			}
		}
	}
	
	public void setSelectedIndex(int idx){
		((JRadioButton)pValue.getComponent(idx)).setSelected(true);
	}
	
	public String getSelectedItem(){
		JRadioButton btn = null;
		for(Component c : pValue.getComponents()){
			btn = (JRadioButton) c;
			if(btn.isSelected()){
				return btn.getText();
			}
		}
		return null;
	}
}
