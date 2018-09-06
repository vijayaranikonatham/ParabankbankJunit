package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordAdministration_screen implements CQJSONizeable {
public CQRecordAdministration_screen(){}

public CQRecordAdministration_screen(CQRecordApplication_Setting_form Application_Setting_form,String SUBMIT_button_Status)
	{
		this.Application_Setting_form = Application_Setting_form;

		this.SUBMIT_button_Status = SUBMIT_button_Status;

	}
 	public CQRecordApplication_Setting_form Application_Setting_form;
	public CQRecordApplication_Setting_form getApplication_Setting_form()
	{
		return this.Application_Setting_form;
	}

	public void  setApplication_Setting_form(CQRecordApplication_Setting_form Application_Setting_form)
	{
		this.Application_Setting_form = Application_Setting_form;
	}
 	public String SUBMIT_button_Status;
	public String getSUBMIT_button_Status()
	{
		return this.SUBMIT_button_Status;
	}

	public void  setSUBMIT_button_Status(String SUBMIT_button_Status)
	{
		this.SUBMIT_button_Status = SUBMIT_button_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordAdministration_screen))
		{
    
			return false;

		}
		CQRecordAdministration_screen otherRec = (CQRecordAdministration_screen) other;
		if (!CQEquals.equals(this.Application_Setting_form, otherRec.Application_Setting_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.SUBMIT_button_Status, otherRec.SUBMIT_button_Status))
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
		sb.append(indent + "    " + "\"Application_Setting_form\": ");
		sb.append(CQJSONize.jsonize(Application_Setting_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"SUBMIT_button_Status\": ");
		sb.append(CQJSONize.jsonize(SUBMIT_button_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}