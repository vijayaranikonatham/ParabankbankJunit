package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordUPDATE_PROFILE_button_Update_Profile_screen implements CQJSONizeable {
public CQRecordUPDATE_PROFILE_button_Update_Profile_screen(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordUPDATE_PROFILE_button_Update_Profile_screen))
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