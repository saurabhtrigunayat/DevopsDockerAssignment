package com.nagarro;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DevopsAssignmentsApplicationTests {

	private Calculator c = new Calculator();

	@Test
	void testSum() {
		int expectedResult = 17;
		int actualResult = c.doSum(12, 3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct() {
		int expectedResult = 6;
		int actualResult = c.doProduct(3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testdoSubtraction() {
		int expectedResult = 5;
		int actualResult = c.doSubtraction(10, 5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testCompareNums() {
		boolean actualResult = c.compareTwoNums(3, 3);
		assertThat(actualResult).isTrue();
	}

}
