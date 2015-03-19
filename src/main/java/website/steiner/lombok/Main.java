package website.steiner.lombok;

import java.time.LocalDate;

class Main {

	public static void main(String[] args) {
		Person person = new Person(LocalDate.of(1988, 1, 1));

		person.setName("Name");
		person.setSurname("Surname");
		
		System.out.println(person);
	}

}
