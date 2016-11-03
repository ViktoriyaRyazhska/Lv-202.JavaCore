package com.ss;

import java.util.Comparator;

public class MedicineNameComporator implements Comparator<Medicine> {

	@Override
	public int compare(Medicine o1, Medicine o2) {
		return o1.getName().compareTo(o2.getName());

		// Integer amount1 = new Integer(o1.getAmount());
		// Integer amount2 = new Integer(o2.getAmount());
		// return amount1.compareTo(amount2);
	}

}
