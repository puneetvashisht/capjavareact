import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cap.UserRepository;
import com.cap.WorkoutRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestUserRepository {
	
	@Autowired
	WorkoutRepository workoutRepository;
	
	@Autowired
	UserRepository userRepository;
	

	@Test
	public void testAssignWorkout() {
		
		// create application context
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		
//		// get bean from context
//		WorkoutRepository  workoutRepository = context.getBean(WorkoutRepository.class);
	
		// use it
		workoutRepository.assignWorkoutToUser();
	}
	
	
	@Test
	public void testAssignWorkoutAnother() {
		
		userRepository.findUserById();
		
		// create application context
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		
//		// get bean from context
//		WorkoutRepository  workoutRepository = context.getBean(WorkoutRepository.class);
	
		// use it
//		workoutRepository.anotherMethod();
	}

}
