package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class CaloriesGTComparator implements Comparator<Dish>{

	@Override
	public int compare(Dish arg0, Dish arg1) {
		return (int) (arg1.getCalories()-arg0.getCalories());
	}

}