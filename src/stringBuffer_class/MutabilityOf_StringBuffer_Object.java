package stringBuffer_class;

public class MutabilityOf_StringBuffer_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);

		System.out.println(sb.append("session"));
		System.out.println(sb);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb);

	}

}
