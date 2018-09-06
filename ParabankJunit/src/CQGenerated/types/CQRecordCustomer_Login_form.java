package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordCustomer_Login_form implements CQJSONizeable {
public CQRecordCustomer_Login_form(){}

public CQRecordCustomer_Login_form(String Username,String Username_textbox_Status,String Password,String Password_textbox_Status,String LOG_IN_button_Status,String Register_hyperlink_Status,String Forgot_login_info__hyperlink_Status)
	{
		this.Username = Username;

		this.Username_textbox_Status = Username_textbox_Status;

		this.Password = Password;

		this.Password_textbox_Status = Password_textbox_Status;

		this.LOG_IN_button_Status = LOG_IN_button_Status;

		this.Register_hyperlink_Status = Register_hyperlink_Status;

		this.Forgot_login_info__hyperlink_Status = Forgot_login_info__hyperlink_Status;

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
 	public String Username_textbox_Status;
	public String getUsername_textbox_Status()
	{
		return this.Username_textbox_Status;
	}

	public void  setUsername_textbox_Status(String Username_textbox_Status)
	{
		this.Username_textbox_Status = Username_textbox_Status;
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
 	public String Password_textbox_Status;
	public String getPassword_textbox_Status()
	{
		return this.Password_textbox_Status;
	}

	public void  setPassword_textbox_Status(String Password_textbox_Status)
	{
		this.Password_textbox_Status = Password_textbox_Status;
	}
 	public String LOG_IN_button_Status;
	public String getLOG_IN_button_Status()
	{
		return this.LOG_IN_button_Status;
	}

	public void  setLOG_IN_button_Status(String LOG_IN_button_Status)
	{
		this.LOG_IN_button_Status = LOG_IN_button_Status;
	}
 	public String Register_hyperlink_Status;
	public String getRegister_hyperlink_Status()
	{
		return this.Register_hyperlink_Status;
	}

	public void  setRegister_hyperlink_Status(String Register_hyperlink_Status)
	{
		this.Register_hyperlink_Status = Register_hyperlink_Status;
	}
 	public String Forgot_login_info__hyperlink_Status;
	public String getForgot_login_info__hyperlink_Status()
	{
		return this.Forgot_login_info__hyperlink_Status;
	}

	public void  setForgot_login_info__hyperlink_Status(String Forgot_login_info__hyperlink_Status)
	{
		this.Forgot_login_info__hyperlink_Status = Forgot_login_info__hyperlink_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordCustomer_Login_form))
		{
    
			return false;

		}
		CQRecordCustomer_Login_form otherRec = (CQRecordCustomer_Login_form) other;
		if (!CQEquals.equals(this.Username, otherRec.Username))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Username_textbox_Status, otherRec.Username_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Password, otherRec.Password))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Password_textbox_Status, otherRec.Password_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.LOG_IN_button_Status, otherRec.LOG_IN_button_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Register_hyperlink_Status, otherRec.Register_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Forgot_login_info__hyperlink_Status, otherRec.Forgot_login_info__hyperlink_Status))
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
		sb.append(indent + "    " + "\"Username_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Username_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Password\": ");
		sb.append(CQJSONize.jsonize(Password, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Password_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Password_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"LOG_IN_button_Status\": ");
		sb.append(CQJSONize.jsonize(LOG_IN_button_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Register_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Register_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Forgot_login_info__hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Forgot_login_info__hyperlink_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}