package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_New_Account_form_Open_New_Account_screen implements CQJSONizeable {
public CQRecordFill_New_Account_form_Open_New_Account_screen(){}

public CQRecordFill_New_Account_form_Open_New_Account_screen(CQRecordFill_New_Account_form Fill_New_Account_form)
	{
		this.Fill_New_Account_form = Fill_New_Account_form;

	}
 	public CQRecordFill_New_Account_form Fill_New_Account_form;
	public CQRecordFill_New_Account_form getFill_New_Account_form()
	{
		return this.Fill_New_Account_form;
	}

	public void  setFill_New_Account_form(CQRecordFill_New_Account_form Fill_New_Account_form)
	{
		this.Fill_New_Account_form = Fill_New_Account_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_New_Account_form_Open_New_Account_screen))
		{
    
			return false;

		}
		CQRecordFill_New_Account_form_Open_New_Account_screen otherRec = (CQRecordFill_New_Account_form_Open_New_Account_screen) other;
		if (!CQEquals.equals(this.Fill_New_Account_form, otherRec.Fill_New_Account_form))
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
		sb.append(indent + "    " + "\"Fill_New_Account_form\": ");
		sb.append(CQJSONize.jsonize(Fill_New_Account_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}