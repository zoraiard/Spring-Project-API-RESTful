package site.zoraiarodrigues.spring.repositoy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import site.zoraiarodrigues.spring.domain.Request;
import site.zoraiarodrigues.spring.domain.User;
import site.zoraiarodrigues.spring.domain.enums.RequestState;
import site.zoraiarodrigues.spring.repository.RequestRepository;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest 
public class RequestRepositoryTests {

  @Autowired private RequestRepository requestRepository;   

  @Test
  public void saveText() {
	  User owner = new User();
	  owner.setId(1L);
	  
	  Request request = new Request(null, "Novo Laptop HP", "Pretendo obter um laptop HP,  ", new Date(), RequestState.OPEN, owner, null);
	  
	  Request createdRequest = requestRepository.save(request);
	    
	  assertThat(createdRequest.getId()).isEqualTo(1L);
  }
 
  @Test
  public void updateText() {
	  
	  User owner = new User();
	  owner.setId(1L);
	  
	  Request request = new Request(1L, "Novo Laptop HP", "Pretendo obter um laptop HP, de RAM 16 GB", null, RequestState.OPEN, owner, null);
	                                     
	  Request updateRequest = requestRepository.save(request);
	  
	  requestRepository.save(request);
	  
	  assertThat(updateRequest.getDescription()).isEqualTo("Pretendo obter um laptop HP, de RAM 16 GB");
	  
  }
  /*
  @Test
  public void getByIdText(){
	  Optional<Request> optionalRequest = requestRepository.findById(1L);
	  Request request = optionalRequest.get();
	  
	  assertThat(request.getSubject()).isEqualTo("Novo Laptop HP");
  }
  
  @Test
  public void listText(){	  
	  List<Request> requests = requestRepository.findAll();
	  assertThat(requests.size()).isEqualTo(1);	  
  }  
  
  @Test
  public void listByOwnerIdText(){	  
	  List<Request> requests = requestRepository.findAllByOwnerId(1L);
	  assertThat(requests.size()).isEqualTo(1);	  
  }  
  
*/
}
