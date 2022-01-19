package Definition2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithProgramId {

	@Given("User creates  GET Request with {string} for LMS API endpoint")
	public void user_creates_get_request_with_for_lms_api_endpoint(String string) {
		System.out.println("step 1 : Sends API endpoint with programid");
	}

	@When("User Send Https Request")
	public void user_send_https_request() {
		System.out.println("step 2 : Sends Https request");
	}

	@Then("User receive HTTP {int} Ok Status code {string}")
	public void user_receive_http_ok_status_code(Integer int1, String string) {
		System.out.println("step 3 : Receive 200 Ok Status");
		System.out.println();
		System.out.println();
	}

	@Given("User creates  GET Request with {string}")
	public void user_creates_get_request_with(String string) {
	    System.out.println("step 1 : Sends request in Non existing ProgramID");
	}

	@Given("User creates Request with ProgramID ={int}")
	public void user_creates_request_with_program_id(Integer int1) {
		System.out.println("step 1 : Sends request with ProgramId =0");
	}

	@When("User Send request for program ID set to {int}")
	public void user_send_request_for_program_id_set_to(Integer int1) {
		System.out.println("step 2 : Sends request for ProgramId set to 0");
	}

	@Given("User creates  GET Request for LMS API endpoint")
	public void user_creates_get_request_for_lms_api_endpoint() {
		System.out.println("step 1 : Sends request for LMS API endpoint");
	}

	@When("User Send GET request for {string}")
	public void user_send_get_request_for(String string) {
	   System.out.println("step 2 : Sends request in alpha numeric");
	}

	@Then("User receive status {int} -Bad request")
	public void user_receive_status_bad_request(Integer int1) {
		System.out.println("Step3 : 404 BabRequest");
		System.out.println();
		System.out.println();


	}
}
