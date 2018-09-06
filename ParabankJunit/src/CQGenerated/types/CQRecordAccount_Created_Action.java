package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordAccount_Created_Action implements CQJSONizeable {
public CQRecordAccount_Created_Action(){}

public CQRecordAccount_Created_Action(String message)
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
		if (!(other instanceof CQRecordAccount_Created_Action))
		{
    
			return false;

		}
		CQRecordAccount_Created_Action otherRec = (CQRecordAccount_Created_Action) other;
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