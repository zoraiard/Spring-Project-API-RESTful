package site.zoraiarodrigues.spring.repositoy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import site.zoraiarodrigues.spring.domain.User;
import site.zoraiarodrigues.spring.domain.enums.Role;
import site.zoraiarodrigues.spring.repository.UserRepository;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
public class UserRepositoryTests {
	
	@Autowired private UserRepository userRepository;
	
	@Test
	public void AsaveTest() {
		User user = new User(null,  "Zoraia Rodrigues", "zoraiarodrigues@gmail.com", "159753", Role.ADMINISTRATOR, null, null);
		User createdUser = userRepository.save( user);
		assertThat(createdUser.getId()).isEqualTo(1L); 
	}
	
	@Test
	public void updateTest() {
		User user = new User(1L, "Zoraia Rodrigues Dantas", "zoraiarodrigues@gmail.com", "159753", Role.ADMINISTRATOR, null, null);
		User updateUser = userRepository.save(user);
		assertThat(updateUser.getName()).isEqualTo("Zoraia Rodrigues Dantas"); 
	}
	
	@Test
	public void getByIdTest() {
		Optional<User> updateUser = userRepository.findById(1L);
		User user = updateUser.get();		
		assertThat(user.getPassword()).isEqualTo("159753"); 
	}
	
	@Test
	public void listTest() {
		List<User> users = userRepository.findAll();
		assertThat(users.size()).isEqualTo(1);
	}
	
	@Test
	public void loginTest() {
		
	  Optional<User> optionalUser = userRepository.login2("zoraiarodrigues@gmail.com", "159753");
		User loggedUser = optionalUser.get();
		assertThat(loggedUser.getId()).isEqualTo(1L); 
	}

}
