package com.henkel.erp.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.henkel.erp"})
public class HenkelErpApplication {

	public static void main(String[] args) {

		SpringApplication.run(HenkelErpApplication.class, args);
	}

}

