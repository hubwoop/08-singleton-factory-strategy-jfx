package ohm.softa.a08.filtering;

public class MealsFilterFactory {
	public MealsFilter getStrategy(String key) {
		switch (key) {
			case "Vegetarian":
				return new CategoryFilter(true, "vegetarisch", "vegan", "sonstiges");
			case "No soy":
				return new NotesFilter("soja");
			case "No pork":
				return new CategoryFilter(false, "schwein");
			default:
				return new NoFilter();
		}
	}
}
