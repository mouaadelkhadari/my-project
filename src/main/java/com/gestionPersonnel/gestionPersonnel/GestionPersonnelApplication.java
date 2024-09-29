package com.gestionPersonnel.gestionPersonnel;

import com.gestionPersonnel.gestionPersonnel.role.Role;
import com.gestionPersonnel.gestionPersonnel.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class GestionPersonnelApplication {

	public static void main(String[] args) {

		SpringApplication.run(GestionPersonnelApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(RoleRepository roleRepository) {
		return args -> {
			if(roleRepository.findByName("USER").isEmpty()) {
				roleRepository.save(Role.builder().name("USER").build());
			}
		};
	}


}
