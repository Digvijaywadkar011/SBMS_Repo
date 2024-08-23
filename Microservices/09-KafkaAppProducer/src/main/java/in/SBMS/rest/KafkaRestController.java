package in.SBMS.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.SBMS.Model.Order;
import in.SBMS.service.KafkaService;

@RestController
public class KafkaRestController {

	@Autowired
	private KafkaService service;

	@GetMapping("/order")
	public String createOrder(@RequestBody Order order) {
		
		
		String msg = service.addMsg(order);
		
		return msg;
	}

}
