package CQGenerated.testsuite;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import CQGenerated.types.*;
import CQGenerated.utilities.*;
import CQGenerated.CQTestSuite;

/** Conformiq generated test case
	View/Update Contact Information
*/
public class TestCase18
{

	public TestCase18()
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
		CQTestSuite.harness.clickCQRecordUpdate_Contact_Info_hyperlink_Account_Services_screen(
		new CQRecordUpdate_Contact_Info_hyperlink_Account_Services_screen(
		)
		);
	}
	public void step8()
	{
		CQTestSuite.harness.log("Executing test step 8");
		CQTestSuite.harness.verifyCQRecordUpdate_Profile_screen(
		/**Update_Profile_screen*/
		new CQRecordUpdate_Profile_screen(
		/**Profile_form*/
		new CQRecordProfile_form(
		/**First_Name*/
		"First Name",
		/**First_Name_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Last_Name*/
		"Last Name",
		/**Last_Name_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Address*/
		"Address",
		/**Address_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**City*/
		"City",
		/**City_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**State*/
		"State",
		/**State_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Zip_Code*/
		"ZIP Code",
		/**Zip_Code_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Phone*/
		"Phone",
		/**Phone_textbox_Status*/
		""/* Creator [Don't Care] */
		),
		/**UPDATE_PROFILE_button_Status*/
		""/* Creator [Don't Care] */
		)
		);
	}
	public void step9()
	{
		CQTestSuite.harness.log("Executing test step 9");
		CQTestSuite.harness.fillCQRecordFill_Profile_form_Update_Profile_screen(
		new CQRecordFill_Profile_form_Update_Profile_screen(
		/**Fill_Profile_form*/
		new CQRecordFill_Profile_form(
		/**First_Name*/
		""/* Creator [Don't Care] */,
		/**Last_Name*/
		""/* Creator [Don't Care] */,
		/**Address*/
		"Updated Address",
		/**City*/
		""/* Creator [Don't Care] */,
		/**State*/
		""/* Creator [Don't Care] */,
		/**Zip_Code*/
		""/* Creator [Don't Care] */,
		/**Phone*/
		"Updated Phone Number"
		)
		)
		);
	}
	public void step10()
	{
		CQTestSuite.harness.log("Executing test step 10");
		CQTestSuite.harness.clickCQRecordUPDATE_PROFILE_button_Update_Profile_screen(
		new CQRecordUPDATE_PROFILE_button_Update_Profile_screen(
		)
		);
	}
	public void step11()
	{
		CQTestSuite.harness.log("Executing test step 11");

		CQTestSuite.harness.verifyCQRecordProfile_Updated_Action(
			new CQRecordProfile_Updated_Action(

			/**message*/
			"You updated  XXX and YYYY have been added to the system"
			));
	}
	public void step12()
	{
		CQTestSuite.harness.log("Executing test step 12");
		CQTestSuite.harness.clickCQRecordLog_Out_hyperlink_Account_Services_screen(
		new CQRecordLog_Out_hyperlink_Account_Services_screen(
		)
		);
	}
	public void step13()
	{
		CQTestSuite.harness.log("Executing test step 13");
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
	@Before
	public void setUp()
	{
		CQData.setUp();
		CQTestSuite.harness.setUp("View/Update Contact Information");
	}
	@After
	public void tearDown()
	{
		CQTestSuite.harness.tearDown("View/Update Contact Information");
	}
}
