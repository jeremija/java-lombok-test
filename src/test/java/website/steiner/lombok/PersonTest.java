package website.steiner.lombok;

import org.junit.Test;

import java.time.LocalDate;

import static junit.framework.TestCase.*;

public class PersonTest {

	@Test(expected = NullPointerException.class)
	public void person_constructor_should_throw_when_date_null() {
		new Person(null);
	}

	@Test
	public void person_equals_should_work() {
		// given
		Person person1, person2, person3;

		// when
		person1 = new Person(LocalDate.of(1988, 5, 5));
		person2 = new Person(LocalDate.of(1988, 5, 5));
		person3 = new Person(LocalDate.of(1988, 5, 5));
		person3.setName("first name");

		// then
		assertEquals(person1, person2);
		assertFalse(person2.equals(person3));
	}

}
