package NutriSim.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import NutriSim.Domain.Food;
@Repository
public interface FoodRepository extends MongoRepository<Food,Integer> {

}
