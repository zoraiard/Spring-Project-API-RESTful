package site.zoraiarodrigues.spring.repositoy;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import site.zoraiarodrigues.spring.repository.RequestStageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RequestStageRepositoryTests {

	@Autowired private RequestStageRepository requestStageRepository
}
