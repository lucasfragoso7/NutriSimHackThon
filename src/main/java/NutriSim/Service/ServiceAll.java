package NutriSim.Service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import NutriSim.Exceptions.Err;
import NutriSim.Interfaces.Contract;

@Service
public abstract class ServiceAll<Variable extends  Contract> {

protected MongoRepository<Variable, Integer> mongoRepository;

	public ServiceAll(MongoRepository<Variable,Integer> mongoRepository) {
		this.mongoRepository = mongoRepository;
	}

	public Variable create(Variable variable) {
		return mongoRepository.insert(variable);
	}

	public Variable update(Variable variable) throws Err {
		if (!mongoRepository.existsById(variable.getId()))
			throw new Err("Não existe");
		return mongoRepository.save(variable);
	}

	public void delete(Integer id) throws Err {
		if (!mongoRepository.existsById(id)) {
			throw new Err("Não Existe");
		}
		mongoRepository.deleteById(id);
	}

	public List<Variable> readAll() {
		return mongoRepository.findAll();
	}

	public Variable getById(Integer id) {
		return mongoRepository.findById(id).get();
	}
}
