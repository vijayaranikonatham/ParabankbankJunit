package CQGenerated.testsuite;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import CQGenerated.types.*;
import CQGenerated.utilities.*;
import CQGenerated.CQTestSuite;

/** Conformiq generated test case
	Adminstritation
*/
public class TestCase2
{

	public TestCase2()
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
		CQTestSuite.harness.clickCQRecordAdmin_Page_hyperlink_Parabank_Welcome_screen(
		new CQRecordAdmin_Page_hyperlink_Parabank_Welcome_screen(
		)
		);
	}
	public void step4()
	{
		CQTestSuite.harness.log("Executing test step 4");
		CQTestSuite.harness.verifyCQRecordAdministration_screen(
		/**Administration_screen*/
		new CQRecordAdministration_screen(
		/**Application_Setting_form*/
		new CQRecordApplication_Setting_form(
		/**Loan_Provider*/
		""/* Creator [Don't Care] */,
		/**Loan_Provider_dropdown_Status*/
		"enabled",
		/**Loan_Processor*/
		""/* Creator [Don't Care] */,
		/**Loan_Processor_dropdown_Status*/
		""/* Creator [Don't Care] */,
		/**Threshold*/
		20,
		/**Threshold_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Initial_Balance*/
		"Intial Balance",
		/**Initial_Balance_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Min_Balance*/
		"Min Balance",
		/**Min_Balance_textbox_Status*/
		""/* Creator [Don't Care] */
		),
		/**SUBMIT_button_Status*/
		""/* Creator [Don't Care] */
		)
		);
	}
	public void step5()
	{
		CQTestSuite.harness.log("Executing test step 5");
		CQTestSuite.harness.fillCQRecordFill_Application_Setting_form_Administration_screen(
		new CQRecordFill_Application_Setting_form_Administration_screen(
		/**Fill_Application_Setting_form*/
		new CQRecordFill_Application_Setting_form(
		/**Loan_Provider*/
		""/* Creator [Don't Care] */,
		/**Loan_Processor*/
		""/* Creator [Don't Care] */,
		/**Threshold*/
		20,
		/**Initial_Balance*/
		"Intial Balance",
		/**Min_Balance*/
		"Min Balance"
		)
		)
		);
	}
	public void step6()
	{
		CQTestSuite.harness.log("Executing test step 6");
		CQTestSuite.harness.clickCQRecordSUBMIT_button_Administration_screen(
		new CQRecordSUBMIT_button_Administration_screen(
		)
		);
	}
	public void step7()
	{
		CQTestSuite.harness.log("Executing test step 7");

		CQTestSuite.harness.verifyCQRecordTransaction_Error__Action(
			new CQRecordTransaction_Error__Action(

			/**Error*/
			"Settings saved successfully."
			));
	}
	@Before
	public void setUp()
	{
		CQData.setUp();
		CQTestSuite.harness.setUp("Adminstritation");
	}
	@After
	public void tearDown()
	{
		CQTestSuite.harness.tearDown("Adminstritation");
	}
}
