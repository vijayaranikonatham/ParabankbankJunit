package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTransaction_Result_screen implements CQJSONizeable {
public CQRecordTransaction_Result_screen(){}

public CQRecordTransaction_Result_screen(CQRecordResult_UI_table[] Result_UI_table)
	{
		this.Result_UI_table = Result_UI_table;

	}
 	public CQRecordResult_UI_table[] Result_UI_table;
	public CQRecordResult_UI_table[] getResult_UI_table()
	{
		return this.Result_UI_table;
	}

	public void  setResult_UI_table(CQRecordResult_UI_table[] Result_UI_table)
	{
		this.Result_UI_table = Result_UI_table;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTransaction_Result_screen))
		{
    
			return false;

		}
		CQRecordTransaction_Result_screen otherRec = (CQRecordTransaction_Result_screen) other;
		if (!CQEquals.equals(this.Result_UI_table, otherRec.Result_UI_table))
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
		sb.append(indent + "    " + "\"Result_UI_table\": ");
		sb.append(CQJSONize.jsonize(Result_UI_table, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}