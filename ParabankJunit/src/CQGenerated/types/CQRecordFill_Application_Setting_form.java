package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Application_Setting_form implements CQJSONizeable {
public CQRecordFill_Application_Setting_form(){}

public CQRecordFill_Application_Setting_form(String Loan_Provider,String Loan_Processor,int Threshold,String Initial_Balance,String Min_Balance)
	{
		this.Loan_Provider = Loan_Provider;

		this.Loan_Processor = Loan_Processor;

		this.Threshold = Threshold;

		this.Initial_Balance = Initial_Balance;

		this.Min_Balance = Min_Balance;

	}
 	public String Loan_Provider;
	public String getLoan_Provider()
	{
		return this.Loan_Provider;
	}

	public void  setLoan_Provider(String Loan_Provider)
	{
		this.Loan_Provider = Loan_Provider;
	}
 	public String Loan_Processor;
	public String getLoan_Processor()
	{
		return this.Loan_Processor;
	}

	public void  setLoan_Processor(String Loan_Processor)
	{
		this.Loan_Processor = Loan_Processor;
	}
 	public int Threshold;
	public int getThreshold()
	{
		return this.Threshold;
	}

	public void  setThreshold(int Threshold)
	{
		this.Threshold = Threshold;
	}
 	public String Initial_Balance;
	public String getInitial_Balance()
	{
		return this.Initial_Balance;
	}

	public void  setInitial_Balance(String Initial_Balance)
	{
		this.Initial_Balance = Initial_Balance;
	}
 	public String Min_Balance;
	public String getMin_Balance()
	{
		return this.Min_Balance;
	}

	public void  setMin_Balance(String Min_Balance)
	{
		this.Min_Balance = Min_Balance;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Application_Setting_form))
		{
    
			return false;

		}
		CQRecordFill_Application_Setting_form otherRec = (CQRecordFill_Application_Setting_form) other;
		if (!CQEquals.equals(this.Loan_Provider, otherRec.Loan_Provider))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Loan_Processor, otherRec.Loan_Processor))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Threshold, otherRec.Threshold))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Initial_Balance, otherRec.Initial_Balance))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Min_Balance, otherRec.Min_Balance))
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
		sb.append(indent + "    " + "\"Loan_Provider\": ");
		sb.append(CQJSONize.jsonize(Loan_Provider, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Loan_Processor\": ");
		sb.append(CQJSONize.jsonize(Loan_Processor, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Threshold\": ");
		sb.append(CQJSONize.jsonize(Threshold, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Initial_Balance\": ");
		sb.append(CQJSONize.jsonize(Initial_Balance, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Min_Balance\": ");
		sb.append(CQJSONize.jsonize(Min_Balance, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}