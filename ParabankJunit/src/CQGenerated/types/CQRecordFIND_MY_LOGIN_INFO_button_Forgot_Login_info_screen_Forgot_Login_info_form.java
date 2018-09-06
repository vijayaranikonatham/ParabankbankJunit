package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFIND_MY_LOGIN_INFO_button_Forgot_Login_info_screen_Forgot_Login_info_form implements CQJSONizeable {
public CQRecordFIND_MY_LOGIN_INFO_button_Forgot_Login_info_screen_Forgot_Login_info_form(){}

	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFIND_MY_LOGIN_INFO_button_Forgot_Login_info_screen_Forgot_Login_info_form))
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