package app.entities;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    @Size(max = 150)
    private String name;

    @NotNull
    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    private String yearAndCourse;

    private List<DietaryPreference> dietaryPreference;

	public User(Long userId, @NotNull @Size(max = 150) String name, @NotNull @Email String email,
			@NotNull String yearAndCourse, List<DietaryPreference> dietaryPreference) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.yearAndCourse = yearAndCourse;
		this.dietaryPreference = dietaryPreference;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getYearAndCourse() {
		return yearAndCourse;
	}

	public void setYearAndCourse(String yearAndCourse) {
		this.yearAndCourse = yearAndCourse;
	}

	public List<DietaryPreference> getDietaryPreference() {
		return dietaryPreference;
	}

	public void setDietaryPreference(List<DietaryPreference> dietaryPreference) {
		this.dietaryPreference = dietaryPreference;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", yearAndCourse=" + yearAndCourse
				+ ", dietaryPreference=" + dietaryPreference + "]";
	}

}
