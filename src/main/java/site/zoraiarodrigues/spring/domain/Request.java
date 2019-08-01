package site.zoraiarodrigues.spring.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Request {
	private Long id; 
	private String subject;
	private String description;
	private Date creationDate;
	private RequestState state;
	private User user;
	private List<RequestState> stages = new ArrayList<RequestState>();
	
	public Request(Long id, String subject, String description, Date creationDate, RequestState state, User user,
			List<RequestState> stages) {
		super();
		this.id = id;
		this.subject = subject;
		this.description = description;
		this.creationDate = creationDate;
		this.state = state;
		this.user = user;
		this.stages = stages;
	}
	
	public Request(){
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public RequestState getState() {
		return state;
	}

	public void setState(RequestState state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<RequestState> getStages() {
		return stages;
	}

	public void setStages(List<RequestState> stages) {
		this.stages = stages;
	}


	
}
