package CQGenerated.testsuite;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import CQGenerated.types.*;
import CQGenerated.utilities.*;
import CQGenerated.CQTestSuite;

/** Conformiq generated test case
	Reject incomplete fields
*/
public class TestCase4
{

	public TestCase4()
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
		CQTestSuite.harness.clickCQRecordRegister_hyperlink_Parabank_Welcome_screen_Customer_Login_form(
		new CQRecordRegister_hyperlink_Parabank_Welcome_screen_Customer_Login_form(
		)
		);
	}
	public void step4()
	{
		CQTestSuite.harness.log("Executing test step 4");
		CQTestSuite.harness.verifyCQRecordRegister_screen(
		/**Register_screen*/
		new CQRecordRegister_screen(
		/**Signup_form*/
		new CQRecordSignup_form(
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
		/**Phone*/
		0/* Creator [Don't Care] */,
		/**Phone_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**SSN*/
		""/* Creator [Don't Care] */,
		/**SSN_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Username*/
		""/* Creator [Don't Care] */,
		/**Username_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Password*/
		""/* Creator [Don't Care] */,
		/**Password_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Confirm*/
		""/* Creator [Don't Care] */,
		/**Confirm_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**RIGISTER_button_Status*/
		""/* Creator [Don't Care] */
		)
		)
		);
	}
	public void step5()
	{
		CQTestSuite.harness.log("Executing test step 5");
		CQTestSuite.harness.fillCQRecordFill_Signup_form_Register_screen(
		new CQRecordFill_Signup_form_Register_screen(
		/**Fill_Signup_form*/
		new CQRecordFill_Signup_form(
		/**First_Name*/
		"",
		/**Last_Name*/
		"",
		/**Address*/
		"",
		/**City*/
		"",
		/**State*/
		"",
		/**Zip_Code*/
		0,
		/**Phone*/
		0,
		/**SSN*/
		"",
		/**Username*/
		"",
		/**Password*/
		"",
		/**Confirm*/
		""
		)
		)
		);
	}
	public void step6()
	{
		CQTestSuite.harness.log("Executing test step 6");
		CQTestSuite.harness.clickCQRecordRIGISTER_button_Register_screen_Signup_form(
		new CQRecordRIGISTER_button_Register_screen_Signup_form(
		)
		);
	}
	public void step7()
	{
		CQTestSuite.harness.log("Executing test step 7");

		CQTestSuite.harness.verifyCQRecordReject_Register_Action(
			new CQRecordReject_Register_Action(

			/**First_Name*/
			"First name is required",
			/**Last_Name*/
			"Last name is required",
			/**Adress*/
			"Address is required",
			/**City*/
			" City is required",
			/**State*/
			"State is required",
			/**Zip_Code*/
			"Zip code is required",
			/**Phone*/
			"Phone number is required",
			/**SSN*/
			"SSN is required",
			/**UserName*/
			"User name is required",
			/**Password*/
			"Password is required",
			/**Confirm*/
			"Password Conformation is required"
			));
	}
	@Before
	public void setUp()
	{
		CQData.setUp();
		CQTestSuite.harness.setUp("Reject incomplete fields");
	}
	@After
	public void tearDown()
	{
		CQTestSuite.harness.tearDown("Reject incomplete fields");
	}
}
