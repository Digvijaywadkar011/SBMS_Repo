package in.SBMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/welcome")
	public String demoExceptin(Model model) {

		model.addAttribute("msg", "Hello Welcome....!!");

		int i = 10 / 0;

		return "index";

	}

	
}
