package in.SBMS.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/home")
	public String myMsg() {
		
		return "Hello, Welcome to My App";
		
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "Good Morning..!!";
	}
}
