package CQGenerated.testsuite;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import CQGenerated.types.*;
import CQGenerated.utilities.*;
import CQGenerated.CQTestSuite;

/** Conformiq generated test case
	Find Transaction by ID
*/
public class TestCase21
{

	public TestCase21()
	{
	}

	@Test
	public void test()
	{
		step1();
		step2();
		step3();
		step4();
		step5();
		step6();
		step7();
		step8();
		step9();
		step10();
		step11();
		step12();
		step13();
		step14();
	}
	public void step1()
	{
		CQTestSuite.harness.log("Executing test step 1");

		CQTestSuite.harness.performCQRecordenter_URL_Action(
			new CQRecordenter_URL_Action(

			/**url*/
			"Enter URL as http://parabank2.parasoft.com/parabank/index.htm"
			));
	}
	public void step2()
	{
		CQTestSuite.harness.log("Executing test step 2");
		CQTestSuite.harness.verifyCQRecordParabank_Welcome_screen(
		/**Parabank_Welcome_screen*/
		new CQRecordParabank_Welcome_screen(
		/**Customer_Login_form*/
		new CQRecordCustomer_Login_form(
		/**Username*/
		""/* Creator [Don't Care] */,
		/**Username_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Password*/
		""/* Creator [Don't Care] */,
		/**Password_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**LOG_IN_button_Status*/
		""/* Creator [Don't Care] */,
		/**Register_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Forgot_login_info__hyperlink_Status*/
		""/* Creator [Don't Care] */
		),
		/**Admin_Page_hyperlink_Status*/
		""/* Creator [Don't Care] */
		)
		);
	}
	public void step3()
	{
		CQTestSuite.harness.log("Executing test step 3");
		CQTestSuite.harness.fillCQRecordFill_Customer_Login_form_Parabank_Welcome_screen(
		new CQRecordFill_Customer_Login_form_Parabank_Welcome_screen(
		/**Fill_Customer_Login_form*/
		new CQRecordFill_Customer_Login_form(
		/**Username*/
		"valid Username",
		/**Password*/
		"valid Password"
		)
		)
		);
	}
	public void step4()
	{
		CQTestSuite.harness.log("Executing test step 4");
		CQTestSuite.harness.clickCQRecordLOG_IN_button_Parabank_Welcome_screen_Customer_Login_form(
		new CQRecordLOG_IN_button_Parabank_Welcome_screen_Customer_Login_form(
		)
		);
	}
	public void step5()
	{
		CQTestSuite.harness.log("Executing test step 5");
		CQTestSuite.harness.verifyCQRecordAccount_Services_screen(
		/**Account_Services_screen*/
		new CQRecordAccount_Services_screen(
		/**Open_New_Account_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Account_Overview_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Transfer_Funds_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Bill_Pay_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Find_Transactions_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Update_Contact_Info_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Request_Loan_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Log_Out_hyperlink_Status*/
		""/* Creator [Don't Care] */
		)
		);
	}
	public void step6()
	{
		CQTestSuite.harness.log("Executing test step 6");

		CQTestSuite.harness.verifyCQRecordAccounts_Overview_Action(
			new CQRecordAccounts_Overview_Action(

			/**Account*/
			"Account Number",
			/**Balance*/
			"Balance",
			/**Available_Amount*/
			"Available Amount"
			));
	}
	public void step7()
	{
		CQTestSuite.harness.log("Executing test step 7");
		CQTestSuite.harness.clickCQRecordFind_Transactions_hyperlink_Account_Services_screen(
		new CQRecordFind_Transactions_hyperlink_Account_Services_screen(
		)
		);
	}
	public void step8()
	{
		CQTestSuite.harness.log("Executing test step 8");
		CQTestSuite.harness.verifyCQRecordFind_Transactions_screen(
		/**Find_Transactions_screen*/
		new CQRecordFind_Transactions_screen(
		/**Transaction_form*/
		new CQRecordTransaction_form(
		/**Select_an_account*/
		""/* Creator [Don't Care] */,
		/**Select_an_account_dropdown_Status*/
		""/* Creator [Don't Care] */
		),
		/**Transaction_ID_form*/
		new CQRecordTransaction_ID_form(
		/**Find_By_Transaction_ID*/
		""/* Creator [Don't Care] */,
		/**Find_By_Transaction_ID_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Find_Transactions_button_Status*/
		""/* Creator [Don't Care] */
		),
		/**Date_Range_form*/
		new CQRecordDate_Range_form(
		/**Between*/
		""/* Creator [Don't Care] */,
		/**Between_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Find_Transactions_button_Status*/
		""/* Creator [Don't Care] */,
		/**And*/
		""/* Creator [Don't Care] */,
		/**And_textbox_Status*/
		""/* Creator [Don't Care] */
		),
		/**Find_By_Amount_form*/
		new CQRecordFind_By_Amount_form(
		/**Find_By_Amount*/
		""/* Creator [Don't Care] */,
		/**Find_By_Amount_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Find_Transactions_button_Status*/
		""/* Creator [Don't Care] */
		),
		/**Transaction_By_Date_form*/
		new CQRecordTransaction_By_Date_form(
		/**Find_By_Date*/
		""/* Creator [Don't Care] */,
		/**Find_By_Date_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Find_Transactions_button_Status*/
		""/* Creator [Don't Care] */
		)
		)
		);
	}
	public void step9()
	{
		CQTestSuite.harness.log("Executing test step 9");
		CQTestSuite.harness.fillCQRecordFill_Transaction_form_Find_Transactions_screen(
		new CQRecordFill_Transaction_form_Find_Transactions_screen(
		/**Fill_Transaction_form*/
		new CQRecordFill_Transaction_form(
		/**Select_an_account*/
		""/* Creator [Don't Care] */
		)
		)
		);
	}
	public void step10()
	{
		CQTestSuite.harness.log("Executing test step 10");
		CQTestSuite.harness.fillCQRecordFill_Transaction_ID_form_Find_Transactions_screen(
		new CQRecordFill_Transaction_ID_form_Find_Transactions_screen(
		/**Fill_Transaction_ID_form*/
		new CQRecordFill_Transaction_ID_form(
		/**Find_By_Transaction_ID*/
		"Transaction ID"
		)
		)
		);
	}
	public void step11()
	{
		CQTestSuite.harness.log("Executing test step 11");
		CQTestSuite.harness.clickCQRecordFind_Transactions_button_Find_Transactions_screen_Transaction_ID_form(
		new CQRecordFind_Transactions_button_Find_Transactions_screen_Transaction_ID_form(
		)
		);
	}
	public void step12()
	{
		CQTestSuite.harness.log("Executing test step 12");
		CQTestSuite.harness.verifyCQRecordTransaction_Result_screen(
		/**Transaction_Result_screen*/
		new CQRecordTransaction_Result_screen(
		/**Result_UI_table*/
		new CQRecordResult_UI_table[]{
		/**Table_Entry*/
		new CQRecordResult_UI_table(
		/**Date*/
		"Transaction Date",
		/**Transaction*/
		"Transaction ",
		/**Debit*/
		"Debit Amount",
		/**Credit*/
		"Credit Amount"
		)
		}
		)
		);
	}
	public void step13()
	{
		CQTestSuite.harness.log("Executing test step 13");

		CQTestSuite.harness.performCQRecordClick_Transaction_Action(
			new CQRecordClick_Transaction_Action(

			/**Click*/
			"Click on the Transaction Link"
			));
	}
	public void step14()
	{
		CQTestSuite.harness.log("Executing test step 14");

		CQTestSuite.harness.verifyCQRecordTransaction_Details_Action(
			new CQRecordTransaction_Details_Action(

			/**Transaction_ID*/
			"Transaction ID",
			/**Date*/
			"Transaction Date",
			/**Description*/
			"Transaction Description",
			/**Type*/
			"Transaction Type",
			/**Amount*/
			"Transaction Amount"
			));
	}
	@Before
	public void setUp()
	{
		CQData.setUp();
		CQTestSuite.harness.setUp("Find Transaction by ID");
	}
	@After
	public void tearDown()
	{
		CQTestSuite.harness.tearDown("Find Transaction by ID");
	}
}
