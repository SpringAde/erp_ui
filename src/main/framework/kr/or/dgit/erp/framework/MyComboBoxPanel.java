package kr.or.dgit.erp.framework;
import javax.swing.JList;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JComboBox;

public class MyComboBoxPanel<T> extends MyCompPanel {

	private JComboBox<T> combo;

	public MyComboBoxPanel() {
		pValue.setLayout(new GridLayout(0, 1, 0, 0));		
		combo = new JComboBox();
		pValue.add(combo);
	}
	
	//항목 추가
	public void setAddItem(Vector<T> item){
		for(T t : item){
			combo.addItem(t);
		}
	}
	
	//항목 내용 선택
	public Object getSelectItem(){
		return combo.getSelectedItem();
	}
	
	//항목 내용 설정
	public void setSelectedItem(T item){
		combo.setSelectedItem(item);
	}

	//선택한 항목의 인덱스 값을 설정
	public void setSelectedIndex(int idx){
		combo.setSelectedIndex(idx);
	}
	
}
