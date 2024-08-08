package in.SBMS.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.SBMS.request.Passenger;
import in.SBMS.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Ticket bookTicket(Passenger passenger) {
		String apiUrl = "http://3.26.24.56:8080/bookTicket";

		RestTemplate rt = new RestTemplate();

		// Sending Post Request (apiUrl , reqBodyData, responseBodyType)

		ResponseEntity<Ticket> responseEntity = rt.postForEntity(apiUrl, passenger, Ticket.class);

		Ticket responseBody = responseEntity.getBody();

		return responseBody;
	}

	@Override
	public Ticket getTicket(Integer ticketNum) {

		String apiUrl = "http://3.26.24.56:8080/getTicket/{ticketNum}";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<Ticket> forEntity = rt.getForEntity(apiUrl, Ticket.class, ticketNum);

		Ticket body = forEntity.getBody();

		return body;
	}

	@Override
	public List<Ticket> getAllTicket() {

		String apiUrl = "http://3.26.24.56:8080/getTickets";

		RestTemplate rt = new RestTemplate();

			ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl, Ticket[].class);
			
			Ticket[] body = forEntity.getBody();
			
			List<Ticket> ticketList = Arrays.asList(body);

		return ticketList;
	}

}