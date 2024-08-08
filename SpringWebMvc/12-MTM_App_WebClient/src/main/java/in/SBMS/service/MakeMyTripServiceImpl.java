package in.SBMS.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.SBMS.request.Passenger;
import in.SBMS.response.Ticket;
import reactor.core.publisher.Mono;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Mono<Ticket>  bookTicket(Passenger passenger) {
		String apiUrl = "http://localhost:8080/bookTicket";

		WebClient webClient = WebClient.create();
		
		Mono<Ticket> bodyToMono = webClient.post()
								  .uri(apiUrl)
								  .body(BodyInserters.fromValue(passenger))
								  .retrieve()
								  .bodyToMono(Ticket.class);
		

		return bodyToMono;
	}

	@Override
	public Mono<Ticket> getTicket(Integer ticketNum) {

		String apiUrl = "http://localhost:8080/getTicket/{ticketNum}";

		WebClient webClient=WebClient.create();
		Mono<Ticket> bodyToMono = webClient.get()
									.uri(apiUrl,ticketNum)
									.retrieve()
									.bodyToMono(Ticket.class);

		return bodyToMono;
	}

	@Override
	public Mono<Ticket[]> getAllTicket() {

		String apiUrl = "http://localhost:8080/getTickets";

		WebClient webClient=WebClient.create();
		
		Mono<Ticket[]> bodyToMono = webClient.get()
									.uri(apiUrl)
									.retrieve()
									.bodyToMono(Ticket[].class);
	
		return bodyToMono;
	}

}
