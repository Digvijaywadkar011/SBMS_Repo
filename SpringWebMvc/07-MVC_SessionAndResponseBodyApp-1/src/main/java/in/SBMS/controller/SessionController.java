package in.SBMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class SessionController {

	@GetMapping("/login")
	public String loginPage(HttpServletRequest req, Model model) {

		String name = req.getParameter("name");

		HttpSession session = req.getSession();
		session.setAttribute("name", "Digvijay");

		model.addAttribute("msg", "User Loged IN (Session created)");

		return "index";
	}

	@GetMapping("/dashboard")
	public String dashboardPage(HttpServletRequest req, Model model) {

		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		System.out.println("name :  " + name);

		model.addAttribute("msg", name + " Welcome to our website..!!");

		return "index";

	}

	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest req, Model model) {

		HttpSession session = req.getSession();

		session.invalidate();

		model.addAttribute("msg", "User logout successfully");

		return "index";
	}

}
