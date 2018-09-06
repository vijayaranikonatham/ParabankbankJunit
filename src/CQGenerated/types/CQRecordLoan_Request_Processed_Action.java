package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordLoan_Request_Processed_Action implements CQJSONizeable {
public CQRecordLoan_Request_Processed_Action(){}

public CQRecordLoan_Request_Processed_Action(String Loan_Provider,String Date,String Status,String message,String Account_Number)
	{
		this.Loan_Provider = Loan_Provider;

		this.Date = Date;

		this.Status = Status;

		this.message = message;

		this.Account_Number = Account_Number;

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
 	public String Date;
	public String getDate()
	{
		return this.Date;
	}

	public void  setDate(String Date)
	{
		this.Date = Date;
	}
 	public String Status;
	public String getStatus()
	{
		return this.Status;
	}

	public void  setStatus(String Status)
	{
		this.Status = Status;
	}
 	public String message;
	public String getmessage()
	{
		return this.message;
	}

	public void  setmessage(String message)
	{
		this.message = message;
	}
 	public String Account_Number;
	public String getAccount_Number()
	{
		return this.Account_Number;
	}

	public void  setAccount_Number(String Account_Number)
	{
		this.Account_Number = Account_Number;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordLoan_Request_Processed_Action))
		{
    
			return false;

		}
		CQRecordLoan_Request_Processed_Action otherRec = (CQRecordLoan_Request_Processed_Action) other;
		if (!CQEquals.equals(this.Loan_Provider, otherRec.Loan_Provider))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Date, otherRec.Date))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Status, otherRec.Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.message, otherRec.message))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Account_Number, otherRec.Account_Number))
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
		sb.append(indent + "    " + "\"Date\": ");
		sb.append(CQJSONize.jsonize(Date, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Status\": ");
		sb.append(CQJSONize.jsonize(Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"message\": ");
		sb.append(CQJSONize.jsonize(message, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Account_Number\": ");
		sb.append(CQJSONize.jsonize(Account_Number, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}