package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordResult_UI_table implements CQJSONizeable {
public CQRecordResult_UI_table(){}

public CQRecordResult_UI_table(String Date,String Transaction,String Debit,String Credit)
	{
		this.Date = Date;

		this.Transaction = Transaction;

		this.Debit = Debit;

		this.Credit = Credit;

	}
 	public String Date;
	public String getDate()
	{
		return this.Date;
	}

	public void  setDate(String Date)
	{
		this.Date = Date;
	}
 	public String Transaction;
	public String getTransaction()
	{
		return this.Transaction;
	}

	public void  setTransaction(String Transaction)
	{
		this.Transaction = Transaction;
	}
 	public String Debit;
	public String getDebit()
	{
		return this.Debit;
	}

	public void  setDebit(String Debit)
	{
		this.Debit = Debit;
	}
 	public String Credit;
	public String getCredit()
	{
		return this.Credit;
	}

	public void  setCredit(String Credit)
	{
		this.Credit = Credit;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordResult_UI_table))
		{
    
			return false;

		}
		CQRecordResult_UI_table otherRec = (CQRecordResult_UI_table) other;
		if (!CQEquals.equals(this.Date, otherRec.Date))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Transaction, otherRec.Transaction))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Debit, otherRec.Debit))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Credit, otherRec.Credit))
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
		sb.append(indent + "    " + "\"Date\": ");
		sb.append(CQJSONize.jsonize(Date, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Transaction\": ");
		sb.append(CQJSONize.jsonize(Transaction, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Debit\": ");
		sb.append(CQJSONize.jsonize(Debit, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Credit\": ");
		sb.append(CQJSONize.jsonize(Credit, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}