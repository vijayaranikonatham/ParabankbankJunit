package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordInvalid_Register_Action implements CQJSONizeable {
public CQRecordInvalid_Register_Action(){}

public CQRecordInvalid_Register_Action(String Invalid_Register)
	{
		this.Invalid_Register = Invalid_Register;

	}
 	public String Invalid_Register;
	public String getInvalid_Register()
	{
		return this.Invalid_Register;
	}

	public void  setInvalid_Register(String Invalid_Register)
	{
		this.Invalid_Register = Invalid_Register;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordInvalid_Register_Action))
		{
    
			return false;

		}
		CQRecordInvalid_Register_Action otherRec = (CQRecordInvalid_Register_Action) other;
		if (!CQEquals.equals(this.Invalid_Register, otherRec.Invalid_Register))
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
		sb.append(indent + "    " + "\"Invalid_Register\": ");
		sb.append(CQJSONize.jsonize(Invalid_Register, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}