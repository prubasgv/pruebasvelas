package org.brayan.vargas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class ProyectoWebApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoWebApplication.class, args);
	}

}
