package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Application_Setting_form_Administration_screen implements CQJSONizeable {
public CQRecordFill_Application_Setting_form_Administration_screen(){}

public CQRecordFill_Application_Setting_form_Administration_screen(CQRecordFill_Application_Setting_form Fill_Application_Setting_form)
	{
		this.Fill_Application_Setting_form = Fill_Application_Setting_form;

	}
 	public CQRecordFill_Application_Setting_form Fill_Application_Setting_form;
	public CQRecordFill_Application_Setting_form getFill_Application_Setting_form()
	{
		return this.Fill_Application_Setting_form;
	}

	public void  setFill_Application_Setting_form(CQRecordFill_Application_Setting_form Fill_Application_Setting_form)
	{
		this.Fill_Application_Setting_form = Fill_Application_Setting_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Application_Setting_form_Administration_screen))
		{
    
			return false;

		}
		CQRecordFill_Application_Setting_form_Administration_screen otherRec = (CQRecordFill_Application_Setting_form_Administration_screen) other;
		if (!CQEquals.equals(this.Fill_Application_Setting_form, otherRec.Fill_Application_Setting_form))
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
		sb.append(indent + "    " + "\"Fill_Application_Setting_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Application_Setting_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}