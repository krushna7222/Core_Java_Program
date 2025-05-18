package collectionFramework.calendar_class;

import java.util.Calendar;

public class Calendar_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance(); // Calendar is an abstract class and hence we cannot create an object of
												// it directly..so the Calendar.getInstance() method returns an object
												// of Calendar class

		System.out.println(cal.getTime());
		// System.out.println(cal.getTimeInMillis());

		/*
		 * //1.add cal.add(Calendar.DATE, 5); System.out.println(cal.getTime());
		 */

		// 2.add
		// cal.add(Calendar.DATE, -15);
		// System.out.println(cal.getTime());

		// cal.add(Calendar.DATE, -15);
		// System.out.println(cal.getTime());

		// cal.add(Calendar.MONTH, 4);
		// System.out.println(cal.getTime());

		// cal.add(Calendar.YEAR, -15);
		// System.out.println(cal.getTime());

		// cal.add(Calendar.HOUR, 3 );
		// System.out.println(cal.getTime());

		// System.out.println(cal.get(Calendar.DATE));

		// System.out.println(cal.get(Calendar.MONTH));

		// System.out.println(cal.get(Calendar.YEAR));

		// System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //28

		// System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //sun=1,mon=2,.... sat=7

		// System.out.println(cal.get(Calendar.DAY_OF_YEAR));

		// System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //4 => it
		// calculates the no of sundays that are spent in current month till current
		// date

		// System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); //5 => weeks spent in
		// current month

		// System.out.println(cal.get(Calendar.HOUR_OF_DAY));

		// System.out.println(cal.get(Calendar.MINUTE));

		// System.out.println(cal.getMinimum(Calendar.DATE)); //1
		// System.out.println(cal.getMaximum(Calendar.DATE)); //31

		// System.out.println(cal.getMinimum(Calendar.MONTH)); //0
		// System.out.println(cal.getMaximum(Calendar.MONTH)); //11

		// System.out.println(cal.getMinimum(Calendar.DAY_OF_YEAR)); //1
		// System.out.println(cal.getMaximum(Calendar.DAY_OF_YEAR)); //366

		// System.out.println(cal.getMinimum(Calendar.HOUR)); //1
		// System.out.println(cal.getMaximum(Calendar.HOUR)); //366

		// System.out.println(cal.getMinimum(Calendar.WEEK_OF_MONTH)); //1
		// System.out.println(cal.getMaximum(Calendar.WEEK_OF_MONTH)); //6

		// System.out.println(cal.getAvailableCalendarTypes());
		// System.out.println(cal.getCalendarType());

		System.out.println(cal.getMinimum(Calendar.MINUTE)); // 1
		System.out.println(cal.getMaximum(Calendar.MINUTE)); // 6

	}

}