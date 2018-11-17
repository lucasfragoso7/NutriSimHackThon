package NutriSim.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import NutriSim.Interfaces.Contract;
@Document
public class User implements Contract {
	
	@Id
	private Integer id;
	private String password;
	private String name;
	private short yearsOld;
	private double height;
	private double weight;
	private String email;
	
	
	public User() {}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public short getYearsOld() {
		return yearsOld;
	}
	
	public void setYearsOld(short yearsOld) {
		this.yearsOld = yearsOld;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
