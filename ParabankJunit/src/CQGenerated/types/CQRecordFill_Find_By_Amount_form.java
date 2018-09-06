package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Find_By_Amount_form implements CQJSONizeable {
public CQRecordFill_Find_By_Amount_form(){}

public CQRecordFill_Find_By_Amount_form(String Find_By_Amount)
	{
		this.Find_By_Amount = Find_By_Amount;

	}
 	public String Find_By_Amount;
	public String getFind_By_Amount()
	{
		return this.Find_By_Amount;
	}

	public void  setFind_By_Amount(String Find_By_Amount)
	{
		this.Find_By_Amount = Find_By_Amount;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Find_By_Amount_form))
		{
    
			return false;

		}
		CQRecordFill_Find_By_Amount_form otherRec = (CQRecordFill_Find_By_Amount_form) other;
		if (!CQEquals.equals(this.Find_By_Amount, otherRec.Find_By_Amount))
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
		sb.append(indent + "    " + "\"Find_By_Amount\": ");
		sb.append(CQJSONize.jsonize(Find_By_Amount, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}