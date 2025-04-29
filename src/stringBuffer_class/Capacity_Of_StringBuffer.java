package stringBuffer_class;

public class Capacity_Of_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println("Default Capacity of empty sb Object :- " + sb.capacity());
		sb.append("Krushna");
		System.out.println("Capacity of after adding less than 16 char in sb Object :- " + sb.capacity());
		sb.append("KrushnaLaxmanShahane");
		System.out.println("Capacity of after adding more than 16 char in sb Object :- " + sb.capacity());
		sb.append("KrushnaLaxmanShahaneKrushnaLaxmanShahane");
		System.out.println("Capacity of after adding more than 34 char in sb Object :- " + sb.capacity());
	}

}
