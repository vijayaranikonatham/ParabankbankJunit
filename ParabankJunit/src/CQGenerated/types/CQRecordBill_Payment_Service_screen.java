package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordBill_Payment_Service_screen implements CQJSONizeable {
public CQRecordBill_Payment_Service_screen(){}

public CQRecordBill_Payment_Service_screen(CQRecordPayee_Information_form Payee_Information_form,String SEND_PAYMENT_button_Status)
	{
		this.Payee_Information_form = Payee_Information_form;

		this.SEND_PAYMENT_button_Status = SEND_PAYMENT_button_Status;

	}
 	public CQRecordPayee_Information_form Payee_Information_form;
	public CQRecordPayee_Information_form getPayee_Information_form()
	{
		return this.Payee_Information_form;
	}

	public void  setPayee_Information_form(CQRecordPayee_Information_form Payee_Information_form)
	{
		this.Payee_Information_form = Payee_Information_form;
	}
 	public String SEND_PAYMENT_button_Status;
	public String getSEND_PAYMENT_button_Status()
	{
		return this.SEND_PAYMENT_button_Status;
	}

	public void  setSEND_PAYMENT_button_Status(String SEND_PAYMENT_button_Status)
	{
		this.SEND_PAYMENT_button_Status = SEND_PAYMENT_button_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordBill_Payment_Service_screen))
		{
    
			return false;

		}
		CQRecordBill_Payment_Service_screen otherRec = (CQRecordBill_Payment_Service_screen) other;
		if (!CQEquals.equals(this.Payee_Information_form, otherRec.Payee_Information_form))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.SEND_PAYMENT_button_Status, otherRec.SEND_PAYMENT_button_Status))
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
		sb.append(indent + "    " + "\"Payee_Information_form\": ");
		sb.append(CQJSONize.jsonize(Payee_Information_form, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"SEND_PAYMENT_button_Status\": ");
		sb.append(CQJSONize.jsonize(SEND_PAYMENT_button_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}