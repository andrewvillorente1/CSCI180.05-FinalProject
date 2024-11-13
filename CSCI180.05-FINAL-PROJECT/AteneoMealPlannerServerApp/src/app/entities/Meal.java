package app.entities;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mealId;

    @NotNull
    @Size(max = 150)
    private String mealName;

    @Positive
    private Double protein;

    @Positive
    private Double carbohydrates;

    @Positive
    private Double fats;

    private Boolean containsGluten;

    @NotNull
    @Size(max = 100)
    private String mealType;


    public Meal(Long mealId, @NotNull @Size(max = 150) String mealName, @Positive Double protein,
			@Positive Double carbohydrates, @Positive Double fats, Boolean containsGluten,
			@NotNull @Size(max = 100) String mealType, List<Cafeteria> availableAt) {
		super();
		this.mealId = mealId;
		this.mealName = mealName;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.fats = fats;
		this.containsGluten = containsGluten;
		this.mealType = mealType;
		this.availableAt = availableAt;
	}


	private List<Cafeteria> availableAt;


	public Long getMealId() {
		return mealId;
	}


	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}


	public String getMealName() {
		return mealName;
	}


	public void setMealName(String mealName) {
		this.mealName = mealName;
	}


	public Double getProtein() {
		return protein;
	}


	public void setProtein(Double protein) {
		this.protein = protein;
	}


	public Double getCarbohydrates() {
		return carbohydrates;
	}


	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}


	public Double getFats() {
		return fats;
	}


	public void setFats(Double fats) {
		this.fats = fats;
	}


	public Boolean getContainsGluten() {
		return containsGluten;
	}


	public void setContainsGluten(Boolean containsGluten) {
		this.containsGluten = containsGluten;
	}


	public String getMealType() {
		return mealType;
	}


	public void setMealType(String mealType) {
		this.mealType = mealType;
	}


	public List<Cafeteria> getAvailableAt() {
		return availableAt;
	}


	public void setAvailableAt(List<Cafeteria> availableAt) {
		this.availableAt = availableAt;
	}


	@Override
	public String toString() {
		return "Meal [mealId=" + mealId + ", mealName=" + mealName + ", protein=" + protein + ", carbohydrates="
				+ carbohydrates + ", fats=" + fats + ", containsGluten=" + containsGluten + ", mealType=" + mealType
				+ ", availableAt=" + availableAt + "]";
	}
    
}
