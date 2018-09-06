package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Signup_form_Register_screen implements CQJSONizeable {
public CQRecordFill_Signup_form_Register_screen(){}

public CQRecordFill_Signup_form_Register_screen(CQRecordFill_Signup_form Fill_Signup_form)
	{
		this.Fill_Signup_form = Fill_Signup_form;

	}
 	public CQRecordFill_Signup_form Fill_Signup_form;
	public CQRecordFill_Signup_form getFill_Signup_form()
	{
		return this.Fill_Signup_form;
	}

	public void  setFill_Signup_form(CQRecordFill_Signup_form Fill_Signup_form)
	{
		this.Fill_Signup_form = Fill_Signup_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Signup_form_Register_screen))
		{
    
			return false;

		}
		CQRecordFill_Signup_form_Register_screen otherRec = (CQRecordFill_Signup_form_Register_screen) other;
		if (!CQEquals.equals(this.Fill_Signup_form, otherRec.Fill_Signup_form))
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
		sb.append(indent + "    " + "\"Fill_Signup_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Signup_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}