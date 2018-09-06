package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordParabank_Welcome_screen implements CQJSONizeable {
public CQRecordParabank_Welcome_screen(){}

public CQRecordParabank_Welcome_screen(CQRecordCustomer_Login_form Customer_Login_form,String Admin_Page_hyperlink_Status)
	{
		this.Customer_Login_form = Customer_Login_form;

		this.Admin_Page_hyperlink_Status = Admin_Page_hyperlink_Status;

	}
 	public CQRecordCustomer_Login_form Customer_Login_form;
	public CQRecordCustomer_Login_form getCustomer_Login_form()
	{
		return this.Customer_Login_form;
	}

	public void  setCustomer_Login_form(CQRecordCustomer_Login_form Customer_Login_form)
	{
		this.Customer_Login_form = Customer_Login_form;
	}
 	public String Admin_Page_hyperlink_Status;
	public String getAdmin_Page_hyperlink_Status()
	{
		return this.Admin_Page_hyperlink_Status;
	}

	public void  setAdmin_Page_hyperlink_Status(String Admin_Page_hyperlink_Status)
	{
		this.Admin_Page_hyperlink_Status = Admin_Page_hyperlink_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordParabank_Welcome_screen))
		{
    
			return false;

		}
		CQRecordParabank_Welcome_screen otherRec = (CQRecordParabank_Welcome_screen) other;
		if (!CQEquals.equals(this.Customer_Login_form, otherRec.Customer_Login_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Admin_Page_hyperlink_Status, otherRec.Admin_Page_hyperlink_Status))
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
		sb.append(indent + "    " + "\"Customer_Login_form\": ");
		sb.append(CQJSONize.jsonize(Customer_Login_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Admin_Page_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Admin_Page_hyperlink_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}