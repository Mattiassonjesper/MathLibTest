package mattiasson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathsTest {

	Maths mathsTest = new Maths();

	// 1
	@Test
	public void lesserThanLongTest() {

		assertEquals(50L, mathsTest.lesserThanLong(50L, 100L));
	}

	// 2
	@Test
	public void lesserThanFloatTest() {

		assertEquals(0.005f, mathsTest.lesserThanFloat(0.005f, 0.1235f), 0.0055f);
	}

	// 3
	@Test
	public void lesserThanIntTest() {

		assertEquals(50, mathsTest.lesserThanInt(50, 100));
	}

	// 4
	@Test
	public void lesserThanDoubleTest() {
		assertEquals(50.0d, mathsTest.lesserThanDouble(50.0d, 100.0d), 5.0d);
	}

	// 5
	@Test
	public void biggerThanIntTest() {
		assertEquals(100, mathsTest.biggerThanInt(50, 100));
	}

	// 6
	@Test
	public void biggerThanDoubleTest() {
		assertEquals(100.0d, mathsTest.biggerThanDouble(50.0d, 100.0d), 5.0d);
	}

	// 7
	@Test
	public void biggerThanIntTest2() {
		assertEquals(100, mathsTest.biggerThanInt(50, 100));
	}

	// 8
	@Test
	public void biggerThanLongTest() {
		assertEquals(100L, mathsTest.biggerThanLong(50L, 100L));
	}

	// 9
	@Test
	public void expDoubleTest() {
		assertEquals(36.0d, mathsTest.expDouble(6.0d, 2.0d), 0.0d);
	}

	// 10
	@Test
	public void plusOneIntTest() {
		assertEquals(2147483647, mathsTest.plusOneInt(2147483646, 1));
	}

	// 11
	@Test
	public void plusOneLongTest() {
		assertEquals(9223372036854775807L, mathsTest.plusOneLong(9223372036854775806L, 1L));
	}

	// 12
	@Test
	public void minusOneIntTest() {
		assertEquals(-2147483648, mathsTest.minusOneInt(-2147483647, 1));
	}

	// 13
	@Test
	public void minusOneLongTest() {
		assertEquals(-9223372036854775808L, mathsTest.minusOneLong(-9223372036854775807L, 1L));
	}

	// 14
	@Test
	public void sqrtDoubleTest() {
		assertEquals(6.0d, mathsTest.sqrtDouble(36.0d), 0.0d);
	}

	// 15
	@Test
	public void cubeRootDoubleTest() {
		assertEquals(4.0d, mathsTest.cubeRootDouble(64.0d), 0.0d);
	}

	// bonus
	@Test
	public void randomDoubleTest() {
		assertEquals(5.0d, mathsTest.randomDouble(), 10.0d);
	}
}
