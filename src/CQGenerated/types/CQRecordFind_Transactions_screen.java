package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFind_Transactions_screen implements CQJSONizeable {
public CQRecordFind_Transactions_screen(){}

public CQRecordFind_Transactions_screen(CQRecordTransaction_form Transaction_form,CQRecordTransaction_ID_form Transaction_ID_form,CQRecordDate_Range_form Date_Range_form,CQRecordFind_By_Amount_form Find_By_Amount_form,CQRecordTransaction_By_Date_form Transaction_By_Date_form)
	{
		this.Transaction_form = Transaction_form;

		this.Transaction_ID_form = Transaction_ID_form;

		this.Date_Range_form = Date_Range_form;

		this.Find_By_Amount_form = Find_By_Amount_form;

		this.Transaction_By_Date_form = Transaction_By_Date_form;

	}
 	public CQRecordTransaction_form Transaction_form;
	public CQRecordTransaction_form getTransaction_form()
	{
		return this.Transaction_form;
	}

	public void  setTransaction_form(CQRecordTransaction_form Transaction_form)
	{
		this.Transaction_form = Transaction_form;
	}
 	public CQRecordTransaction_ID_form Transaction_ID_form;
	public CQRecordTransaction_ID_form getTransaction_ID_form()
	{
		return this.Transaction_ID_form;
	}

	public void  setTransaction_ID_form(CQRecordTransaction_ID_form Transaction_ID_form)
	{
		this.Transaction_ID_form = Transaction_ID_form;
	}
 	public CQRecordDate_Range_form Date_Range_form;
	public CQRecordDate_Range_form getDate_Range_form()
	{
		return this.Date_Range_form;
	}

	public void  setDate_Range_form(CQRecordDate_Range_form Date_Range_form)
	{
		this.Date_Range_form = Date_Range_form;
	}
 	public CQRecordFind_By_Amount_form Find_By_Amount_form;
	public CQRecordFind_By_Amount_form getFind_By_Amount_form()
	{
		return this.Find_By_Amount_form;
	}

	public void  setFind_By_Amount_form(CQRecordFind_By_Amount_form Find_By_Amount_form)
	{
		this.Find_By_Amount_form = Find_By_Amount_form;
	}
 	public CQRecordTransaction_By_Date_form Transaction_By_Date_form;
	public CQRecordTransaction_By_Date_form getTransaction_By_Date_form()
	{
		return this.Transaction_By_Date_form;
	}

	public void  setTransaction_By_Date_form(CQRecordTransaction_By_Date_form Transaction_By_Date_form)
	{
		this.Transaction_By_Date_form = Transaction_By_Date_form;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFind_Transactions_screen))
		{
    
			return false;

		}
		CQRecordFind_Transactions_screen otherRec = (CQRecordFind_Transactions_screen) other;
		if (!CQEquals.equals(this.Transaction_form, otherRec.Transaction_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Transaction_ID_form, otherRec.Transaction_ID_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Date_Range_form, otherRec.Date_Range_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Find_By_Amount_form, otherRec.Find_By_Amount_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Transaction_By_Date_form, otherRec.Transaction_By_Date_form))
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
		sb.append(indent + "    " + "\"Transaction_form\": ");
		sb.append(CQJSONize.jsonize(Transaction_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Transaction_ID_form\": ");
		sb.append(CQJSONize.jsonize(Transaction_ID_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Date_Range_form\": ");
		sb.append(CQJSONize.jsonize(Date_Range_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Find_By_Amount_form\": ");
		sb.append(CQJSONize.jsonize(Find_By_Amount_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Transaction_By_Date_form\": ");
		sb.append(CQJSONize.jsonize(Transaction_By_Date_form, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}