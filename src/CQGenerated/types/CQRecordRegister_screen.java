package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordRegister_screen implements CQJSONizeable {
public CQRecordRegister_screen(){}

public CQRecordRegister_screen(CQRecordSignup_form Signup_form)
	{
		this.Signup_form = Signup_form;

	}
 	public CQRecordSignup_form Signup_form;
	public CQRecordSignup_form getSignup_form()
	{
		return this.Signup_form;
	}

	public void  setSignup_form(CQRecordSignup_form Signup_form)
	{
		this.Signup_form = Signup_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordRegister_screen))
		{
    
			return false;

		}
		CQRecordRegister_screen otherRec = (CQRecordRegister_screen) other;
		if (!CQEquals.equals(this.Signup_form, otherRec.Signup_form))
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
		sb.append(indent + "    " + "\"Signup_form\": ");
		sb.append(CQJSONize.jsonize(Signup_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}