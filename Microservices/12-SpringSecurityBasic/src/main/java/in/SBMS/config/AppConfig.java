package in.SBMS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {
	
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests( (req) -> 
		req.requestMatchers("/home","/login","/swagger-ui.html")
		.permitAll()
		.anyRequest()
		.authenticated())
		.formLogin();
		
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager inMemUser() {
		
		UserDetails u1= User.withDefaultPasswordEncoder()
							.username("digvijay")
							.password("dss@123")
							.roles("Admin")
							.build();
		
		
		UserDetails u2= User.withDefaultPasswordEncoder()
							.username("tejas")
							.password("tejas@123")
							.roles("User")
							.build();
		
		return new InMemoryUserDetailsManager(u1,u2);
	}
	
	

}
