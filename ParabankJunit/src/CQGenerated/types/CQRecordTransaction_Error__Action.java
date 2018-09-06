package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTransaction_Error__Action implements CQJSONizeable {
public CQRecordTransaction_Error__Action(){}

public CQRecordTransaction_Error__Action(String Error)
	{
		this.Error = Error;

	}
 	public String Error;
	public String getError()
	{
		return this.Error;
	}

	public void  setError(String Error)
	{
		this.Error = Error;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTransaction_Error__Action))
		{
    
			return false;

		}
		CQRecordTransaction_Error__Action otherRec = (CQRecordTransaction_Error__Action) other;
		if (!CQEquals.equals(this.Error, otherRec.Error))
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
		sb.append(indent + "    " + "\"Error\": ");
		sb.append(CQJSONize.jsonize(Error, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}