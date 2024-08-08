package in.SBMS.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.SBMS.User;

@Controller
public class UserController {
	
	@GetMapping("/users-info")
	public String addAllUsers(Model model) {
		
		User u1=new User(101,"Digvijay","digvijaywadkar011@gmail.com");
		User u2=new User(102,"Akhil","akhil@gmail.com");
		User u3=new User(103,"Shrikant","shrikant@gmail.com");
		
		List<User> usersList = Arrays.asList(u1,u2,u3);
		
		model.addAttribute("userData", usersList);
		
		return "view-users";
		
	}
	
	@GetMapping("/user-info")
	public String getUserInfo(Model model) {
		
		User data=new User(101,"Digvijay","digvijaywadkar011@gmail.com");
		
		model.addAttribute("user",data);
		
		return "user-data";
	}
	
	@GetMapping("/email")
	public String getUserEmail(Model model) {
		
		model.addAttribute("email","digvijaywadkar011@gmail.com");		
		
		
		return "user";
		
	}

	
	@GetMapping("/name")
	public ModelAndView modelAndView() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("data","Digvijay Wadkar");
		
		mav.setViewName("user");
		
		return mav;
	}
	
}
