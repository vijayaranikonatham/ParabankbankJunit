package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordAccount_Overview_hyperlink_Open_New_Account_screen implements CQJSONizeable {
public CQRecordAccount_Overview_hyperlink_Open_New_Account_screen(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordAccount_Overview_hyperlink_Open_New_Account_screen))
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