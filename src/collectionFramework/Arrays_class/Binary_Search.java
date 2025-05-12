package collectionFramework.Arrays_class;

//Program to perform binary search
//to perform binary search your array should always be sorted in ascending order
//binary search is the searching algo,

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6; // 0 1 2 3 4 5 6
		int a[] = { 2, 4, 6, 7, 20, 21, 31 };
		// r

		int l = 0, r = n - 1, search = 20, mid, i;

		while (l <= r) {
			// 3+5/2 = 4
			mid = (l + r) / 2; // mid=2
			// 21 ==21
			if (search == a[mid]) {
				System.out.println("element " + search + " is present at " + mid + " position..."); // 2
				break;
			}
			// 21 < 6
			else if (search < a[mid]) {
				r = mid - 1; // mid=2
			} else {
				l = mid + 1; // l=1

			}
		} // while close
			// 5>4
		if (l > r)
			System.out.println("Not found! " + search + " is not present in the list.\n");

	}

}
