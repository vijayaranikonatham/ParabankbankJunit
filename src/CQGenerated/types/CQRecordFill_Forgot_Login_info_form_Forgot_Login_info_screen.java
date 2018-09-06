package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen implements CQJSONizeable {
public CQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen(){}

public CQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen(CQRecordFill_Forgot_Login_info_form Fill_Forgot_Login_info_form)
	{
		this.Fill_Forgot_Login_info_form = Fill_Forgot_Login_info_form;

	}
 	public CQRecordFill_Forgot_Login_info_form Fill_Forgot_Login_info_form;
	public CQRecordFill_Forgot_Login_info_form getFill_Forgot_Login_info_form()
	{
		return this.Fill_Forgot_Login_info_form;
	}

	public void  setFill_Forgot_Login_info_form(CQRecordFill_Forgot_Login_info_form Fill_Forgot_Login_info_form)
	{
		this.Fill_Forgot_Login_info_form = Fill_Forgot_Login_info_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen))
		{
    
			return false;

		}
		CQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen otherRec = (CQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen) other;
		if (!CQEquals.equals(this.Fill_Forgot_Login_info_form, otherRec.Fill_Forgot_Login_info_form))
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
		sb.append(indent + "    " + "\"Fill_Forgot_Login_info_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Forgot_Login_info_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}