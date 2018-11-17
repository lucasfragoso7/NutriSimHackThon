package NutriSim.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import NutriSim.Exceptions.Err;
import NutriSim.Interfaces.Contract;
import NutriSim.Service.ServiceAll;

@RestController
public abstract class ControllerAll< Variable extends Contract> {

private ServiceAll<Variable> services;

	@Autowired
	public ControllerAll(ServiceAll<Variable> services) {
		this.services = services;
	}

	@GetMapping("/")
	public List<Variable> readAll() {
		return services.readAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Variable> getById(@PathVariable Integer id) {
		Variable user = services.getById(id);
		return new ResponseEntity<Variable>(user, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) throws Err {
		services.delete(id);
		return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<Variable> create(@Valid @RequestBody Variable variable) {
		services.create(variable);
		return new ResponseEntity<Variable>(variable, HttpStatus.CREATED);
	}

	@PutMapping("/")
	public ResponseEntity<Variable> update(@RequestBody Variable variable) throws Err {
		services.update(variable);
		return new ResponseEntity<Variable>(variable, HttpStatus.OK);
	}

}
