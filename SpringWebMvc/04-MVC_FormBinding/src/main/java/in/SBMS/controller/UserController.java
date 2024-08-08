package in.SBMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.SBMS.entities.UserInfo;
import in.SBMS.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService user;

	@GetMapping("/")
	public String loadForm(Model model) {

		model.addAttribute("user",new UserInfo());
		return "index";
	}

	@PostMapping("/user")
	public String submitForm(UserInfo userInfo,Model model) {
			
		boolean saveUser = user.saveUser(userInfo);
		
		if(saveUser) {
			
			model.addAttribute("msg","User data Added Successfully");
		}
		
		return "index";
	}

}
