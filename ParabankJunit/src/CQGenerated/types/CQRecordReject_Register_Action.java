package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordReject_Register_Action implements CQJSONizeable {
public CQRecordReject_Register_Action(){}

public CQRecordReject_Register_Action(String First_Name,String Last_Name,String Adress,String City,String State,String Zip_Code,String Phone,String SSN,String UserName,String Password,String Confirm)
	{
		this.First_Name = First_Name;

		this.Last_Name = Last_Name;

		this.Adress = Adress;

		this.City = City;

		this.State = State;

		this.Zip_Code = Zip_Code;

		this.Phone = Phone;

		this.SSN = SSN;

		this.UserName = UserName;

		this.Password = Password;

		this.Confirm = Confirm;

	}
 	public String First_Name;
	public String getFirst_Name()
	{
		return this.First_Name;
	}

	public void  setFirst_Name(String First_Name)
	{
		this.First_Name = First_Name;
	}
 	public String Last_Name;
	public String getLast_Name()
	{
		return this.Last_Name;
	}

	public void  setLast_Name(String Last_Name)
	{
		this.Last_Name = Last_Name;
	}
 	public String Adress;
	public String getAdress()
	{
		return this.Adress;
	}

	public void  setAdress(String Adress)
	{
		this.Adress = Adress;
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
 	public String SSN;
	public String getSSN()
	{
		return this.SSN;
	}

	public void  setSSN(String SSN)
	{
		this.SSN = SSN;
	}
 	public String UserName;
	public String getUserName()
	{
		return this.UserName;
	}

	public void  setUserName(String UserName)
	{
		this.UserName = UserName;
	}
 	public String Password;
	public String getPassword()
	{
		return this.Password;
	}

	public void  setPassword(String Password)
	{
		this.Password = Password;
	}
 	public String Confirm;
	public String getConfirm()
	{
		return this.Confirm;
	}

	public void  setConfirm(String Confirm)
	{
		this.Confirm = Confirm;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordReject_Register_Action))
		{
    
			return false;

		}
		CQRecordReject_Register_Action otherRec = (CQRecordReject_Register_Action) other;
		if (!CQEquals.equals(this.First_Name, otherRec.First_Name))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Last_Name, otherRec.Last_Name))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Adress, otherRec.Adress))
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
		if (!CQEquals.equals(this.SSN, otherRec.SSN))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.UserName, otherRec.UserName))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Password, otherRec.Password))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Confirm, otherRec.Confirm))
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
		sb.append(indent + "    " + "\"First_Name\": ");
		sb.append(CQJSONize.jsonize(First_Name, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Last_Name\": ");
		sb.append(CQJSONize.jsonize(Last_Name, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Adress\": ");
		sb.append(CQJSONize.jsonize(Adress, indent + "    "));
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
		sb.append(indent + "    " + "\"SSN\": ");
		sb.append(CQJSONize.jsonize(SSN, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"UserName\": ");
		sb.append(CQJSONize.jsonize(UserName, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Password\": ");
		sb.append(CQJSONize.jsonize(Password, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Confirm\": ");
		sb.append(CQJSONize.jsonize(Confirm, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}