package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Payee_Information_form implements CQJSONizeable {
public CQRecordFill_Payee_Information_form(){}

public CQRecordFill_Payee_Information_form(String Payee_Name,String Address,String City,String State,String Zip_Code,String Phone,String Account,String Verify_Account,String Amount,String From_Account)
	{
		this.Payee_Name = Payee_Name;

		this.Address = Address;

		this.City = City;

		this.State = State;

		this.Zip_Code = Zip_Code;

		this.Phone = Phone;

		this.Account = Account;

		this.Verify_Account = Verify_Account;

		this.Amount = Amount;

		this.From_Account = From_Account;

	}
 	public String Payee_Name;
	public String getPayee_Name()
	{
		return this.Payee_Name;
	}

	public void  setPayee_Name(String Payee_Name)
	{
		this.Payee_Name = Payee_Name;
	}
 	public String Address;
	public String getAddress()
	{
		return this.Address;
	}

	public void  setAddress(String Address)
	{
		this.Address = Address;
	}
 	public String City;
	public String getCity()
	{
		return this.City;
	}

	public void  setCity(String City)
	{
		this.City = City;
	}
 	public String State;
	public String getState()
	{
		return this.State;
	}

	public void  setState(String State)
	{
		this.State = State;
	}
 	public String Zip_Code;
	public String getZip_Code()
	{
		return this.Zip_Code;
	}

	public void  setZip_Code(String Zip_Code)
	{
		this.Zip_Code = Zip_Code;
	}
 	public String Phone;
	public String getPhone()
	{
		return this.Phone;
	}

	public void  setPhone(String Phone)
	{
		this.Phone = Phone;
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
 	public String Verify_Account;
	public String getVerify_Account()
	{
		return this.Verify_Account;
	}

	public void  setVerify_Account(String Verify_Account)
	{
		this.Verify_Account = Verify_Account;
	}
 	public String Amount;
	public String getAmount()
	{
		return this.Amount;
	}

	public void  setAmount(String Amount)
	{
		this.Amount = Amount;
	}
 	public String From_Account;
	public String getFrom_Account()
	{
		return this.From_Account;
	}

	public void  setFrom_Account(String From_Account)
	{
		this.From_Account = From_Account;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Payee_Information_form))
		{
    
			return false;

		}
		CQRecordFill_Payee_Information_form otherRec = (CQRecordFill_Payee_Information_form) other;
		if (!CQEquals.equals(this.Payee_Name, otherRec.Payee_Name))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Address, otherRec.Address))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.City, otherRec.City))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.State, otherRec.State))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Zip_Code, otherRec.Zip_Code))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Phone, otherRec.Phone))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Account, otherRec.Account))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Verify_Account, otherRec.Verify_Account))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Amount, otherRec.Amount))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.From_Account, otherRec.From_Account))
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
		sb.append(indent + "    " + "\"Payee_Name\": ");
		sb.append(CQJSONize.jsonize(Payee_Name, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Address\": ");
		sb.append(CQJSONize.jsonize(Address, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"City\": ");
		sb.append(CQJSONize.jsonize(City, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"State\": ");
		sb.append(CQJSONize.jsonize(State, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Zip_Code\": ");
		sb.append(CQJSONize.jsonize(Zip_Code, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Phone\": ");
		sb.append(CQJSONize.jsonize(Phone, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Account\": ");
		sb.append(CQJSONize.jsonize(Account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Verify_Account\": ");
		sb.append(CQJSONize.jsonize(Verify_Account, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Amount\": ");
		sb.append(CQJSONize.jsonize(Amount, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"From_Account\": ");
		sb.append(CQJSONize.jsonize(From_Account, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}