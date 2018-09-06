package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordDate_Range_form implements CQJSONizeable {
public CQRecordDate_Range_form(){}

public CQRecordDate_Range_form(String Between,String Between_textbox_Status,String Find_Transactions_button_Status,String And,String And_textbox_Status)
	{
		this.Between = Between;

		this.Between_textbox_Status = Between_textbox_Status;

		this.Find_Transactions_button_Status = Find_Transactions_button_Status;

		this.And = And;

		this.And_textbox_Status = And_textbox_Status;

	}
 	public String Between;
	public String getBetween()
	{
		return this.Between;
	}

	public void  setBetween(String Between)
	{
		this.Between = Between;
	}
 	public String Between_textbox_Status;
	public String getBetween_textbox_Status()
	{
		return this.Between_textbox_Status;
	}

	public void  setBetween_textbox_Status(String Between_textbox_Status)
	{
		this.Between_textbox_Status = Between_textbox_Status;
	}
 	public String Find_Transactions_button_Status;
	public String getFind_Transactions_button_Status()
	{
		return this.Find_Transactions_button_Status;
	}

	public void  setFind_Transactions_button_Status(String Find_Transactions_button_Status)
	{
		this.Find_Transactions_button_Status = Find_Transactions_button_Status;
	}
 	public String And;
	public String getAnd()
	{
		return this.And;
	}

	public void  setAnd(String And)
	{
		this.And = And;
	}
 	public String And_textbox_Status;
	public String getAnd_textbox_Status()
	{
		return this.And_textbox_Status;
	}

	public void  setAnd_textbox_Status(String And_textbox_Status)
	{
		this.And_textbox_Status = And_textbox_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordDate_Range_form))
		{
    
			return false;

		}
		CQRecordDate_Range_form otherRec = (CQRecordDate_Range_form) other;
		if (!CQEquals.equals(this.Between, otherRec.Between))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Between_textbox_Status, otherRec.Between_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Find_Transactions_button_Status, otherRec.Find_Transactions_button_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.And, otherRec.And))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.And_textbox_Status, otherRec.And_textbox_Status))
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
		sb.append(indent + "    " + "\"Between\": ");
		sb.append(CQJSONize.jsonize(Between, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Between_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Between_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Find_Transactions_button_Status\": ");
		sb.append(CQJSONize.jsonize(Find_Transactions_button_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"And\": ");
		sb.append(CQJSONize.jsonize(And, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"And_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(And_textbox_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}