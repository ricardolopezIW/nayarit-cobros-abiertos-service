package mx.gob.nayarit.service.cobros.abiertos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NayaritCobrosAbiertosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NayaritCobrosAbiertosServiceApplication.class, args);
	}

}
