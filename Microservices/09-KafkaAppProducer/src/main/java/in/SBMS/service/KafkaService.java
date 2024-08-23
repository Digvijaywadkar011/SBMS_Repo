package in.SBMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.SBMS.Constant.AppConstant;
import in.SBMS.Model.Order;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;

	public String addMsg(Order order) {
		
		// publish msg to kafka topic
		kafkaTemplate.send(AppConstant.TOPIC, order);

		return "Msg Published To Kafka Topic";

	}

}
