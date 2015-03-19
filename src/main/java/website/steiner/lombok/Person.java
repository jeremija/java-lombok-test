package website.steiner.lombok;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

/**
 * Created by jere on 19/03/15.
 */

public @Data class Person {

	private String name;
	private String surname;
	private @NonNull final LocalDate birthday;

}
