package bg.softuni.pcstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PcStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcStoreApplication.class, args);
	}

}
