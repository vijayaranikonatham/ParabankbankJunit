package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordBill_Payment_Complete_Action implements CQJSONizeable {
public CQRecordBill_Payment_Complete_Action(){}

public CQRecordBill_Payment_Complete_Action(String Bill_Payment)
	{
		this.Bill_Payment = Bill_Payment;

	}
 	public String Bill_Payment;
	public String getBill_Payment()
	{
		return this.Bill_Payment;
	}

	public void  setBill_Payment(String Bill_Payment)
	{
		this.Bill_Payment = Bill_Payment;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordBill_Payment_Complete_Action))
		{
    
			return false;

		}
		CQRecordBill_Payment_Complete_Action otherRec = (CQRecordBill_Payment_Complete_Action) other;
		if (!CQEquals.equals(this.Bill_Payment, otherRec.Bill_Payment))
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
		sb.append(indent + "    " + "\"Bill_Payment\": ");
		sb.append(CQJSONize.jsonize(Bill_Payment, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}