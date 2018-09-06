package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordFill_Profile_form implements CQJSONizeable {
public CQRecordFill_Profile_form(){}

public CQRecordFill_Profile_form(String First_Name,String Last_Name,String Address,String City,String State,String Zip_Code,String Phone)
	{
		this.First_Name = First_Name;

		this.Last_Name = Last_Name;

		this.Address = Address;

		this.City = City;

		this.State = State;

		this.Zip_Code = Zip_Code;

		this.Phone = Phone;

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
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordFill_Profile_form))
		{
    
			return false;

		}
		CQRecordFill_Profile_form otherRec = (CQRecordFill_Profile_form) other;
		if (!CQEquals.equals(this.First_Name, otherRec.First_Name))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Last_Name, otherRec.Last_Name))
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
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}