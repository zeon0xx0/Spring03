package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring03Application {
	@GetMapping("/")
	public String tiger() {
		return "String03:1545";
	}
 
	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);
	}

}
