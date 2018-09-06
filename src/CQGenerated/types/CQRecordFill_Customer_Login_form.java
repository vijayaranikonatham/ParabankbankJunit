package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Customer_Login_form implements CQJSONizeable {
public CQRecordFill_Customer_Login_form(){}

public CQRecordFill_Customer_Login_form(String Username,String Password)
	{
		this.Username = Username;

		this.Password = Password;

	}
 	public String Username;
	public String getUsername()
	{
		return this.Username;
	}

	public void  setUsername(String Username)
	{
		this.Username = Username;
	}
 	public String Password;
	public String getPassword()
	{
		return this.Password;
	}

	public void  setPassword(String Password)
	{
		this.Password = Password;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Customer_Login_form))
		{
    
			return false;

		}
		CQRecordFill_Customer_Login_form otherRec = (CQRecordFill_Customer_Login_form) other;
		if (!CQEquals.equals(this.Username, otherRec.Username))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Password, otherRec.Password))
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
		sb.append(indent + "    " + "\"Username\": ");
		sb.append(CQJSONize.jsonize(Username, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Password\": ");
		sb.append(CQJSONize.jsonize(Password, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}