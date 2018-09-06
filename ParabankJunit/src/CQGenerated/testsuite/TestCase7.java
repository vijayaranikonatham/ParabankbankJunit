package CQGenerated.testsuite;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import CQGenerated.types.*;
import CQGenerated.utilities.*;
import CQGenerated.CQTestSuite;

/** Conformiq generated test case
	Forgot Password
*/
public class TestCase7
{

	public TestCase7()
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
	}
	public void step1()
	{
		CQTestSuite.harness.log("Executing test step 1");

		CQTestSuite.harness.performCQRecordenter_URL_Action(
			new CQRecordenter_URL_Action(

			/**url*/
			"http://parabank2.parasoft.com/parabank/index.htm"
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
		CQTestSuite.harness.clickCQRecordForgot_login_info__hyperlink_Parabank_Welcome_screen_Customer_Login_form(
		new CQRecordForgot_login_info__hyperlink_Parabank_Welcome_screen_Customer_Login_form(
		)
		);
	}
	public void step4()
	{
		CQTestSuite.harness.log("Executing test step 4");
		CQTestSuite.harness.verifyCQRecordForgot_Login_info_screen(
		/**Forgot_Login_info_screen*/
		new CQRecordForgot_Login_info_screen(
		/**Forgot_Login_info_form*/
		new CQRecordForgot_Login_info_form(
		/**First_Name*/
		""/* Creator [Don't Care] */,
		/**First_Name_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Last_Name*/
		""/* Creator [Don't Care] */,
		/**Last_Name_textbox_Status*/
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
		0/* Creator [Don't Care] */,
		/**Zip_Code_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**SSN*/
		""/* Creator [Don't Care] */,
		/**SSN_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**FIND_MY_LOGIN_INFO_button_Status*/
		""/* Creator [Don't Care] */
		)
		)
		);
	}
	public void step5()
	{
		CQTestSuite.harness.log("Executing test step 5");
		CQTestSuite.harness.fillCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen(
		new CQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen(
		/**Fill_Forgot_Login_info_form*/
		new CQRecordFill_Forgot_Login_info_form(
		/**First_Name*/
		"First Name",
		/**Last_Name*/
		"Last Name",
		/**Address*/
		"Address",
		/**City*/
		"City",
		/**State*/
		"State",
		/**Zip_Code*/
		123456,
		/**SSN*/
		"SSN"
		)
		)
		);
	}
	public void step6()
	{
		CQTestSuite.harness.log("Executing test step 6");
		CQTestSuite.harness.clickCQRecordFIND_MY_LOGIN_INFO_button_Forgot_Login_info_screen_Forgot_Login_info_form(
		new CQRecordFIND_MY_LOGIN_INFO_button_Forgot_Login_info_screen_Forgot_Login_info_form(
		)
		);
	}
	public void step7()
	{
		CQTestSuite.harness.log("Executing test step 7");

		CQTestSuite.harness.verifyCQRecordTransaction_Error__Action(
			new CQRecordTransaction_Error__Action(

			/**Error*/
			"Your login information was located successfully. You are now logged in. User Name:XXX Password:YYY"
			));
	}
	public void step8()
	{
		CQTestSuite.harness.log("Executing test step 8");
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
	@Before
	public void setUp()
	{
		CQData.setUp();
		CQTestSuite.harness.setUp("Forgot Password");
	}
	@After
	public void tearDown()
	{
		CQTestSuite.harness.tearDown("Forgot Password");
	}
}
