package in.SBMS.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.SBMS.Model.Activity;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class BoredApiRestController {

	private final String BORED_API = "https://bored.api.lewagon.com/api/activity";

	@GetMapping("/activity")
	@CircuitBreaker(name = "randomActivity", fallbackMethod = "fallBackMethodActivity")
	public String getRandomActivity() {

		RestTemplate rt = new RestTemplate();

		ResponseEntity<Activity> entity = rt.getForEntity(BORED_API, Activity.class);

		Activity activity = entity.getBody();

		System.out.println("Activity Status ::: " + activity.getActivity());

		//int i = 10 / 0;

		return activity.getActivity();
	}

	public String fallBackMethodActivity(Throwable throwable) {
		return "Watch a video from Ashok IT...!!";
	}

}
