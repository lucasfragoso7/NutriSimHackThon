package NutriSim.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NutriSim.Domain.FoodProperties.Category;
import NutriSim.Service.ServiceAll;
@RestController
@RequestMapping("/Category")
public class CategoryController extends ControllerAll<Category> {

	public CategoryController(ServiceAll<Category> services) {
		super(services);
		}


}
