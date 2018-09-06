package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTransfer_Funds_form implements CQJSONizeable {
public CQRecordTransfer_Funds_form(){}

public CQRecordTransfer_Funds_form(String Amount,String Amount_textbox_Status,String From_Account,String From_Account_dropdown_Status,String To_Account,String To_Account_dropdown_Status)
	{
		this.Amount = Amount;

		this.Amount_textbox_Status = Amount_textbox_Status;

		this.From_Account = From_Account;

		this.From_Account_dropdown_Status = From_Account_dropdown_Status;

		this.To_Account = To_Account;

		this.To_Account_dropdown_Status = To_Account_dropdown_Status;

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
 	public String Amount_textbox_Status;
	public String getAmount_textbox_Status()
	{
		return this.Amount_textbox_Status;
	}

	public void  setAmount_textbox_Status(String Amount_textbox_Status)
	{
		this.Amount_textbox_Status = Amount_textbox_Status;
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
 	public String To_Account;
	public String getTo_Account()
	{
		return this.To_Account;
	}

	public void  setTo_Account(String To_Account)
	{
		this.To_Account = To_Account;
	}
 	public String To_Account_dropdown_Status;
	public String getTo_Account_dropdown_Status()
	{
		return this.To_Account_dropdown_Status;
	}

	public void  setTo_Account_dropdown_Status(String To_Account_dropdown_Status)
	{
		this.To_Account_dropdown_Status = To_Account_dropdown_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTransfer_Funds_form))
		{
    
			return false;

		}
		CQRecordTransfer_Funds_form otherRec = (CQRecordTransfer_Funds_form) other;
		if (!CQEquals.equals(this.Amount, otherRec.Amount))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Amount_textbox_Status, otherRec.Amount_textbox_Status))
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
		if (!CQEquals.equals(this.To_Account, otherRec.To_Account))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.To_Account_dropdown_Status, otherRec.To_Account_dropdown_Status))
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
		sb.append(indent + "    " + "\"Amount_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Amount_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"From_Account\": ");
		sb.append(CQJSONize.jsonize(From_Account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"From_Account_dropdown_Status\": ");
		sb.append(CQJSONize.jsonize(From_Account_dropdown_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"To_Account\": ");
		sb.append(CQJSONize.jsonize(To_Account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"To_Account_dropdown_Status\": ");
		sb.append(CQJSONize.jsonize(To_Account_dropdown_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}