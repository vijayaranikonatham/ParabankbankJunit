package CQGenerated.testsuite;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import CQGenerated.types.*;
import CQGenerated.utilities.*;
import CQGenerated.CQTestSuite;

/** Conformiq generated test case
	Account number and Verify Account number should match
*/
public class TestCase12
{

	public TestCase12()
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
		CQTestSuite.harness.clickCQRecordBill_Pay_hyperlink_Account_Services_screen(
		new CQRecordBill_Pay_hyperlink_Account_Services_screen(
		)
		);
	}
	public void step8()
	{
		CQTestSuite.harness.log("Executing test step 8");
		CQTestSuite.harness.verifyCQRecordBill_Payment_Service_screen(
		/**Bill_Payment_Service_screen*/
		new CQRecordBill_Payment_Service_screen(
		/**Payee_Information_form*/
		new CQRecordPayee_Information_form(
		/**Payee_Name*/
		""/* Creator [Don't Care] */,
		/**Payee_Name_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Address*/
		""/* Creator [Don't Care] */,
		/**Address_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**City*/
		""/* Creator [Don't Care] */,
		/**City_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**State*/
		""/* Creator [Don't Care] */,
		/**State_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Zip_Code*/
		""/* Creator [Don't Care] */,
		/**Zip_Code_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Phone*/
		""/* Creator [Don't Care] */,
		/**Phone_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Account*/
		""/* Creator [Don't Care] */,
		/**Account_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Verify_Account*/
		""/* Creator [Don't Care] */,
		/**Verify_Account_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Amount*/
		""/* Creator [Don't Care] */,
		/**Amount_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**From_Account*/
		""/* Creator [Don't Care] */,
		/**From_Account_dropdown_Status*/
		""/* Creator [Don't Care] */
		),
		/**SEND_PAYMENT_button_Status*/
		""/* Creator [Don't Care] */
		)
		);
	}
	public void step9()
	{
		CQTestSuite.harness.log("Executing test step 9");
		CQTestSuite.harness.fillCQRecordFill_Payee_Information_form_Bill_Payment_Service_screen(
		new CQRecordFill_Payee_Information_form_Bill_Payment_Service_screen(
		/**Fill_Payee_Information_form*/
		new CQRecordFill_Payee_Information_form(
		/**Payee_Name*/
		"Payee Name",
		/**Address*/
		"Address",
		/**City*/
		"City",
		/**State*/
		"State",
		/**Zip_Code*/
		"Valid ZipCode",
		/**Phone*/
		"Phone number",
		/**Account*/
		"Account Number",
		/**Verify_Account*/
		"non matching Account number",
		/**Amount*/
		"Amount less than are equal to account balance",
		/**From_Account*/
		"From Account"
		)
		)
		);
	}
	public void step10()
	{
		CQTestSuite.harness.log("Executing test step 10");

		CQTestSuite.harness.verifyCQRecordBill_Payment_Complete_Action(
			new CQRecordBill_Payment_Complete_Action(

			/**Bill_Payment*/
			"The account numbers do not match"
			));
	}
	@Before
	public void setUp()
	{
		CQData.setUp();
		CQTestSuite.harness.setUp("Account number and Verify Account number should match");
	}
	@After
	public void tearDown()
	{
		CQTestSuite.harness.tearDown("Account number and Verify Account number should match");
	}
}
