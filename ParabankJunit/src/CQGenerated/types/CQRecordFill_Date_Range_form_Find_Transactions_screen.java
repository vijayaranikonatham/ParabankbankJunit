package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Date_Range_form_Find_Transactions_screen implements CQJSONizeable {
public CQRecordFill_Date_Range_form_Find_Transactions_screen(){}

public CQRecordFill_Date_Range_form_Find_Transactions_screen(CQRecordFill_Date_Range_form Fill_Date_Range_form)
	{
		this.Fill_Date_Range_form = Fill_Date_Range_form;

	}
 	public CQRecordFill_Date_Range_form Fill_Date_Range_form;
	public CQRecordFill_Date_Range_form getFill_Date_Range_form()
	{
		return this.Fill_Date_Range_form;
	}

	public void  setFill_Date_Range_form(CQRecordFill_Date_Range_form Fill_Date_Range_form)
	{
		this.Fill_Date_Range_form = Fill_Date_Range_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Date_Range_form_Find_Transactions_screen))
		{
    
			return false;

		}
		CQRecordFill_Date_Range_form_Find_Transactions_screen otherRec = (CQRecordFill_Date_Range_form_Find_Transactions_screen) other;
		if (!CQEquals.equals(this.Fill_Date_Range_form, otherRec.Fill_Date_Range_form))
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
		sb.append(indent + "    " + "\"Fill_Date_Range_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Date_Range_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}