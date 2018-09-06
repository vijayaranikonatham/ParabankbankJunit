package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordProfile_Updated_Action implements CQJSONizeable {
public CQRecordProfile_Updated_Action(){}

public CQRecordProfile_Updated_Action(String message)
	{
		this.message = message;

	}
 	public String message;
	public String getmessage()
	{
		return this.message;
	}

	public void  setmessage(String message)
	{
		this.message = message;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordProfile_Updated_Action))
		{
    
			return false;

		}
		CQRecordProfile_Updated_Action otherRec = (CQRecordProfile_Updated_Action) other;
		if (!CQEquals.equals(this.message, otherRec.message))
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
		sb.append(indent + "    " + "\"message\": ");
		sb.append(CQJSONize.jsonize(message, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}