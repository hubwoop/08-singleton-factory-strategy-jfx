package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

public abstract class FilterBase implements MealsFilter{
	protected abstract boolean include(Meal m);
}
