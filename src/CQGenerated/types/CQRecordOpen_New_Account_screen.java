package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordOpen_New_Account_screen implements CQJSONizeable {
public CQRecordOpen_New_Account_screen(){}

public CQRecordOpen_New_Account_screen(CQRecordNew_Account_form New_Account_form,String Open_New_Account_button_Status,String Account_Overview_hyperlink_Status,String Request_Loan_hyperlink_Status)
	{
		this.New_Account_form = New_Account_form;

		this.Open_New_Account_button_Status = Open_New_Account_button_Status;

		this.Account_Overview_hyperlink_Status = Account_Overview_hyperlink_Status;

		this.Request_Loan_hyperlink_Status = Request_Loan_hyperlink_Status;

	}
 	public CQRecordNew_Account_form New_Account_form;
	public CQRecordNew_Account_form getNew_Account_form()
	{
		return this.New_Account_form;
	}

	public void  setNew_Account_form(CQRecordNew_Account_form New_Account_form)
	{
		this.New_Account_form = New_Account_form;
	}
 	public String Open_New_Account_button_Status;
	public String getOpen_New_Account_button_Status()
	{
		return this.Open_New_Account_button_Status;
	}

	public void  setOpen_New_Account_button_Status(String Open_New_Account_button_Status)
	{
		this.Open_New_Account_button_Status = Open_New_Account_button_Status;
	}
 	public String Account_Overview_hyperlink_Status;
	public String getAccount_Overview_hyperlink_Status()
	{
		return this.Account_Overview_hyperlink_Status;
	}

	public void  setAccount_Overview_hyperlink_Status(String Account_Overview_hyperlink_Status)
	{
		this.Account_Overview_hyperlink_Status = Account_Overview_hyperlink_Status;
	}
 	public String Request_Loan_hyperlink_Status;
	public String getRequest_Loan_hyperlink_Status()
	{
		return this.Request_Loan_hyperlink_Status;
	}

	public void  setRequest_Loan_hyperlink_Status(String Request_Loan_hyperlink_Status)
	{
		this.Request_Loan_hyperlink_Status = Request_Loan_hyperlink_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordOpen_New_Account_screen))
		{
    
			return false;

		}
		CQRecordOpen_New_Account_screen otherRec = (CQRecordOpen_New_Account_screen) other;
		if (!CQEquals.equals(this.New_Account_form, otherRec.New_Account_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Open_New_Account_button_Status, otherRec.Open_New_Account_button_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Account_Overview_hyperlink_Status, otherRec.Account_Overview_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Request_Loan_hyperlink_Status, otherRec.Request_Loan_hyperlink_Status))
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
		sb.append(indent + "    " + "\"New_Account_form\": ");
		sb.append(CQJSONize.jsonize(New_Account_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Open_New_Account_button_Status\": ");
		sb.append(CQJSONize.jsonize(Open_New_Account_button_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Account_Overview_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Account_Overview_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Request_Loan_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Request_Loan_hyperlink_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}