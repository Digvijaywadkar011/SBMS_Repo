package in.SBMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.SBMS.Constant.AppConstant;
import in.SBMS.Model.Order;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@KafkaListener(topics = AppConstant.TOPIC, groupId = "group_ashokit_order")
	public void subscribeMsg(String Order) {
		System.out.print("*** Msg Recieved From Kafka *** :: ");
		System.out.println(Order);
		// logic
		
	}

}
