package site.zoraiarodrigues.spring.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long id;
	private String name;
	private String password;
	private List<Request> requests = new ArrayList<Request>();
	private List<RequestState> stages = new ArrayList<RequestState>();
			
	public User(Long id, String name, String password, List<Request> requests) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.requests = requests;
	}
	
	public User(){
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

	public List<RequestState> getStages() {
		return stages;
	}

	public void setStages(List<RequestState> stages) {
		this.stages = stages;
	}
	

}
