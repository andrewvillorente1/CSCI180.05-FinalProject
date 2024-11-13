package app.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Cafeteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cafeteriaId;

    @NotNull
    @Size(max = 100)
    private String cafeteriaName;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    @NotNull
    @Size(max = 100)
    private String operatingHours;

    
	public Cafeteria(Long cafeteriaId, @NotNull @Size(max = 100) String cafeteriaName, @NotNull Double latitude,
			@NotNull Double longitude, @NotNull @Size(max = 100) String operatingHours) {
		super();
		this.cafeteriaId = cafeteriaId;
		this.cafeteriaName = cafeteriaName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.operatingHours = operatingHours;
	}

	public Long getCafeteriaId() {
		return cafeteriaId;
	}

	public void setCafeteriaId(Long cafeteriaId) {
		this.cafeteriaId = cafeteriaId;
	}

	public String getCafeteriaName() {
		return cafeteriaName;
	}

	public void setCafeteriaName(String cafeteriaName) {
		this.cafeteriaName = cafeteriaName;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	@Override
	public String toString() {
		return "Cafeteria [cafeteriaId=" + cafeteriaId + ", cafeteriaName=" + cafeteriaName + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", operatingHours=" + operatingHours + "]";
	}


}
