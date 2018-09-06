package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordAccount_Overviews_Action implements CQJSONizeable {
public CQRecordAccount_Overviews_Action(){}

public CQRecordAccount_Overviews_Action(String Account1,String Balance_of_Account1,String Available_Amount_of_Account_1,String Account2,String Balance_Account2,String Avilable_Amount_of_Account2,String Total_Amount)
	{
		this.Account1 = Account1;

		this.Balance_of_Account1 = Balance_of_Account1;

		this.Available_Amount_of_Account_1 = Available_Amount_of_Account_1;

		this.Account2 = Account2;

		this.Balance_Account2 = Balance_Account2;

		this.Avilable_Amount_of_Account2 = Avilable_Amount_of_Account2;

		this.Total_Amount = Total_Amount;

	}
 	public String Account1;
	public String getAccount1()
	{
		return this.Account1;
	}

	public void  setAccount1(String Account1)
	{
		this.Account1 = Account1;
	}
 	public String Balance_of_Account1;
	public String getBalance_of_Account1()
	{
		return this.Balance_of_Account1;
	}

	public void  setBalance_of_Account1(String Balance_of_Account1)
	{
		this.Balance_of_Account1 = Balance_of_Account1;
	}
 	public String Available_Amount_of_Account_1;
	public String getAvailable_Amount_of_Account_1()
	{
		return this.Available_Amount_of_Account_1;
	}

	public void  setAvailable_Amount_of_Account_1(String Available_Amount_of_Account_1)
	{
		this.Available_Amount_of_Account_1 = Available_Amount_of_Account_1;
	}
 	public String Account2;
	public String getAccount2()
	{
		return this.Account2;
	}

	public void  setAccount2(String Account2)
	{
		this.Account2 = Account2;
	}
 	public String Balance_Account2;
	public String getBalance_Account2()
	{
		return this.Balance_Account2;
	}

	public void  setBalance_Account2(String Balance_Account2)
	{
		this.Balance_Account2 = Balance_Account2;
	}
 	public String Avilable_Amount_of_Account2;
	public String getAvilable_Amount_of_Account2()
	{
		return this.Avilable_Amount_of_Account2;
	}

	public void  setAvilable_Amount_of_Account2(String Avilable_Amount_of_Account2)
	{
		this.Avilable_Amount_of_Account2 = Avilable_Amount_of_Account2;
	}
 	public String Total_Amount;
	public String getTotal_Amount()
	{
		return this.Total_Amount;
	}

	public void  setTotal_Amount(String Total_Amount)
	{
		this.Total_Amount = Total_Amount;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordAccount_Overviews_Action))
		{
    
			return false;

		}
		CQRecordAccount_Overviews_Action otherRec = (CQRecordAccount_Overviews_Action) other;
		if (!CQEquals.equals(this.Account1, otherRec.Account1))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Balance_of_Account1, otherRec.Balance_of_Account1))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Available_Amount_of_Account_1, otherRec.Available_Amount_of_Account_1))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Account2, otherRec.Account2))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Balance_Account2, otherRec.Balance_Account2))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Avilable_Amount_of_Account2, otherRec.Avilable_Amount_of_Account2))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Total_Amount, otherRec.Total_Amount))
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
		sb.append(indent + "    " + "\"Account1\": ");
		sb.append(CQJSONize.jsonize(Account1, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Balance_of_Account1\": ");
		sb.append(CQJSONize.jsonize(Balance_of_Account1, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Available_Amount_of_Account_1\": ");
		sb.append(CQJSONize.jsonize(Available_Amount_of_Account_1, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Account2\": ");
		sb.append(CQJSONize.jsonize(Account2, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Balance_Account2\": ");
		sb.append(CQJSONize.jsonize(Balance_Account2, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Avilable_Amount_of_Account2\": ");
		sb.append(CQJSONize.jsonize(Avilable_Amount_of_Account2, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Total_Amount\": ");
		sb.append(CQJSONize.jsonize(Total_Amount, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}