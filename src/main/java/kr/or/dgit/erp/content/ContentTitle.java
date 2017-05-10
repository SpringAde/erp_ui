package kr.or.dgit.erp.content;

import javax.swing.JPanel;

import java.awt.Component;
import java.awt.GridLayout;
import erp_application_frameWork.MyTextFieldPanel;

public class ContentTitle extends JPanel {
	private MyTextFieldPanel pTitleNo;
	private MyTextFieldPanel pTitleName;

	public ContentTitle() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		pTitleNo = new MyTextFieldPanel();
		pTitleNo.setTitle("번호");
		add(pTitleNo);
		pTitleNo.setLayout(new GridLayout(1, 0, 20, 0));
		pTitleNo.getTextField().setEditable(false);		// 텍스트 편집 불가능하게 하기
		
		pTitleName = new MyTextFieldPanel();
		pTitleName.setTitle("직책명");
		add(pTitleName);
		pTitleName.setLayout(new GridLayout(1, 0, 20, 0));
	}
	
	public boolean isEmptyCheck(){
		boolean result = false;
		for(Component c : getComponents()){
			if (c instanceof MyTextFieldPanel){
				MyTextFieldPanel tfp = (MyTextFieldPanel)c;
				if(tfp.isEmptyCheck()){
					return true;
				}
			}
		}
		return result;
	}
	
	public MyTextFieldPanel getpNo(){
		return pTitleNo;
	}
	
	public MyTextFieldPanel getpName(){
		return pTitleName;
	}

}
