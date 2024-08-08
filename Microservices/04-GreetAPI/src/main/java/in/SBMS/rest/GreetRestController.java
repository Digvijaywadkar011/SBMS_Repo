package in.SBMS.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.SBMS.client.WelcomeApiClient;

@RestController
public class GreetRestController {
	

	@Autowired
	private WelcomeApiClient client;

	@GetMapping("/greet")
	public String getGreetMsg() {

		String greetResponse = "Good Morning";

		String welcomeResponse = client.invokeWelcomeApi();

		return greetResponse + ", " + welcomeResponse;
	}

}
