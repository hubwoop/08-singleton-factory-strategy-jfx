package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;

public class NotesFilter extends FilterBase {
	private final String[] keywordsToExclude;

	protected NotesFilter(String... keyWordsToExclude) {
		this.keywordsToExclude = keyWordsToExclude;
	}

	@Override
	protected boolean include(Meal m) {

		return Arrays.stream(keywordsToExclude)
			.noneMatch(s -> m.getNotes().stream().anyMatch(s::equals));

	}
}
