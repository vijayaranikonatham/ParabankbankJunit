package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTransaction_form implements CQJSONizeable {
public CQRecordTransaction_form(){}

public CQRecordTransaction_form(String Select_an_account,String Select_an_account_dropdown_Status)
	{
		this.Select_an_account = Select_an_account;

		this.Select_an_account_dropdown_Status = Select_an_account_dropdown_Status;

	}
 	public String Select_an_account;
	public String getSelect_an_account()
	{
		return this.Select_an_account;
	}

	public void  setSelect_an_account(String Select_an_account)
	{
		this.Select_an_account = Select_an_account;
	}
 	public String Select_an_account_dropdown_Status;
	public String getSelect_an_account_dropdown_Status()
	{
		return this.Select_an_account_dropdown_Status;
	}

	public void  setSelect_an_account_dropdown_Status(String Select_an_account_dropdown_Status)
	{
		this.Select_an_account_dropdown_Status = Select_an_account_dropdown_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTransaction_form))
		{
    
			return false;

		}
		CQRecordTransaction_form otherRec = (CQRecordTransaction_form) other;
		if (!CQEquals.equals(this.Select_an_account, otherRec.Select_an_account))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Select_an_account_dropdown_Status, otherRec.Select_an_account_dropdown_Status))
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
		sb.append(indent + "    " + "\"Select_an_account\": ");
		sb.append(CQJSONize.jsonize(Select_an_account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Select_an_account_dropdown_Status\": ");
		sb.append(CQJSONize.jsonize(Select_an_account_dropdown_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}