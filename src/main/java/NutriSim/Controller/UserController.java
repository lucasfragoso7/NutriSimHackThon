package NutriSim.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NutriSim.Domain.User;
import NutriSim.Service.ServiceAll;

@RestController
@RequestMapping("/User")
public class UserController extends ControllerAll<User> {

	public UserController(ServiceAll<User> services) {
		super(services);
	}

}
