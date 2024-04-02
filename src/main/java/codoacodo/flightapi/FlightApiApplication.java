package codoacodo.flightapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlightApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightApiApplication.class, args);
	}

}
