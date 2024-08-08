package in.SBMS;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.SBMS.binding.User;

public class DemoJackson {

	public static void main(String[] args) throws Exception {
		
		DemoJackson app=new DemoJackson();
		
		//app.convertObjtoJson();
		
		app.convertJsonToOBJ();
	

	}
	
	public void convertJsonToOBJ() throws Exception {
		
		ObjectMapper mapper=new ObjectMapper();
		
		User user = mapper.readValue(new File("user.json"), User.class);
		
		System.out.println(user);
	}
	
	public void convertObjtoJson() throws Exception {
		
		User user=new User(1,"Digvijay",880590);
		
		ObjectMapper mapper=new ObjectMapper();
		
		mapper.writeValue(new File("user.json"), user);
		
		System.out.println("Object Converted to json......!!!");
		
		
	}

}
