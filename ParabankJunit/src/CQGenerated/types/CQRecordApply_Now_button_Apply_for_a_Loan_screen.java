package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordApply_Now_button_Apply_for_a_Loan_screen implements CQJSONizeable {
public CQRecordApply_Now_button_Apply_for_a_Loan_screen(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordApply_Now_button_Apply_for_a_Loan_screen))
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
		sb.append(indent + "}");
		return sb.toString();

	}

}