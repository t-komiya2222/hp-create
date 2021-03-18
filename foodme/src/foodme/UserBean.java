package foodme;
import java.io.Serializable;

public class UserBean implements Serializable {
    private static final long serialVersionUID = 1L;


	private int food_id;
	private String food_name;
	private String food_categoly;
	private int food_calorie;
	private String food_country;

	UserBean(){}

	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getFood_categoly() {
		return food_categoly;
	}

	public void setFood_categoly(String food_categoly) {
		this.food_categoly = food_categoly;
	}

	public int getFood_calorie() {
		return food_calorie;
	}

	public void setFood_calorie(int food_calorie) {
		this.food_calorie = food_calorie;
	}

	public String getFood_country() {
		return food_country;
	}

	public void setFood_country(String food_country) {
		this.food_country = food_country;
	}



}