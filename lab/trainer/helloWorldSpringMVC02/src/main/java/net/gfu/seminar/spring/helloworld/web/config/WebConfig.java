package net.gfu.seminar.spring.helloworld.web.config;

import net.gfu.seminar.spring.helloworld.Greeting;
import net.gfu.seminar.spring.helloworld.GreetingService;
import net.gfu.seminar.spring.helloworld.GuestDao;
import net.gfu.seminar.spring.helloworld.PersistenceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersistenceConfig.class)
public class WebConfig {

	@Bean
	public GreetingService greetingService(GuestDao guestDao) {
		return new Greeting(guestDao);
	}
}