package com.example.heathCare;

import com.example.heathCare.models.Pacient;
import com.example.heathCare.resource.PacientController;
import com.example.heathCare.respository.PacientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class HeathCareApplicationTests {

	@Autowired
	PacientRepository repository;

	@Autowired
	PacientController test;

	@Test
	void savePacientTest(){
		Pacient paciente = new Pacient("Eudes", "Ryan","123123123","eu sou dodois");
		paciente.setId("25");
		repository.save(paciente);
	}

	@Test
	void getAllPacientsTest(){
		List<Pacient> pacient = test.getPacients();
		assertThat(pacient).size().isGreaterThan(10000);
	}

	@Test
	void getByIdPacient(){
		Optional<Pacient> pacient = test.getPacient("25");
		assertEquals("Vinícius",pacient.get().getName());
	}
	@Test
	void deletePacientTest(){
		boolean veridy = test.deletePacient("25");
		assertTrue(veridy);
	}

}
