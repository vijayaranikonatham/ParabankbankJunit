package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordRIGISTER_button_Register_screen_Signup_form implements CQJSONizeable {
public CQRecordRIGISTER_button_Register_screen_Signup_form(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordRIGISTER_button_Register_screen_Signup_form))
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