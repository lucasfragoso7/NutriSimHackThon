package NutriSim.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NutriSim.Domain.Food;
import NutriSim.Service.ServiceAll;
@RestController
@RequestMapping("/Food")
public class FoodController extends ControllerAll<Food> {

	public FoodController(ServiceAll<Food> services) {
		super(services);
		}

}
