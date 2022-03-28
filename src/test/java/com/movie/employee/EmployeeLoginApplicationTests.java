package com.movie.employee;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = {EmployeeLoginApplication.class, H2JpaConfig.class})
@ActiveProfiles("test")
class EmployeeLoginApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

}
