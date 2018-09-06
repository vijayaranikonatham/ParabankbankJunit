package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTransaction_ID_form implements CQJSONizeable {
public CQRecordTransaction_ID_form(){}

public CQRecordTransaction_ID_form(String Find_By_Transaction_ID,String Find_By_Transaction_ID_textbox_Status,String Find_Transactions_button_Status)
	{
		this.Find_By_Transaction_ID = Find_By_Transaction_ID;

		this.Find_By_Transaction_ID_textbox_Status = Find_By_Transaction_ID_textbox_Status;

		this.Find_Transactions_button_Status = Find_Transactions_button_Status;

	}
 	public String Find_By_Transaction_ID;
	public String getFind_By_Transaction_ID()
	{
		return this.Find_By_Transaction_ID;
	}

	public void  setFind_By_Transaction_ID(String Find_By_Transaction_ID)
	{
		this.Find_By_Transaction_ID = Find_By_Transaction_ID;
	}
 	public String Find_By_Transaction_ID_textbox_Status;
	public String getFind_By_Transaction_ID_textbox_Status()
	{
		return this.Find_By_Transaction_ID_textbox_Status;
	}

	public void  setFind_By_Transaction_ID_textbox_Status(String Find_By_Transaction_ID_textbox_Status)
	{
		this.Find_By_Transaction_ID_textbox_Status = Find_By_Transaction_ID_textbox_Status;
	}
 	public String Find_Transactions_button_Status;
	public String getFind_Transactions_button_Status()
	{
		return this.Find_Transactions_button_Status;
	}

	public void  setFind_Transactions_button_Status(String Find_Transactions_button_Status)
	{
		this.Find_Transactions_button_Status = Find_Transactions_button_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTransaction_ID_form))
		{
    
			return false;

		}
		CQRecordTransaction_ID_form otherRec = (CQRecordTransaction_ID_form) other;
		if (!CQEquals.equals(this.Find_By_Transaction_ID, otherRec.Find_By_Transaction_ID))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Find_By_Transaction_ID_textbox_Status, otherRec.Find_By_Transaction_ID_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Find_Transactions_button_Status, otherRec.Find_Transactions_button_Status))
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
		sb.append(indent + "    " + "\"Find_By_Transaction_ID\": ");
		sb.append(CQJSONize.jsonize(Find_By_Transaction_ID, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Find_By_Transaction_ID_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Find_By_Transaction_ID_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Find_Transactions_button_Status\": ");
		sb.append(CQJSONize.jsonize(Find_Transactions_button_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}