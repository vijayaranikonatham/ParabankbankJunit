package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Loan_form_Apply_for_a_Loan_screen implements CQJSONizeable {
public CQRecordFill_Loan_form_Apply_for_a_Loan_screen(){}

public CQRecordFill_Loan_form_Apply_for_a_Loan_screen(CQRecordFill_Loan_form Fill_Loan_form)
	{
		this.Fill_Loan_form = Fill_Loan_form;

	}
 	public CQRecordFill_Loan_form Fill_Loan_form;
	public CQRecordFill_Loan_form getFill_Loan_form()
	{
		return this.Fill_Loan_form;
	}

	public void  setFill_Loan_form(CQRecordFill_Loan_form Fill_Loan_form)
	{
		this.Fill_Loan_form = Fill_Loan_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Loan_form_Apply_for_a_Loan_screen))
		{
    
			return false;

		}
		CQRecordFill_Loan_form_Apply_for_a_Loan_screen otherRec = (CQRecordFill_Loan_form_Apply_for_a_Loan_screen) other;
		if (!CQEquals.equals(this.Fill_Loan_form, otherRec.Fill_Loan_form))
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
		sb.append(indent + "    " + "\"Fill_Loan_form\": ");
		sb.append(CQJSONize.jsonize(Fill_Loan_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}