package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class PriceLTComparator implements Comparator<Dish>{

	@Override
	public int compare(Dish arg0, Dish arg1) {
		return (int) (arg0.getPrice()-arg1.getPrice());
	}

}