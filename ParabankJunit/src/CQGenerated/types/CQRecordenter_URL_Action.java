package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordenter_URL_Action implements CQJSONizeable {
public CQRecordenter_URL_Action(){}

public CQRecordenter_URL_Action(String url)
	{
		this.url = url;

	}
 	public String url;
	public String geturl()
	{
		return this.url;
	}

	public void  seturl(String url)
	{
		this.url = url;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordenter_URL_Action))
		{
    
			return false;

		}
		CQRecordenter_URL_Action otherRec = (CQRecordenter_URL_Action) other;
		if (!CQEquals.equals(this.url, otherRec.url))
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
		sb.append(indent + "    " + "\"url\": ");
		sb.append(CQJSONize.jsonize(url, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}