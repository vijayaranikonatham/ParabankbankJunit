package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTransaction_Details_Action implements CQJSONizeable {
public CQRecordTransaction_Details_Action(){}

public CQRecordTransaction_Details_Action(String Transaction_ID,String Date,String Description,String Type,String Amount)
	{
		this.Transaction_ID = Transaction_ID;

		this.Date = Date;

		this.Description = Description;

		this.Type = Type;

		this.Amount = Amount;

	}
 	public String Transaction_ID;
	public String getTransaction_ID()
	{
		return this.Transaction_ID;
	}

	public void  setTransaction_ID(String Transaction_ID)
	{
		this.Transaction_ID = Transaction_ID;
	}
 	public String Date;
	public String getDate()
	{
		return this.Date;
	}

	public void  setDate(String Date)
	{
		this.Date = Date;
	}
 	public String Description;
	public String getDescription()
	{
		return this.Description;
	}

	public void  setDescription(String Description)
	{
		this.Description = Description;
	}
 	public String Type;
	public String getType()
	{
		return this.Type;
	}

	public void  setType(String Type)
	{
		this.Type = Type;
	}
 	public String Amount;
	public String getAmount()
	{
		return this.Amount;
	}

	public void  setAmount(String Amount)
	{
		this.Amount = Amount;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTransaction_Details_Action))
		{
    
			return false;

		}
		CQRecordTransaction_Details_Action otherRec = (CQRecordTransaction_Details_Action) other;
		if (!CQEquals.equals(this.Transaction_ID, otherRec.Transaction_ID))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Date, otherRec.Date))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Description, otherRec.Description))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Type, otherRec.Type))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Amount, otherRec.Amount))
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
		sb.append(indent + "    " + "\"Transaction_ID\": ");
		sb.append(CQJSONize.jsonize(Transaction_ID, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Date\": ");
		sb.append(CQJSONize.jsonize(Date, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Description\": ");
		sb.append(CQJSONize.jsonize(Description, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Type\": ");
		sb.append(CQJSONize.jsonize(Type, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Amount\": ");
		sb.append(CQJSONize.jsonize(Amount, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}