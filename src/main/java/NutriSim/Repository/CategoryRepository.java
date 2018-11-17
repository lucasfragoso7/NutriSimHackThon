package NutriSim.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import NutriSim.Domain.FoodProperties.Category;
@Repository
public interface CategoryRepository extends MongoRepository<Category,Integer>{

}
