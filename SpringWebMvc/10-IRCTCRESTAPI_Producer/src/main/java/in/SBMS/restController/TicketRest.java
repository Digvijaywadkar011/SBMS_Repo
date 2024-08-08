package in.SBMS.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.SBMS.entity.Ticket;
import in.SBMS.request.Passenger;
import in.SBMS.service.TicketServiceImpl;

@RestController
public class TicketRest {

	@Autowired
	private TicketServiceImpl service;

	@PostMapping(value = "/bookTicket", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<Ticket> saveTicket(@RequestBody Passenger psg) {

		Ticket ticket = service.bookTicket(psg);

		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getTicket/{ticketNum}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNum") Integer ticketNum) {

		Ticket ticket = service.getTicket(ticketNum);

		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}

	@GetMapping(value = "/getTickets", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Ticket>> getAllTicket() {

		List<Ticket> list = service.getAllTickets();

		return new ResponseEntity<>(list, HttpStatus.OK);
	}

}