package site.zoraiarodrigues.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.zoraiarodrigues.spring.domain.RequestStage;
import site.zoraiarodrigues.spring.domain.enums.RequestState;

@Repository
public interface RequestStageRepository extends JpaRepository< RequestStage, Long>{
	
	public List<RequestStage> findAllByRequestId(Long id);
	
}
