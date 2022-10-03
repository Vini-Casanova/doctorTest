package com.example.heathCare;

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

@RestController()
@RequestMapping("/pacients")
public class PacientController {

	
	@Autowired
	private PacientRepository repository;
	
	@PostMapping("/addPacient")
	public String savePacient(@RequestBody Pacient pacient) {
	    try {
	      if(pacient.getId() != null) {
	        if(repository.findById(pacient.getId())!= null) {
              repository.save(pacient);
              return "Pacient Edited";
            }
	      } 
	        String pacientId = ""+(repository.count()+1);
	        pacient.setId(pacientId);
	        repository.save(pacient);
	        return "Pacient Save with id: "+ pacient.getId();
        } catch (Exception e) {
          repository.save(pacient);
          return "Pacient Edited";
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
	public String deletePacient(@PathVariable String id) {
		repository.deleteById(id);
		return "Pacient with id: "+ id +  "has been deleted";
	}
	
	
	
	
	
}
