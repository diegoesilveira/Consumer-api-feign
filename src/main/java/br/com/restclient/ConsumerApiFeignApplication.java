package br.com.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsumerApiFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApiFeignApplication.class, args);
	}

}
