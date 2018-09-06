package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Transaction_ID_form implements CQJSONizeable {
public CQRecordFill_Transaction_ID_form(){}

public CQRecordFill_Transaction_ID_form(String Find_By_Transaction_ID)
	{
		this.Find_By_Transaction_ID = Find_By_Transaction_ID;

	}
 	public String Find_By_Transaction_ID;
	public String getFind_By_Transaction_ID()
	{
		return this.Find_By_Transaction_ID;
	}

	public void  setFind_By_Transaction_ID(String Find_By_Transaction_ID)
	{
		this.Find_By_Transaction_ID = Find_By_Transaction_ID;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Transaction_ID_form))
		{
    
			return false;

		}
		CQRecordFill_Transaction_ID_form otherRec = (CQRecordFill_Transaction_ID_form) other;
		if (!CQEquals.equals(this.Find_By_Transaction_ID, otherRec.Find_By_Transaction_ID))
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
		sb.append(indent + "    " + "\"Find_By_Transaction_ID\": ");
		sb.append(CQJSONize.jsonize(Find_By_Transaction_ID, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}