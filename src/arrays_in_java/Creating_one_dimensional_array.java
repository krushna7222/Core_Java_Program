package arrays_in_java;

//1D
//java => Array a,String s
//Array is a collection of elements of  same type
public class Creating_one_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a=23,b=67,c=12,d=2,g=21;
		// 0 1 2 3 4 5 6 7 //index
		int a[] = { 23, 67, 12, 2, 21, 6, 12, 44 }; // [size] => subcript notation

		System.out.println("accessing single element from the array : ");
		// System.out.println(a[2]); //12 //a of 2
		// System.out.println(a[6]);
		// System.out.println(a[1]);
		// System.out.println(a[12]); //Exception

		System.out.println("array length  = " + a.length);
		System.out.println("Accessing ALL elements");

		for (int i = 0; i < a.length; i++) // i=1// 0 to 7
		{
			System.out.println(a[i]); // 23,67

		}

		// String frnds[]= {"ram","sham","gita","riya"};
		// float marks[]= {56.4f,7.8f, 9.0f};
		// char msg[]= {'h','e','l','l','o'};
		// boolean data[]= {true,false,false,true,true};
	}

}