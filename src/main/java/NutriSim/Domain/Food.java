package NutriSim.Domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import NutriSim.Domain.FoodProperties.*;
import NutriSim.Interfaces.Contract;
public class Food implements Contract {
		@Id
		private Integer id;
		private String description;
		@DBRef
		private Category category_id;
		private Protein protein;
		private Lipid lipid;
		private Carbohydrate carbohydrate;
		private Energy energy;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Protein getProtein() {
			return protein;
		}
		public void setProtein(Protein protein) {
			this.protein = protein;
		}
		public Lipid getLipid() {
			return lipid;
		}
		public void setLipid(Lipid lipid) {
			this.lipid = lipid;
		}
		public Carbohydrate getCarbohydrate() {
			return carbohydrate;
		}
		public void setCarbohydrate(Carbohydrate carbohydrate) {
			this.carbohydrate = carbohydrate;
		}
		public Energy getEnergy() {
			return energy;
		}
		public void setEnergy(Energy energy) {
			this.energy = energy;
		}
		
		
}
