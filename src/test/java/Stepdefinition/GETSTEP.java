package Stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GETSTEP {
	
	@Given("User creates GET Request for LMS API end point")
	public void user_creates_get_request_for_lms_api_end_point() {
		 System.out.println("Step 1 : Creates get request for LMS APi endpoint");
	}

	@When("User Send Https Request")
	public void user_send_https_request(){
		 System.out.println("Step 2 : Sends http request");
	}

	@Then("User receive HTTP {int} error {string}")
	public void user_receive_http_error(Integer int1, String string) {
		 System.out.println("step3 : 401 Bad Authorized");
	}
	
	{System.out.println();}
	{System.out.println();}
	{System.out.println();}
	
	
	 @Given("User creates LMS API end point")
		public void user_creates_lms_api_end_point() {
			 System.out.println("Step1 : Creates LMS APi endpoint");
		}

		@When("User set Authorization to {string} with valid credentials and Send Https Request")
		public void user_set_authorization_to_with_valid_credentials_and_send_https_request(String string) {
			 System.out.println("Step 2 : Auth with valid credentials");
		}

		@Then("User receive HTTP {int} Ok Status code with all record")
		public void user_receive_http_ok_status_code_with_all_record(Integer int1) {
			 System.out.println("Step 3 : 200 ok status with all records");
		}
		
		@Given("User creates API end point")
		public void usercreatesapiendpoint() {
			 System.out.println("Step1 : Creates get request for LMS APi endpoint");
		}
		
		@When("User Send URL Request")
		public void usersendurlrequest() {
			 System.out.println("Step2 : Sends URL request");
		}

		@Then("User receive HTTP {int} Ok Status code {string}")
		public void user_receive_http_ok_status_code(Integer int1, String string) {
		    System.out.println("Step3 : 200 ok status");
		}

		@Given("User creates GET Request with incomplete \\/wrong url")
		public void user_creates_get_request_with_incomplete_wrong_url() {
			 System.out.println("Step1 : Create request with incorrect/wrong URL");
		}
		
		@When("User Send HTTP")
		public void usersendhttpsrequest1() {
			 System.out.println("Step2 : Sends http ");
		}
		@Then("User receive HTTP {int} Error Code {string}")
		public void user_receive_http_error_code(Integer int1, String string) {
			 System.out.println("Step3 : 404  ok Bad request");
		}

	}





