package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordSUBMIT_button_Administration_screen implements CQJSONizeable {
public CQRecordSUBMIT_button_Administration_screen(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordSUBMIT_button_Administration_screen))
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