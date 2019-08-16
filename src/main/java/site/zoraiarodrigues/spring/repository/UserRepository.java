package site.zoraiarodrigues.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import site.zoraiarodrigues.spring.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public Optional<User> findByName(String name);
	
	@Query("select u from user u where u.email = ?1 AND u.password = ?2")
	public Optional<User> login(String email, String password);
	   
}
