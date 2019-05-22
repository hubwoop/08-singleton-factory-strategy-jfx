package ohm.softa.a08.filtering;

import java.security.InvalidParameterException;

public abstract class MealsFilterFactory {
	public MealsFilter getStragy(String key) {
		switch (key) {
			case "category":
				return new CategoryFilter();
			case "notes":
				return new NotesFilter();
			default:
				throw new InvalidParameterException();
		}
	}
}
