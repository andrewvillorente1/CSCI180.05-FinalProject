package app.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    @NotNull
    @ManyToOne
    private User user;

    @NotNull
    @Size(max = 500)
    private String message;

    private Boolean isRead = false;

    
	public Notification(Long notificationId, @NotNull User user, @NotNull @Size(max = 500) String message,
			Boolean isRead) {
		super();
		this.notificationId = notificationId;
		this.user = user;
		this.message = message;
		this.isRead = isRead;
	}

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	@Override
	public String toString() {
		return "Notification [notificationId=" + notificationId + ", user=" + user + ", message=" + message
				+ ", isRead=" + isRead + "]";
	}

}
