package in.SBMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {
	
	@GetMapping("/quote")
	public String demoStringExceptin(Model model) {

		model.addAttribute("msg", "Hello Welcome....!!");

		String name = null;

		name.length();

		return "index";

	}

}
