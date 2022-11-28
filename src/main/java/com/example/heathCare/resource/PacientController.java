package com.example.heathCare.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.heathCare.models.Pacient;
import com.example.heathCare.respository.PacientRepository;

@RestController()
@RequestMapping("/pacients")
public class PacientController {

	
	@Autowired
	private PacientRepository repository;
	
	@PostMapping("/addPacient")
	public String savePacient(@RequestBody Pacient pacient) {
	    try {
	      if(!pacient.getId().isEmpty()) {
	        if(repository.findById(pacient.getId()).isPresent()) {
              repository.save(pacient);
              return "Pacient Edited";
            }
	      }
	        pacient.setId(String.valueOf(repository.count()+1));
	        repository.save(pacient);
	        return "Pacient Save with id: "+ pacient.getId();
        } catch (Exception e) {
          //repository.save(pacient);
          return "Erro Adding Pacient";
        }
	}
	
	@GetMapping("/findAllPacients")
	public List<Pacient> getPacients(){
		return repository.findAll();
	}
	
	
	@GetMapping("/findAllPacients/{id}")
	public Optional<Pacient> getPacient(@PathVariable String id){
	    return repository.findById(id);
	}
	
	@DeleteMapping("/deletePacient/{id}")
	public boolean deletePacient(@PathVariable String id) {
		try{
			repository.deleteById(id);
			return true;
		}catch (Exception e){
			return false;
		}

	}
	
	
	
	
	
}
