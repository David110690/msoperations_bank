package NTTDATA.msoperations_bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsoperationsBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsoperationsBankApplication.class, args);
	}

}
