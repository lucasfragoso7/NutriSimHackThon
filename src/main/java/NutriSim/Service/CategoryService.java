package NutriSim.Service;

import org.springframework.stereotype.Service;

import NutriSim.Domain.FoodProperties.Category;
import NutriSim.Repository.CategoryRepository;

@Service
public class CategoryService extends ServiceAll <Category>{

	public CategoryService(CategoryRepository mongoRepository) {
		super(mongoRepository);

}
}