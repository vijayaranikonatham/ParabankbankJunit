package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Find_By_Amount_form_Find_Transactions_screen implements CQJSONizeable {
public CQRecordFill_Find_By_Amount_form_Find_Transactions_screen(){}

public CQRecordFill_Find_By_Amount_form_Find_Transactions_screen(CQRecordFill_Find_By_Amount_form Fill_Find_By_Amount_form)
	{
		this.Fill_Find_By_Amount_form = Fill_Find_By_Amount_form;

	}
 	public CQRecordFill_Find_By_Amount_form Fill_Find_By_Amount_form;
	public CQRecordFill_Find_By_Amount_form getFill_Find_By_Amount_form()
	{
		return this.Fill_Find_By_Amount_form;
	}

	public void  setFill_Find_By_Amount_form(CQRecordFill_Find_By_Amount_form Fill_Find_By_Amount_form)
	{
		this.Fill_Find_By_Amount_form = Fill_Find_By_Amount_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Find_By_Amount_form_Find_Transactions_screen))
		{
    
			return false;

		}
		CQRecordFill_Find_By_Amount_form_Find_Transactions_screen otherRec = (CQRecordFill_Find_By_Amount_form_Find_Transactions_screen) other;
		if (!CQEquals.equals(this.Fill_Find_By_Amount_form, otherRec.Fill_Find_By_Amount_form))
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
		sb.append(indent + "    " + "\"Fill_Find_By_Amount_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Find_By_Amount_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}