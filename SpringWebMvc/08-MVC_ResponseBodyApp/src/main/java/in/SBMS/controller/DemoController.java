package in.SBMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@GetMapping("/home")
	public String diretRespoBody() {

		return "Hello welcome to our Website";
	}
}
