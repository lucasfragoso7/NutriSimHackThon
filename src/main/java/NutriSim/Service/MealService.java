package NutriSim.Service;

import org.springframework.stereotype.Service;

import NutriSim.Domain.Meal;
import NutriSim.Repository.MealRepository;
@Service
public class MealService extends ServiceAll <Meal>{

	public MealService(MealRepository mongoRepository) {
		super(mongoRepository);
	}

}
