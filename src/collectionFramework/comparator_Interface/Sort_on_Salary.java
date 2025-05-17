package collectionFramework.comparator_Interface;

import java.util.Comparator;

//negative => no swap 
//positive =>  swap
public class Sort_on_Salary implements Comparator<Emp2> {

	@Override
	public int compare(Emp2 o1, Emp2 o2) {
		/*
		 * emps.add(new Emp(9, "sham",20000)); emps.add(new Emp(2, "gita",60000));
		 * emps.add(new Emp(6, "ram", 80000));
		 * 
		 * 
		 */
		// 60000 == 80000
		if (o1.getSal() == o2.getSal()) {
			return 0;
		}

		// 60000 > 80000
		else if (o1.getSal() > o2.getSal()) {
			return 1;
		} else {
			return -1;
		}

	}

}