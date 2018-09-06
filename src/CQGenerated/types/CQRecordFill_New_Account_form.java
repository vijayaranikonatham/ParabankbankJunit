package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_New_Account_form implements CQJSONizeable {
public CQRecordFill_New_Account_form(){}

public CQRecordFill_New_Account_form(String Account_Type,String Existing_Account)
	{
		this.Account_Type = Account_Type;

		this.Existing_Account = Existing_Account;

	}
 	public String Account_Type;
	public String getAccount_Type()
	{
		return this.Account_Type;
	}

	public void  setAccount_Type(String Account_Type)
	{
		this.Account_Type = Account_Type;
	}
 	public String Existing_Account;
	public String getExisting_Account()
	{
		return this.Existing_Account;
	}

	public void  setExisting_Account(String Existing_Account)
	{
		this.Existing_Account = Existing_Account;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_New_Account_form))
		{
    
			return false;

		}
		CQRecordFill_New_Account_form otherRec = (CQRecordFill_New_Account_form) other;
		if (!CQEquals.equals(this.Account_Type, otherRec.Account_Type))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Existing_Account, otherRec.Existing_Account))
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
		sb.append(indent + "    " + "\"Account_Type\": ");
		sb.append(CQJSONize.jsonize(Account_Type, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Existing_Account\": ");
		sb.append(CQJSONize.jsonize(Existing_Account, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}