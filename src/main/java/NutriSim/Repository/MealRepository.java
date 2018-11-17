package NutriSim.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import NutriSim.Domain.Meal;

public interface MealRepository extends MongoRepository<Meal,Integer>{

}
