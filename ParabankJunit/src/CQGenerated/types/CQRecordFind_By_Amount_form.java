package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFind_By_Amount_form implements CQJSONizeable {
public CQRecordFind_By_Amount_form(){}

public CQRecordFind_By_Amount_form(String Find_By_Amount,String Find_By_Amount_textbox_Status,String Find_Transactions_button_Status)
	{
		this.Find_By_Amount = Find_By_Amount;

		this.Find_By_Amount_textbox_Status = Find_By_Amount_textbox_Status;

		this.Find_Transactions_button_Status = Find_Transactions_button_Status;

	}
 	public String Find_By_Amount;
	public String getFind_By_Amount()
	{
		return this.Find_By_Amount;
	}

	public void  setFind_By_Amount(String Find_By_Amount)
	{
		this.Find_By_Amount = Find_By_Amount;
	}
 	public String Find_By_Amount_textbox_Status;
	public String getFind_By_Amount_textbox_Status()
	{
		return this.Find_By_Amount_textbox_Status;
	}

	public void  setFind_By_Amount_textbox_Status(String Find_By_Amount_textbox_Status)
	{
		this.Find_By_Amount_textbox_Status = Find_By_Amount_textbox_Status;
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
		if (!(other instanceof CQRecordFind_By_Amount_form))
		{
    
			return false;

		}
		CQRecordFind_By_Amount_form otherRec = (CQRecordFind_By_Amount_form) other;
		if (!CQEquals.equals(this.Find_By_Amount, otherRec.Find_By_Amount))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Find_By_Amount_textbox_Status, otherRec.Find_By_Amount_textbox_Status))
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
		sb.append(indent + "    " + "\"Find_By_Amount\": ");
		sb.append(CQJSONize.jsonize(Find_By_Amount, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Find_By_Amount_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Find_By_Amount_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Find_Transactions_button_Status\": ");
		sb.append(CQJSONize.jsonize(Find_Transactions_button_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}