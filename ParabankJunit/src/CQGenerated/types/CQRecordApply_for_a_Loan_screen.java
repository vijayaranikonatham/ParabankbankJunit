package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordApply_for_a_Loan_screen implements CQJSONizeable {
public CQRecordApply_for_a_Loan_screen(){}

public CQRecordApply_for_a_Loan_screen(CQRecordLoan_form Loan_form,String Apply_Now_button_Status,String Account_Overview_hyperlink_Status)
	{
		this.Loan_form = Loan_form;

		this.Apply_Now_button_Status = Apply_Now_button_Status;

		this.Account_Overview_hyperlink_Status = Account_Overview_hyperlink_Status;

	}
 	public CQRecordLoan_form Loan_form;
	public CQRecordLoan_form getLoan_form()
	{
		return this.Loan_form;
	}

	public void  setLoan_form(CQRecordLoan_form Loan_form)
	{
		this.Loan_form = Loan_form;
	}
 	public String Apply_Now_button_Status;
	public String getApply_Now_button_Status()
	{
		return this.Apply_Now_button_Status;
	}

	public void  setApply_Now_button_Status(String Apply_Now_button_Status)
	{
		this.Apply_Now_button_Status = Apply_Now_button_Status;
	}
 	public String Account_Overview_hyperlink_Status;
	public String getAccount_Overview_hyperlink_Status()
	{
		return this.Account_Overview_hyperlink_Status;
	}

	public void  setAccount_Overview_hyperlink_Status(String Account_Overview_hyperlink_Status)
	{
		this.Account_Overview_hyperlink_Status = Account_Overview_hyperlink_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordApply_for_a_Loan_screen))
		{
    
			return false;

		}
		CQRecordApply_for_a_Loan_screen otherRec = (CQRecordApply_for_a_Loan_screen) other;
		if (!CQEquals.equals(this.Loan_form, otherRec.Loan_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Apply_Now_button_Status, otherRec.Apply_Now_button_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Account_Overview_hyperlink_Status, otherRec.Account_Overview_hyperlink_Status))
		{
    
			return false;

		}
		return true;
	}
	public String jsonize()
	{
    
		return jsonize("");

	}
	public String jsonize(String indent)
	{
    
		StringBuffer sb = new StringBuffer();
		sb.append("\n" + indent + "{\n");
		sb.append(indent + "    " + "\"Loan_form\": ");
		sb.append(CQJSONize.jsonize(Loan_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Apply_Now_button_Status\": ");
		sb.append(CQJSONize.jsonize(Apply_Now_button_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Account_Overview_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Account_Overview_hyperlink_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}