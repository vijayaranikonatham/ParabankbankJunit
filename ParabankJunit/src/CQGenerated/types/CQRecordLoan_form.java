package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordLoan_form implements CQJSONizeable {
public CQRecordLoan_form(){}

public CQRecordLoan_form(String Loan_Amount,String Loan_Amount_textbox_Status,String Down_Payment,String Down_Payment_textbox_Status,String From_Account,String From_Account_dropdown_Status)
	{
		this.Loan_Amount = Loan_Amount;

		this.Loan_Amount_textbox_Status = Loan_Amount_textbox_Status;

		this.Down_Payment = Down_Payment;

		this.Down_Payment_textbox_Status = Down_Payment_textbox_Status;

		this.From_Account = From_Account;

		this.From_Account_dropdown_Status = From_Account_dropdown_Status;

	}
 	public String Loan_Amount;
	public String getLoan_Amount()
	{
		return this.Loan_Amount;
	}

	public void  setLoan_Amount(String Loan_Amount)
	{
		this.Loan_Amount = Loan_Amount;
	}
 	public String Loan_Amount_textbox_Status;
	public String getLoan_Amount_textbox_Status()
	{
		return this.Loan_Amount_textbox_Status;
	}

	public void  setLoan_Amount_textbox_Status(String Loan_Amount_textbox_Status)
	{
		this.Loan_Amount_textbox_Status = Loan_Amount_textbox_Status;
	}
 	public String Down_Payment;
	public String getDown_Payment()
	{
		return this.Down_Payment;
	}

	public void  setDown_Payment(String Down_Payment)
	{
		this.Down_Payment = Down_Payment;
	}
 	public String Down_Payment_textbox_Status;
	public String getDown_Payment_textbox_Status()
	{
		return this.Down_Payment_textbox_Status;
	}

	public void  setDown_Payment_textbox_Status(String Down_Payment_textbox_Status)
	{
		this.Down_Payment_textbox_Status = Down_Payment_textbox_Status;
	}
 	public String From_Account;
	public String getFrom_Account()
	{
		return this.From_Account;
	}

	public void  setFrom_Account(String From_Account)
	{
		this.From_Account = From_Account;
	}
 	public String From_Account_dropdown_Status;
	public String getFrom_Account_dropdown_Status()
	{
		return this.From_Account_dropdown_Status;
	}

	public void  setFrom_Account_dropdown_Status(String From_Account_dropdown_Status)
	{
		this.From_Account_dropdown_Status = From_Account_dropdown_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordLoan_form))
		{
    
			return false;

		}
		CQRecordLoan_form otherRec = (CQRecordLoan_form) other;
		if (!CQEquals.equals(this.Loan_Amount, otherRec.Loan_Amount))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Loan_Amount_textbox_Status, otherRec.Loan_Amount_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Down_Payment, otherRec.Down_Payment))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Down_Payment_textbox_Status, otherRec.Down_Payment_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.From_Account, otherRec.From_Account))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.From_Account_dropdown_Status, otherRec.From_Account_dropdown_Status))
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
		sb.append(indent + "    " + "\"Loan_Amount\": ");
		sb.append(CQJSONize.jsonize(Loan_Amount, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Loan_Amount_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Loan_Amount_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Down_Payment\": ");
		sb.append(CQJSONize.jsonize(Down_Payment, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Down_Payment_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Down_Payment_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"From_Account\": ");
		sb.append(CQJSONize.jsonize(From_Account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"From_Account_dropdown_Status\": ");
		sb.append(CQJSONize.jsonize(From_Account_dropdown_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}