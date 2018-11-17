package NutriSim.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NutriSim.Domain.Meal;
import NutriSim.Service.ServiceAll;
@RestController
@RequestMapping("/Meal")
public class MealController extends ControllerAll<Meal> {

	public MealController(ServiceAll<Meal> services) {
		super(services);

	}
}
