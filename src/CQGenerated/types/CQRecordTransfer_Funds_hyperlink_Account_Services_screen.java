package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTransfer_Funds_hyperlink_Account_Services_screen implements CQJSONizeable {
public CQRecordTransfer_Funds_hyperlink_Account_Services_screen(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTransfer_Funds_hyperlink_Account_Services_screen))
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