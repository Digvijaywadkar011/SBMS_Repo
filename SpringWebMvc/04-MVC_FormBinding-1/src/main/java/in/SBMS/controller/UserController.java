package in.SBMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.SBMS.entities.User;
import in.SBMS.service.UserService;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String loadForm(Model model) {

		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/user")
	public String submitForm(@Valid @ModelAttribute User user, BindingResult result, Model model) {

		if (result.hasErrors()) {

			return "index";
		}

		boolean saveUser = userService.saveUser(user);

		if (saveUser) {

			model.addAttribute("msg", "User data Added Successfully");
		}

		return "redirect:/user-msg";
	}
	
	@GetMapping("/user-msg")
	public String userSavedMsg(Model model) {
		
		model.addAttribute("user",new User());
		return "index";
		
	}


	@GetMapping("/view")
	public String getUser(Model model) {

		List<User> userslist = userService.getUsers();
		model.addAttribute("user", userslist);
		return "view-users";
	}

}
