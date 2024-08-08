package in.SBMS.service;

import in.SBMS.request.Passenger;
import in.SBMS.response.Ticket;
import reactor.core.publisher.Mono;

public interface MakeMyTripService {
	
	
	public Mono<Ticket> bookTicket(Passenger passenger);
	
	public Mono<Ticket> getTicket(Integer ticketNum);
	
	public Mono<Ticket[]> getAllTicket();

}