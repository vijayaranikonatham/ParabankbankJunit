package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordBill_Pay_hyperlink_Account_Services_screen implements CQJSONizeable {
public CQRecordBill_Pay_hyperlink_Account_Services_screen(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordBill_Pay_hyperlink_Account_Services_screen))
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