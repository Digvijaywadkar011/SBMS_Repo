package in.SBMS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerP {

	@GetMapping("/enquiry")
	public String getCarInfo(@RequestParam("name") String name, @RequestParam("type") String type, Model model) {

		System.out.println(name);
		System.out.println(type);

		model.addAttribute("msg", "Contact : 8988412161256");

		return "index";

	}

	@GetMapping("/dealer/{dname}")
	public String getDealerInfo(@PathVariable("dname") String dname, Model model) {

		System.out.println(dname);
		model.addAttribute("msg2", "Dealer is currently Unavailable please contact company");

		return "index";

	}
}
