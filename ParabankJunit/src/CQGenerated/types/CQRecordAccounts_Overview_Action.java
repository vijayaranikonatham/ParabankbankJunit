package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordAccounts_Overview_Action implements CQJSONizeable {
public CQRecordAccounts_Overview_Action(){}

public CQRecordAccounts_Overview_Action(String Account,String Balance,String Available_Amount)
	{
		this.Account = Account;

		this.Balance = Balance;

		this.Available_Amount = Available_Amount;

	}
 	public String Account;
	public String getAccount()
	{
		return this.Account;
	}

	public void  setAccount(String Account)
	{
		this.Account = Account;
	}
 	public String Balance;
	public String getBalance()
	{
		return this.Balance;
	}

	public void  setBalance(String Balance)
	{
		this.Balance = Balance;
	}
 	public String Available_Amount;
	public String getAvailable_Amount()
	{
		return this.Available_Amount;
	}

	public void  setAvailable_Amount(String Available_Amount)
	{
		this.Available_Amount = Available_Amount;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordAccounts_Overview_Action))
		{
    
			return false;

		}
		CQRecordAccounts_Overview_Action otherRec = (CQRecordAccounts_Overview_Action) other;
		if (!CQEquals.equals(this.Account, otherRec.Account))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Balance, otherRec.Balance))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Available_Amount, otherRec.Available_Amount))
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
		sb.append(indent + "    " + "\"Account\": ");
		sb.append(CQJSONize.jsonize(Account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Balance\": ");
		sb.append(CQJSONize.jsonize(Balance, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Available_Amount\": ");
		sb.append(CQJSONize.jsonize(Available_Amount, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}