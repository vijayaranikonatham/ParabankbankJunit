package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordUpdate_Profile_screen implements CQJSONizeable {
public CQRecordUpdate_Profile_screen(){}

public CQRecordUpdate_Profile_screen(CQRecordProfile_form Profile_form,String UPDATE_PROFILE_button_Status)
	{
		this.Profile_form = Profile_form;

		this.UPDATE_PROFILE_button_Status = UPDATE_PROFILE_button_Status;

	}
 	public CQRecordProfile_form Profile_form;
	public CQRecordProfile_form getProfile_form()
	{
		return this.Profile_form;
	}

	public void  setProfile_form(CQRecordProfile_form Profile_form)
	{
		this.Profile_form = Profile_form;
	}
 	public String UPDATE_PROFILE_button_Status;
	public String getUPDATE_PROFILE_button_Status()
	{
		return this.UPDATE_PROFILE_button_Status;
	}

	public void  setUPDATE_PROFILE_button_Status(String UPDATE_PROFILE_button_Status)
	{
		this.UPDATE_PROFILE_button_Status = UPDATE_PROFILE_button_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordUpdate_Profile_screen))
		{
    
			return false;

		}
		CQRecordUpdate_Profile_screen otherRec = (CQRecordUpdate_Profile_screen) other;
		if (!CQEquals.equals(this.Profile_form, otherRec.Profile_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.UPDATE_PROFILE_button_Status, otherRec.UPDATE_PROFILE_button_Status))
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
		sb.append(indent + "    " + "\"Profile_form\": ");
		sb.append(CQJSONize.jsonize(Profile_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"UPDATE_PROFILE_button_Status\": ");
		sb.append(CQJSONize.jsonize(UPDATE_PROFILE_button_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}