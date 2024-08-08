package in.SBMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.SBMS.request.Passenger;
import in.SBMS.response.Ticket;
import in.SBMS.service.MakeMyTripServiceImpl;
import reactor.core.publisher.Mono;

@Controller
public class MakeMyTripController {

	@Autowired
	private MakeMyTripServiceImpl service;

	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("passenger", new Passenger());

		return "index";
	}

	@PostMapping("/ticket")
	public String handelBookTicketBtn(Passenger passenger, Model model) {

		Mono<Ticket> bookTicket = service.bookTicket(passenger);

		model.addAttribute("ticket", bookTicket);

		return "view-ticket";
	}

	@GetMapping("/search")
	public String search(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "search";
	}

	@PostMapping("/search-ticket")
	public String searchTicket(@RequestParam(value = "ticketNum") Integer ticketNum, Model model) {

		System.out.println("Ticket Number ::" + ticketNum);

		Mono<Ticket> ticket = service.getTicket(ticketNum);

		model.addAttribute("ticket", ticket);

		return "search";
	}

	@GetMapping("/tickets")
	public String viewTickets(Model model) {

		Mono<Ticket[]> tickets = service.getAllTicket();

		model.addAttribute("tickets", tickets);

		return "data";
	}

}
