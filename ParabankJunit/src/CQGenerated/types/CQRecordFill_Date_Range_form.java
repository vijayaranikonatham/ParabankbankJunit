package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Date_Range_form implements CQJSONizeable {
public CQRecordFill_Date_Range_form(){}

public CQRecordFill_Date_Range_form(String Between,String And)
	{
		this.Between = Between;

		this.And = And;

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
 	public String And;
	public String getAnd()
	{
		return this.And;
	}

	public void  setAnd(String And)
	{
		this.And = And;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Date_Range_form))
		{
    
			return false;

		}
		CQRecordFill_Date_Range_form otherRec = (CQRecordFill_Date_Range_form) other;
		if (!CQEquals.equals(this.Between, otherRec.Between))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.And, otherRec.And))
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
		sb.append(indent + "    " + "\"And\": ");
		sb.append(CQJSONize.jsonize(And, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}