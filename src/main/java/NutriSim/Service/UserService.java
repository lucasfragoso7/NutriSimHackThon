package NutriSim.Service;

import org.springframework.stereotype.Service;

import NutriSim.Domain.User;
import NutriSim.Repository.UserRepository;

@Service
public class UserService extends ServiceAll <User>{

	public UserService(UserRepository mongoRepository) {
		super(mongoRepository);
		// TODO Auto-generated constructor stub
	}

}
