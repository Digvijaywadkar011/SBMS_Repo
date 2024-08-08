package in.SBMS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	public MsgController() {

		System.out.println("MsgController constructor....!");
	}

	@GetMapping("/msg")
	public ModelAndView modelAndView() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "Hello this is my first Web App....!@$");

		mav.setViewName("index");

		return mav;

	}

}
