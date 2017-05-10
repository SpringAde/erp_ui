package kr.or.dgit.erp.content;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.Date;
import java.util.Vector;

import javax.swing.JPanel;

import erp_application_frameWork.MyComboBoxPanel;
import erp_application_frameWork.MyCompPanel;
import erp_application_frameWork.MyRadioPanel;
import erp_application_frameWork.MySpinnerPanel;
import erp_application_frameWork.MyTextFieldPanel;
import kr.or.dgit.erp.dto.Department;
import kr.or.dgit.erp.dto.Title;
import erp_application_frameWork.MyDateFieldPanel;
import javax.swing.border.EmptyBorder;

public class ContentEmployee extends JPanel{
	private MyTextFieldPanel pNo;
	private MyTextFieldPanel pName;
	private MyComboBoxPanel<Title> pTitle;
	private MySpinnerPanel pSalary;
	private MyRadioPanel pGender;
	private MyComboBoxPanel<Department> pDept;
	private MyDateFieldPanel pDate;

	public ContentEmployee() {
		setLayout(new GridLayout(0, 1, 0, 5));		
		
		pNo = new MyTextFieldPanel();
		pNo.setTitle("번호");
		add(pNo);
		pNo.setLayout(new GridLayout(1, 0, 20, 0));
		pNo.getTextField().setEditable(false);		// 텍스트 편집 불가능하게 하기
		
		pName = new MyTextFieldPanel();
		pName.setTitle("사원명");
		add(pName);
		pName.setLayout(new GridLayout(1, 0, 20, 0));
		
		pTitle = new MyComboBoxPanel<>();
		pTitle.setTitle("직책");
		add(pTitle);
		pTitle.setLayout(new GridLayout(1, 0, 20, 0));
		
		pSalary = new MySpinnerPanel();
		pSalary.setValues(1500000, 1000000, 5000000, 100000);
		pSalary.setTitle("급여");
		add(pSalary);
		pSalary.setLayout(new GridLayout(1, 0, 20, 0));
		
		pGender = new MyRadioPanel();
		pGender.getpValue().setBorder(new EmptyBorder(0, 40, 0, 0));
		GridLayout gridLayout = (GridLayout) pGender.getpValue().getLayout();
		pGender.setTitle("성별");
		pGender.setAddItems("남","여");
		pGender.setSelectedItem("남");
		add(pGender);
		pGender.setLayout(new GridLayout(1, 0, 20, 0));
		
		pDept = new MyComboBoxPanel<>();
		pDept.setTitle("부서");
		add(pDept);
		pDept.setLayout(new GridLayout(1, 0, 20, 0));	
		
		pDate = new MyDateFieldPanel();
		pDate.setMaskPattern("####-##-##", '#');
		pDate.setTfVAlue(String.format("%tF", new Date()));
		pDate.setTitle("입사일");
		add(pDate);
		pDate.setLayout(new GridLayout(1, 0, 20, 0));		
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
	
	public void setTitles(Vector<Title>titles){
		pTitle.setAddItem(titles);
	}		
	
	public void setDepts(Vector<Department>titles){
		pDept.setAddItem(titles);
	}
	
	public MyTextFieldPanel getpNo(){
		return pNo;
	}
	
	public MyTextFieldPanel getpName(){
		return pName;
	}
	
	
}
