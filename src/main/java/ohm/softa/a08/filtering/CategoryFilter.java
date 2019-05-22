package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.List;

public class CategoryFilter extends FilterBase {

	@Override
	protected boolean include(Meal m) {
		return false;
	}

	@Override
	public List<Meal> filter(List<Meal> meals) {
		return null;
	}

}
