package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Profile_form_Update_Profile_screen implements CQJSONizeable {
public CQRecordFill_Profile_form_Update_Profile_screen(){}

public CQRecordFill_Profile_form_Update_Profile_screen(CQRecordFill_Profile_form Fill_Profile_form)
	{
		this.Fill_Profile_form = Fill_Profile_form;

	}
 	public CQRecordFill_Profile_form Fill_Profile_form;
	public CQRecordFill_Profile_form getFill_Profile_form()
	{
		return this.Fill_Profile_form;
	}

	public void  setFill_Profile_form(CQRecordFill_Profile_form Fill_Profile_form)
	{
		this.Fill_Profile_form = Fill_Profile_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Profile_form_Update_Profile_screen))
		{
    
			return false;

		}
		CQRecordFill_Profile_form_Update_Profile_screen otherRec = (CQRecordFill_Profile_form_Update_Profile_screen) other;
		if (!CQEquals.equals(this.Fill_Profile_form, otherRec.Fill_Profile_form))
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
		sb.append(indent + "    " + "\"Fill_Profile_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Profile_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}