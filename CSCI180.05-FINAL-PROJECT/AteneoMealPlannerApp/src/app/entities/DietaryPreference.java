package app.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class DietaryPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preferenceId;

    @NotNull
    @Size(max = 100)
    private String dietaryName;

    @Size(max = 500)
    private String description;

    @Size(max = 500)
    private String nutritionalInformation;

    
	public DietaryPreference(Long preferenceId, @NotNull @Size(max = 100) String dietaryName,
			@Size(max = 500) String description, @Size(max = 500) String nutritionalInformation) {
		super();
		this.preferenceId = preferenceId;
		this.dietaryName = dietaryName;
		this.description = description;
		this.nutritionalInformation = nutritionalInformation;
	}

	public Long getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(Long preferenceId) {
		this.preferenceId = preferenceId;
	}

	public String getDietaryName() {
		return dietaryName;
	}

	public void setDietaryName(String dietaryName) {
		this.dietaryName = dietaryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNutritionalInformation() {
		return nutritionalInformation;
	}

	public void setNutritionalInformation(String nutritionalInformation) {
		this.nutritionalInformation = nutritionalInformation;
	}

	@Override
	public String toString() {
		return "DietaryPreference [preferenceId=" + preferenceId + ", dietaryName=" + dietaryName + ", description="
				+ description + ", nutritionalInformation=" + nutritionalInformation + "]";
	}


}
