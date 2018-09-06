package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Payee_Information_form_Bill_Payment_Service_screen implements CQJSONizeable {
public CQRecordFill_Payee_Information_form_Bill_Payment_Service_screen(){}

public CQRecordFill_Payee_Information_form_Bill_Payment_Service_screen(CQRecordFill_Payee_Information_form Fill_Payee_Information_form)
	{
		this.Fill_Payee_Information_form = Fill_Payee_Information_form;

	}
 	public CQRecordFill_Payee_Information_form Fill_Payee_Information_form;
	public CQRecordFill_Payee_Information_form getFill_Payee_Information_form()
	{
		return this.Fill_Payee_Information_form;
	}

	public void  setFill_Payee_Information_form(CQRecordFill_Payee_Information_form Fill_Payee_Information_form)
	{
		this.Fill_Payee_Information_form = Fill_Payee_Information_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Payee_Information_form_Bill_Payment_Service_screen))
		{
    
			return false;

		}
		CQRecordFill_Payee_Information_form_Bill_Payment_Service_screen otherRec = (CQRecordFill_Payee_Information_form_Bill_Payment_Service_screen) other;
		if (!CQEquals.equals(this.Fill_Payee_Information_form, otherRec.Fill_Payee_Information_form))
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
		sb.append(indent + "    " + "\"Fill_Payee_Information_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Payee_Information_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}