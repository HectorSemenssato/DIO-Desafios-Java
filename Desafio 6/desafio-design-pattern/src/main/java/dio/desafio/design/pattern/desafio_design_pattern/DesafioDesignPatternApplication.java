package dio.desafio.design.pattern.desafio_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDesignPatternApplication.class, args);
	}

}
