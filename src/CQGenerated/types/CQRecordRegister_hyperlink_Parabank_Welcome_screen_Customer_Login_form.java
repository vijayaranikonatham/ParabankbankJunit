package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordRegister_hyperlink_Parabank_Welcome_screen_Customer_Login_form implements CQJSONizeable {
public CQRecordRegister_hyperlink_Parabank_Welcome_screen_Customer_Login_form(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordRegister_hyperlink_Parabank_Welcome_screen_Customer_Login_form))
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