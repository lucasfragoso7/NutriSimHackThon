package NutriSim.Service;

import org.springframework.stereotype.Service;

import NutriSim.Domain.Food;
import NutriSim.Repository.FoodRepository;
@Service
public class FoodService extends ServiceAll <Food>{

	public FoodService(FoodRepository mongoRepository) {
		super(mongoRepository);
	}

}
