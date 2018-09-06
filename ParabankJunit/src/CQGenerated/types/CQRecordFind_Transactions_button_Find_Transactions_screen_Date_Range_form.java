package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFind_Transactions_button_Find_Transactions_screen_Date_Range_form implements CQJSONizeable {
public CQRecordFind_Transactions_button_Find_Transactions_screen_Date_Range_form(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFind_Transactions_button_Find_Transactions_screen_Date_Range_form))
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