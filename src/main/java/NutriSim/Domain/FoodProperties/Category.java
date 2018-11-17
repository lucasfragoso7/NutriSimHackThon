package NutriSim.Domain.FoodProperties;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import NutriSim.Interfaces.Contract;

@Document
public class Category implements Contract {
	@Id
	private Integer id;
	
	private String category;

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
