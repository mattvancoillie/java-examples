/*
 * Copyright (C) 2015 Andrea Binello ("andbin")
 *
 * This file is part of the "Java Examples" project and is licensed under the
 * MIT License. See one of the license files included in the root of the project
 * for the full text of the license.
 */

// This interface defines the filter contract for the SearchableListModel class.

public interface SearchableListFilter<T> {
	boolean accept(T item);
}