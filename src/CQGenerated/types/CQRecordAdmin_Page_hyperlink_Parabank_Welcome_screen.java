package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordAdmin_Page_hyperlink_Parabank_Welcome_screen implements CQJSONizeable {
public CQRecordAdmin_Page_hyperlink_Parabank_Welcome_screen(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordAdmin_Page_hyperlink_Parabank_Welcome_screen))
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