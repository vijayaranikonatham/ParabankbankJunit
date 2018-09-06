package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordNew_Account_Action implements CQJSONizeable {
public CQRecordNew_Account_Action(){}

public CQRecordNew_Account_Action(String message,String Account_Number)
	{
		this.message = message;

		this.Account_Number = Account_Number;

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
 	public String Account_Number;
	public String getAccount_Number()
	{
		return this.Account_Number;
	}

	public void  setAccount_Number(String Account_Number)
	{
		this.Account_Number = Account_Number;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordNew_Account_Action))
		{
    
			return false;

		}
		CQRecordNew_Account_Action otherRec = (CQRecordNew_Account_Action) other;
		if (!CQEquals.equals(this.message, otherRec.message))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Account_Number, otherRec.Account_Number))
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
		sb.append(",\n");
		sb.append(indent + "    " + "\"Account_Number\": ");
		sb.append(CQJSONize.jsonize(Account_Number, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}