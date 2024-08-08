package in.SBMS.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface WelcomeApiClient {

	@GetMapping("/Welcome")
	public String invokeWelcomeApi();

}
