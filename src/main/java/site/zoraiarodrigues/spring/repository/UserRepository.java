package site.zoraiarodrigues.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import site.zoraiarodrigues.spring.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query("SELECT FROM user where email=?1 AND password =?2")
	public Optional<User> login(String name, String password);
	
	public Optional<User> findByName(String name);
	
}
