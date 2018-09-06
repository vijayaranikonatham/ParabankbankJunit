package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Transfer_Funds_form_Transfer_Funds_screen implements CQJSONizeable {
public CQRecordFill_Transfer_Funds_form_Transfer_Funds_screen(){}

public CQRecordFill_Transfer_Funds_form_Transfer_Funds_screen(CQRecordFill_Transfer_Funds_form Fill_Transfer_Funds_form)
	{
		this.Fill_Transfer_Funds_form = Fill_Transfer_Funds_form;

	}
 	public CQRecordFill_Transfer_Funds_form Fill_Transfer_Funds_form;
	public CQRecordFill_Transfer_Funds_form getFill_Transfer_Funds_form()
	{
		return this.Fill_Transfer_Funds_form;
	}

	public void  setFill_Transfer_Funds_form(CQRecordFill_Transfer_Funds_form Fill_Transfer_Funds_form)
	{
		this.Fill_Transfer_Funds_form = Fill_Transfer_Funds_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Transfer_Funds_form_Transfer_Funds_screen))
		{
    
			return false;

		}
		CQRecordFill_Transfer_Funds_form_Transfer_Funds_screen otherRec = (CQRecordFill_Transfer_Funds_form_Transfer_Funds_screen) other;
		if (!CQEquals.equals(this.Fill_Transfer_Funds_form, otherRec.Fill_Transfer_Funds_form))
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
		sb.append(indent + "    " + "\"Fill_Transfer_Funds_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Transfer_Funds_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}