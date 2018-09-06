package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordClick_Transaction_Action implements CQJSONizeable {
public CQRecordClick_Transaction_Action(){}

public CQRecordClick_Transaction_Action(String Click)
	{
		this.Click = Click;

	}
 	public String Click;
	public String getClick()
	{
		return this.Click;
	}

	public void  setClick(String Click)
	{
		this.Click = Click;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordClick_Transaction_Action))
		{
    
			return false;

		}
		CQRecordClick_Transaction_Action otherRec = (CQRecordClick_Transaction_Action) other;
		if (!CQEquals.equals(this.Click, otherRec.Click))
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
		sb.append(indent + "    " + "\"Click\": ");
		sb.append(CQJSONize.jsonize(Click, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}