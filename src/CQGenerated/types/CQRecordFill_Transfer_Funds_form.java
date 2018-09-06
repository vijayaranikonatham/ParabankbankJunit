package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Transfer_Funds_form implements CQJSONizeable {
public CQRecordFill_Transfer_Funds_form(){}

public CQRecordFill_Transfer_Funds_form(String Amount,String From_Account,String To_Account)
	{
		this.Amount = Amount;

		this.From_Account = From_Account;

		this.To_Account = To_Account;

	}
 	public String Amount;
	public String getAmount()
	{
		return this.Amount;
	}

	public void  setAmount(String Amount)
	{
		this.Amount = Amount;
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
 	public String To_Account;
	public String getTo_Account()
	{
		return this.To_Account;
	}

	public void  setTo_Account(String To_Account)
	{
		this.To_Account = To_Account;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Transfer_Funds_form))
		{
    
			return false;

		}
		CQRecordFill_Transfer_Funds_form otherRec = (CQRecordFill_Transfer_Funds_form) other;
		if (!CQEquals.equals(this.Amount, otherRec.Amount))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.From_Account, otherRec.From_Account))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.To_Account, otherRec.To_Account))
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
		sb.append(indent + "    " + "\"Amount\": ");
		sb.append(CQJSONize.jsonize(Amount, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"From_Account\": ");
		sb.append(CQJSONize.jsonize(From_Account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"To_Account\": ");
		sb.append(CQJSONize.jsonize(To_Account, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}