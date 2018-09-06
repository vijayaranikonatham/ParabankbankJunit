package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordNew_Account_form implements CQJSONizeable {
public CQRecordNew_Account_form(){}

public CQRecordNew_Account_form(String Account_Type,String Account_Type_dropdown_Status,String Existing_Account,String Existing_Account_dropdown_Status)
	{
		this.Account_Type = Account_Type;

		this.Account_Type_dropdown_Status = Account_Type_dropdown_Status;

		this.Existing_Account = Existing_Account;

		this.Existing_Account_dropdown_Status = Existing_Account_dropdown_Status;

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
 	public String Account_Type_dropdown_Status;
	public String getAccount_Type_dropdown_Status()
	{
		return this.Account_Type_dropdown_Status;
	}

	public void  setAccount_Type_dropdown_Status(String Account_Type_dropdown_Status)
	{
		this.Account_Type_dropdown_Status = Account_Type_dropdown_Status;
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
 	public String Existing_Account_dropdown_Status;
	public String getExisting_Account_dropdown_Status()
	{
		return this.Existing_Account_dropdown_Status;
	}

	public void  setExisting_Account_dropdown_Status(String Existing_Account_dropdown_Status)
	{
		this.Existing_Account_dropdown_Status = Existing_Account_dropdown_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordNew_Account_form))
		{
    
			return false;

		}
		CQRecordNew_Account_form otherRec = (CQRecordNew_Account_form) other;
		if (!CQEquals.equals(this.Account_Type, otherRec.Account_Type))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Account_Type_dropdown_Status, otherRec.Account_Type_dropdown_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Existing_Account, otherRec.Existing_Account))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Existing_Account_dropdown_Status, otherRec.Existing_Account_dropdown_Status))
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
		sb.append(indent + "    " + "\"Account_Type_dropdown_Status\": ");
		sb.append(CQJSONize.jsonize(Account_Type_dropdown_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Existing_Account\": ");
		sb.append(CQJSONize.jsonize(Existing_Account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Existing_Account_dropdown_Status\": ");
		sb.append(CQJSONize.jsonize(Existing_Account_dropdown_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}