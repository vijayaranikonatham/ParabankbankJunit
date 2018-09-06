package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordTransfer_Funds_screen implements CQJSONizeable {
public CQRecordTransfer_Funds_screen(){}

public CQRecordTransfer_Funds_screen(CQRecordTransfer_Funds_form Transfer_Funds_form,String TRANSFER_button_Status)
	{
		this.Transfer_Funds_form = Transfer_Funds_form;

		this.TRANSFER_button_Status = TRANSFER_button_Status;

	}
 	public CQRecordTransfer_Funds_form Transfer_Funds_form;
	public CQRecordTransfer_Funds_form getTransfer_Funds_form()
	{
		return this.Transfer_Funds_form;
	}

	public void  setTransfer_Funds_form(CQRecordTransfer_Funds_form Transfer_Funds_form)
	{
		this.Transfer_Funds_form = Transfer_Funds_form;
	}
 	public String TRANSFER_button_Status;
	public String getTRANSFER_button_Status()
	{
		return this.TRANSFER_button_Status;
	}

	public void  setTRANSFER_button_Status(String TRANSFER_button_Status)
	{
		this.TRANSFER_button_Status = TRANSFER_button_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordTransfer_Funds_screen))
		{
    
			return false;

		}
		CQRecordTransfer_Funds_screen otherRec = (CQRecordTransfer_Funds_screen) other;
		if (!CQEquals.equals(this.Transfer_Funds_form, otherRec.Transfer_Funds_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.TRANSFER_button_Status, otherRec.TRANSFER_button_Status))
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
		sb.append(indent + "    " + "\"Transfer_Funds_form\": ");
		sb.append(CQJSONize.jsonize(Transfer_Funds_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"TRANSFER_button_Status\": ");
		sb.append(CQJSONize.jsonize(TRANSFER_button_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}