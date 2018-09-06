package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Transaction_By_Date_form_Find_Transactions_screen implements CQJSONizeable {
public CQRecordFill_Transaction_By_Date_form_Find_Transactions_screen(){}

public CQRecordFill_Transaction_By_Date_form_Find_Transactions_screen(CQRecordFill_Transaction_By_Date_form Fill_Transaction_By_Date_form)
	{
		this.Fill_Transaction_By_Date_form = Fill_Transaction_By_Date_form;

	}
 	public CQRecordFill_Transaction_By_Date_form Fill_Transaction_By_Date_form;
	public CQRecordFill_Transaction_By_Date_form getFill_Transaction_By_Date_form()
	{
		return this.Fill_Transaction_By_Date_form;
	}

	public void  setFill_Transaction_By_Date_form(CQRecordFill_Transaction_By_Date_form Fill_Transaction_By_Date_form)
	{
		this.Fill_Transaction_By_Date_form = Fill_Transaction_By_Date_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Transaction_By_Date_form_Find_Transactions_screen))
		{
    
			return false;

		}
		CQRecordFill_Transaction_By_Date_form_Find_Transactions_screen otherRec = (CQRecordFill_Transaction_By_Date_form_Find_Transactions_screen) other;
		if (!CQEquals.equals(this.Fill_Transaction_By_Date_form, otherRec.Fill_Transaction_By_Date_form))
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
		sb.append(indent + "    " + "\"Fill_Transaction_By_Date_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Transaction_By_Date_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}