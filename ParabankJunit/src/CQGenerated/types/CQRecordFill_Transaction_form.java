package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Transaction_form implements CQJSONizeable {
public CQRecordFill_Transaction_form(){}

public CQRecordFill_Transaction_form(String Select_an_account)
	{
		this.Select_an_account = Select_an_account;

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
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Transaction_form))
		{
    
			return false;

		}
		CQRecordFill_Transaction_form otherRec = (CQRecordFill_Transaction_form) other;
		if (!CQEquals.equals(this.Select_an_account, otherRec.Select_an_account))
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
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}