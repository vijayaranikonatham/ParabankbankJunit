package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordAccount_Services_screen implements CQJSONizeable {
public CQRecordAccount_Services_screen(){}

public CQRecordAccount_Services_screen(String Open_New_Account_hyperlink_Status,String Account_Overview_hyperlink_Status,String Transfer_Funds_hyperlink_Status,String Bill_Pay_hyperlink_Status,String Find_Transactions_hyperlink_Status,String Update_Contact_Info_hyperlink_Status,String Request_Loan_hyperlink_Status,String Log_Out_hyperlink_Status)
	{
		this.Open_New_Account_hyperlink_Status = Open_New_Account_hyperlink_Status;

		this.Account_Overview_hyperlink_Status = Account_Overview_hyperlink_Status;

		this.Transfer_Funds_hyperlink_Status = Transfer_Funds_hyperlink_Status;

		this.Bill_Pay_hyperlink_Status = Bill_Pay_hyperlink_Status;

		this.Find_Transactions_hyperlink_Status = Find_Transactions_hyperlink_Status;

		this.Update_Contact_Info_hyperlink_Status = Update_Contact_Info_hyperlink_Status;

		this.Request_Loan_hyperlink_Status = Request_Loan_hyperlink_Status;

		this.Log_Out_hyperlink_Status = Log_Out_hyperlink_Status;

	}
 	public String Open_New_Account_hyperlink_Status;
	public String getOpen_New_Account_hyperlink_Status()
	{
		return this.Open_New_Account_hyperlink_Status;
	}

	public void  setOpen_New_Account_hyperlink_Status(String Open_New_Account_hyperlink_Status)
	{
		this.Open_New_Account_hyperlink_Status = Open_New_Account_hyperlink_Status;
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
 	public String Transfer_Funds_hyperlink_Status;
	public String getTransfer_Funds_hyperlink_Status()
	{
		return this.Transfer_Funds_hyperlink_Status;
	}

	public void  setTransfer_Funds_hyperlink_Status(String Transfer_Funds_hyperlink_Status)
	{
		this.Transfer_Funds_hyperlink_Status = Transfer_Funds_hyperlink_Status;
	}
 	public String Bill_Pay_hyperlink_Status;
	public String getBill_Pay_hyperlink_Status()
	{
		return this.Bill_Pay_hyperlink_Status;
	}

	public void  setBill_Pay_hyperlink_Status(String Bill_Pay_hyperlink_Status)
	{
		this.Bill_Pay_hyperlink_Status = Bill_Pay_hyperlink_Status;
	}
 	public String Find_Transactions_hyperlink_Status;
	public String getFind_Transactions_hyperlink_Status()
	{
		return this.Find_Transactions_hyperlink_Status;
	}

	public void  setFind_Transactions_hyperlink_Status(String Find_Transactions_hyperlink_Status)
	{
		this.Find_Transactions_hyperlink_Status = Find_Transactions_hyperlink_Status;
	}
 	public String Update_Contact_Info_hyperlink_Status;
	public String getUpdate_Contact_Info_hyperlink_Status()
	{
		return this.Update_Contact_Info_hyperlink_Status;
	}

	public void  setUpdate_Contact_Info_hyperlink_Status(String Update_Contact_Info_hyperlink_Status)
	{
		this.Update_Contact_Info_hyperlink_Status = Update_Contact_Info_hyperlink_Status;
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
 	public String Log_Out_hyperlink_Status;
	public String getLog_Out_hyperlink_Status()
	{
		return this.Log_Out_hyperlink_Status;
	}

	public void  setLog_Out_hyperlink_Status(String Log_Out_hyperlink_Status)
	{
		this.Log_Out_hyperlink_Status = Log_Out_hyperlink_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordAccount_Services_screen))
		{
    
			return false;

		}
		CQRecordAccount_Services_screen otherRec = (CQRecordAccount_Services_screen) other;
		if (!CQEquals.equals(this.Open_New_Account_hyperlink_Status, otherRec.Open_New_Account_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Account_Overview_hyperlink_Status, otherRec.Account_Overview_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Transfer_Funds_hyperlink_Status, otherRec.Transfer_Funds_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Bill_Pay_hyperlink_Status, otherRec.Bill_Pay_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Find_Transactions_hyperlink_Status, otherRec.Find_Transactions_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Update_Contact_Info_hyperlink_Status, otherRec.Update_Contact_Info_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Request_Loan_hyperlink_Status, otherRec.Request_Loan_hyperlink_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Log_Out_hyperlink_Status, otherRec.Log_Out_hyperlink_Status))
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
		sb.append(indent + "    " + "\"Open_New_Account_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Open_New_Account_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Account_Overview_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Account_Overview_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Transfer_Funds_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Transfer_Funds_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Bill_Pay_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Bill_Pay_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Find_Transactions_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Find_Transactions_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Update_Contact_Info_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Update_Contact_Info_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Request_Loan_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Request_Loan_hyperlink_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Log_Out_hyperlink_Status\": ");
		sb.append(CQJSONize.jsonize(Log_Out_hyperlink_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}