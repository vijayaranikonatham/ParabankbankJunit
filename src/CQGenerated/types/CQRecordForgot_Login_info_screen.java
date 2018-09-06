package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordForgot_Login_info_screen implements CQJSONizeable {
public CQRecordForgot_Login_info_screen(){}

public CQRecordForgot_Login_info_screen(CQRecordForgot_Login_info_form Forgot_Login_info_form)
	{
		this.Forgot_Login_info_form = Forgot_Login_info_form;

	}
 	public CQRecordForgot_Login_info_form Forgot_Login_info_form;
	public CQRecordForgot_Login_info_form getForgot_Login_info_form()
	{
		return this.Forgot_Login_info_form;
	}

	public void  setForgot_Login_info_form(CQRecordForgot_Login_info_form Forgot_Login_info_form)
	{
		this.Forgot_Login_info_form = Forgot_Login_info_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordForgot_Login_info_screen))
		{
    
			return false;

		}
		CQRecordForgot_Login_info_screen otherRec = (CQRecordForgot_Login_info_screen) other;
		if (!CQEquals.equals(this.Forgot_Login_info_form, otherRec.Forgot_Login_info_form))
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
		sb.append(indent + "    " + "\"Forgot_Login_info_form\": ");
		sb.append(CQJSONize.jsonize(Forgot_Login_info_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}