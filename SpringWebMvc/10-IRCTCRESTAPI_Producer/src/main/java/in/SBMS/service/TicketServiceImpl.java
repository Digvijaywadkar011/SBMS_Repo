package in.SBMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.entity.Ticket;
import in.SBMS.repo.TicketRepo;
import in.SBMS.request.Passenger;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepo ticketRepo;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		Ticket ticket = new Ticket();
		BeanUtils.copyProperties(passenger, ticket);

		ticket.setPrice(1560.00);
		ticket.setTicketStatus("CONFIRM");
		ticket = ticketRepo.save(ticket);

		return ticket;
	}

	@Override
	public Ticket getTicket(Integer ticketNum) {

		Optional<Ticket> byId = ticketRepo.findById(ticketNum);

		if (byId.isPresent()) {
			return byId.get();
		}

		return null;
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return ticketRepo.findAll();
	}

}
