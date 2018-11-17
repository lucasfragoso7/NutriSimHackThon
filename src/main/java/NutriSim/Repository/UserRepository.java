package NutriSim.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import NutriSim.Domain.User;
@Repository
public interface UserRepository extends MongoRepository<User,Integer>{

}
