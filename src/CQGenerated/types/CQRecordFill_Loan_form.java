package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Loan_form implements CQJSONizeable {
public CQRecordFill_Loan_form(){}

public CQRecordFill_Loan_form(String Loan_Amount,String Down_Payment,String From_Account)
	{
		this.Loan_Amount = Loan_Amount;

		this.Down_Payment = Down_Payment;

		this.From_Account = From_Account;

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
 	public String Down_Payment;
	public String getDown_Payment()
	{
		return this.Down_Payment;
	}

	public void  setDown_Payment(String Down_Payment)
	{
		this.Down_Payment = Down_Payment;
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
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Loan_form))
		{
    
			return false;

		}
		CQRecordFill_Loan_form otherRec = (CQRecordFill_Loan_form) other;
		if (!CQEquals.equals(this.Loan_Amount, otherRec.Loan_Amount))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Down_Payment, otherRec.Down_Payment))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.From_Account, otherRec.From_Account))
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
		sb.append(indent + "    " + "\"Down_Payment\": ");
		sb.append(CQJSONize.jsonize(Down_Payment, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"From_Account\": ");
		sb.append(CQJSONize.jsonize(From_Account, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}