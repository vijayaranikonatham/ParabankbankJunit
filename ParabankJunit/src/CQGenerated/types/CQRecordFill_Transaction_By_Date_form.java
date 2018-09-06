package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Transaction_By_Date_form implements CQJSONizeable {
public CQRecordFill_Transaction_By_Date_form(){}

public CQRecordFill_Transaction_By_Date_form(String Find_By_Date)
	{
		this.Find_By_Date = Find_By_Date;

	}
 	public String Find_By_Date;
	public String getFind_By_Date()
	{
		return this.Find_By_Date;
	}

	public void  setFind_By_Date(String Find_By_Date)
	{
		this.Find_By_Date = Find_By_Date;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Transaction_By_Date_form))
		{
    
			return false;

		}
		CQRecordFill_Transaction_By_Date_form otherRec = (CQRecordFill_Transaction_By_Date_form) other;
		if (!CQEquals.equals(this.Find_By_Date, otherRec.Find_By_Date))
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
		sb.append(indent + "    " + "\"Find_By_Date\": ");
		sb.append(CQJSONize.jsonize(Find_By_Date, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}