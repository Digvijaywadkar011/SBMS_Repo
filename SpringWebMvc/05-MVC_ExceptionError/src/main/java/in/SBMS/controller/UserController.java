package in.SBMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	
	@GetMapping("/")
	public String userMsg(Model model) {
		
		model.addAttribute("msg","Hello to My Exception App");
		
		int i=10/0;
		
		return "index";
	}
}
