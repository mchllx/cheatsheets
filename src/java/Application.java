package sg.edu.nus.iss.contact;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

import sg.edu.nus.iss.contact.services.Utils;

@SpringBootApplication
public class ContactApplication implements CommandLineRunner {

	@Autowired @Qualifier(Utils.BEAN_REDIS)
	private RedisTemplate<String, String> template;

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.printf(">>> RedisTemplate: %s\n", template);
	}
}