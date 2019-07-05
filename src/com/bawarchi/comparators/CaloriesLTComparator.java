package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class CaloriesLTComparator implements Comparator<Dish>{

	@Override
	public int compare(Dish arg0, Dish arg1) {
		return (int) (arg0.getCalories()-arg1.getCalories());
	}

}
