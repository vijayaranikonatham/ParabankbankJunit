package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTRANSFER_button_Transfer_Funds_screen implements CQJSONizeable {
public CQRecordTRANSFER_button_Transfer_Funds_screen(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTRANSFER_button_Transfer_Funds_screen))
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