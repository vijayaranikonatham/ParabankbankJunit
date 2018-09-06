package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Customer_Login_form_Parabank_Welcome_screen implements CQJSONizeable {
public CQRecordFill_Customer_Login_form_Parabank_Welcome_screen(){}

public CQRecordFill_Customer_Login_form_Parabank_Welcome_screen(CQRecordFill_Customer_Login_form Fill_Customer_Login_form)
	{
		this.Fill_Customer_Login_form = Fill_Customer_Login_form;

	}
 	public CQRecordFill_Customer_Login_form Fill_Customer_Login_form;
	public CQRecordFill_Customer_Login_form getFill_Customer_Login_form()
	{
		return this.Fill_Customer_Login_form;
	}

	public void  setFill_Customer_Login_form(CQRecordFill_Customer_Login_form Fill_Customer_Login_form)
	{
		this.Fill_Customer_Login_form = Fill_Customer_Login_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Customer_Login_form_Parabank_Welcome_screen))
		{
    
			return false;

		}
		CQRecordFill_Customer_Login_form_Parabank_Welcome_screen otherRec = (CQRecordFill_Customer_Login_form_Parabank_Welcome_screen) other;
		if (!CQEquals.equals(this.Fill_Customer_Login_form, otherRec.Fill_Customer_Login_form))
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
		sb.append(indent + "    " + "\"Fill_Customer_Login_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Customer_Login_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}